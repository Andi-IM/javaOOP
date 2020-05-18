/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pja18_30042020.dao.AnggotaDao;
import pja18_30042020.dao.BukuDao;
import pja18_30042020.dao.PeminjamanDao;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.AnggotaModel;
import pja18_30042020.model.BukuModel;
import pja18_30042020.model.PeminjamanModel;
import pja18_30042020.view.FormPeminjaman;


/**
 *
 * @author Andi
 */
public class PeminjamanController {
    FormPeminjaman view;
    PeminjamanModel peminjaman;
    PeminjamanDao peminjamanDao;
    Connection con;
    Koneksi k;
    
    public PeminjamanController(FormPeminjaman view)
    {
        this.view = view;
        peminjamanDao = new PeminjamanDao();
        k = new Koneksi();
        try {
            con = k.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }
    
    public void insert()
    {
        peminjaman = new PeminjamanModel();
        peminjaman.setKodeanggota(view.getTxtKodeanggota().getText());
        peminjaman.setKodebuku(view.getTxtKodebuku().getText());
        peminjaman.setTglpinjam(view.getTxtTanggalpinjam().getText());
        peminjaman.setTglkembali(view.getTxtTanggalkembali().getText());
        
        try {
            peminjamanDao.create(peminjaman);
            JOptionPane.showMessageDialog(null, "InsertOK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error : " + e.getMessage());
        }
    }
    
    public void update()
    {
        peminjaman = new PeminjamanModel();
        peminjaman.setKodeanggota(view.getTxtKodeanggota().getText());
        peminjaman.setKodebuku(view.getTxtKodebuku().getText());
        peminjaman.setTglpinjam(view.getTxtTanggalpinjam().getText());
        peminjaman.setTglkembali(view.getTxtTanggalkembali().getText());
        
        try {
            peminjamanDao.update(peminjaman);
            JOptionPane.showMessageDialog(view, "Update Ok");
        } catch (Exception e) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    public void delete()
    {
        String kodeanggota = view.getTxtKodeanggota().getText();
        String kodebuku = view.getTxtKodebuku().getText();
        String tglpinjam = view.getTxtTanggalpinjam().getText();
        try {
            peminjamanDao.delete(kodeanggota, kodebuku, tglpinjam);
            DefaultTableModel model = (DefaultTableModel) view.getTblPinjam().getModel();
            model.setRowCount(0);
            isiTable();
            JOptionPane.showMessageDialog(null, "Deleted!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        this.clear();
    }
    
    public void clear()
    {
        view.getTxtKodeanggota().setText(null);
        view.getTxtKodebuku().setText(null);
        view.getTxtTanggalpinjam().setText(null);
        view.getTxtTanggalkembali().setText(null);
    }
    
    public void isiTable()
    {
        try {
            DefaultTableModel model = (DefaultTableModel)
                    view.getTblPinjam().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "select * from peminjaman");
            while(rs.next()){
                Object data[]={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    public void onKeyPressKodeAnggota()
    {
        try {
            AnggotaDao anggotadao = new AnggotaDao();
            AnggotaModel anggota = anggotadao.getAnggota(
                            view.getTxtKodeanggota().getText());
            if (anggota!=null) {
                view.getTxtNamaanggota().setText(anggota.getNama());
                view.getTxtKodebuku().requestFocus();
            } else {
                JOptionPane.showMessageDialog(view, "Data Tidak Ada!");
            }
        } catch (Exception e) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    public void onKeyPressKodeBuku()
    {
        BukuDao bukudao = new BukuDao();
        try {
            BukuModel buku = bukudao.getBuku(view.getTxtKodebuku().getText());
            if (buku!=null) {
                view.getTxtJudulbuku().setText(buku.getJudulbuku());
                view.getTxtTanggalpinjam().requestFocus();
            } else {
                JOptionPane.showMessageDialog(view, "Data Tidak Ada!");
            }
        } catch (Exception e) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}

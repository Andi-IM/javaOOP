/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.controller;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import pja18_30042020.dao.AnggotaDaoImpl;
import pja18_30042020.dao.BukuDaoImpl;
import pja18_30042020.dao.PeminjamanDaoImpl;
import pja18_30042020.dao.PengembalianDaoImpl;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.PeminjamanModel;
import pja18_30042020.view.FormPengembalian;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pja18_30042020.model.AnggotaModel;
import pja18_30042020.model.BukuModel;
/**
 *
 * @author Andi
 */
public class PengembalianController {
    private FormPengembalian view;
    private Koneksi k;
    private Connection con;
    AnggotaDaoImpl anggotaDao;
    AnggotaModel anggota;
    BukuDaoImpl bukuDao;
    BukuModel buku;
    PeminjamanDaoImpl peminjamanDao;
    PengembalianDaoImpl pengembalian;
    private PeminjamanModel peminjaman;
    String dateNow;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

    public PengembalianController(FormPengembalian view) {
        this.view = view;
        k = new Koneksi();
        con = k.getConnection();
        //anggotaDao.create(anggota);
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalian = new PengembalianDaoImpl();
        peminjaman = new PeminjamanModel();
        dateNow = format.format(new Date());
    }

    public void viewTanggal(){
        view.getTxtDikembalikan().setText(dateNow);
    }
    
    public void onKeyPressKodeAnggota(){
        try {
            anggotaDao = new AnggotaDaoImpl();
            anggota =  anggotaDao.getAnggota(view.getTxtKodeAnggota().getText());
            if (anggota != null) {
                view.getTxtNamaAnggota().setText(anggota.getNama());
                view.getTxtKodeBuku().requestFocus();
            } else {
                JOptionPane.showMessageDialog(view, "Data tidak ada");
            }
        } catch (SQLException e) {
            Logger.getLogger(AnggotaController.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }
    
    public void onKeyPressKodeBuku()
    {
        try {
            bukuDao = new BukuDaoImpl();
            buku = bukuDao.getBuku(view.getTxtKodeBuku().getText());
            if (buku!=null) {
                view.getTxtJudulBuku().setText(buku.getJudulbuku());
                view.getTxtTglPinjam().requestFocus();
            } else {
                JOptionPane.showMessageDialog(view, "Data Tidak Ada!");
            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(AnggotaController.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }
}

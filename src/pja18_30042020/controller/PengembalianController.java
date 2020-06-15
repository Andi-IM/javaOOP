/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.controller;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
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
import javax.swing.table.DefaultTableModel;
import pja18_30042020.model.AnggotaModel;
import pja18_30042020.model.BukuModel;
import pja18_30042020.model.PengembalianModel;
/**
 *
 * @author Andi
 */
public class PengembalianController {
    private final FormPengembalian view;
    private final Koneksi k;
    private final Connection con;
    AnggotaDaoImpl anggotaDao;
    AnggotaModel anggota;
    BukuDaoImpl bukuDao;
    BukuModel buku;
    PeminjamanDaoImpl peminjamanDao;
    PengembalianDaoImpl pengembalianDao;
    private PengembalianModel pengembalian;
    private PeminjamanModel peminjaman;
    String dateNow;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

    public PengembalianController(FormPengembalian view) {
        this.view = view;
        k = new Koneksi();
        con = k.getConnection();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalianDao = new PengembalianDaoImpl();
        peminjaman = new PeminjamanModel();
        dateNow = java.time.LocalDate.now().toString();
    }

    public void viewTanggal(){
        view.getTxtDikembalikan().setText(java.time.LocalDate.now().toString());
        System.out.println(new Date());
        System.out.println(java.time.LocalDate.now());  
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
    
    public void onKeyPressTanggalPinjam()
    {
        try {
            peminjaman = peminjamanDao.getPeminjam(
            view.getTxtKodeAnggota().getText(),
            view.getTxtKodeBuku().getText(),
            view.getTxtTglPinjam().getText()
            );
            if (peminjaman != null) {
                view.getTxtTglKembali().setText(peminjaman.getTglkembali());
                view.getTxtDikembalikan().requestFocus();
            } else {
                JOptionPane.showMessageDialog(view, "Tidak Ada Data");
            } 
        }catch (HeadlessException | SQLException e) {
                Logger.getLogger(AnggotaController.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
                }
        
    }
    
       
    public void onKeypressTanggalDikembalikan(){
        try {
            String tglKembali = view.getTxtTglKembali().getText();
            int terlambat = pengembalianDao.getKurangTanggal((com.mysql.jdbc.Connection) con, dateNow, tglKembali);
            
            if (terlambat <= 0) {
                terlambat = 0;
            }
            double denda = terlambat * 500;
            
            view.getTxtTerlambat().setText(terlambat +" hari");
            view.getTxtDenda().setText("Rp."+denda);
        } catch (SQLException e) {
                Logger.getLogger(AnggotaController.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }
    
    public void isiTablePemimnjaman(){
        try {
            DefaultTableModel model = (DefaultTableModel)
                    view.getTblPeminjaman().getModel();
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
        } catch (SQLException e) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    public void isiTablePengembalian(){
        try {
            DefaultTableModel model = (DefaultTableModel)
                    view.getTblPengembalian().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "select * from pengembalian");
            while(rs.next()){
                Object data[]={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                };
                model.addRow(data);
            }
        } catch (SQLException e) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    public void insert()
    {
        String Kode = view.getTxtKodeAnggota().getText();
        String KodeBuku = view.getTxtKodeBuku().getText();
        String TglPinjam = view.getTxtTglPinjam().getText();
        
        pengembalian = new PengembalianModel();
        pengembalian.setKodeAnggota(Kode);
        pengembalian.setKodeBuku(KodeBuku);
        pengembalian.setTglPinjam(TglPinjam);
        pengembalian.setTglKembali(view.getTxtTglKembali().getText());
        pengembalian.setTglDikembalikan(view.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(Integer.parseInt(view.getTxtTerlambat().getText().substring(0, 1)));
        pengembalian.setDenda(Double.parseDouble(view.getTxtDenda().getText().substring(3)));
        
        try {
            pengembalianDao.create(pengembalian);
            peminjamanDao.delete(Kode, KodeBuku, TglPinjam);
            //clear();
            JOptionPane.showMessageDialog(null, "InsertOK");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error : " + e.getMessage());
        }
    }
    
     public void delete()
    {
        String kodeanggota = view.getTxtKodeAnggota().getText();
        String kodebuku = view.getTxtKodeBuku().getText();
        String tglpinjam = view.getTxtTglPinjam().getText();
        try {
            pengembalianDao.delete(kodeanggota, kodebuku, tglpinjam);
            
            peminjaman = new PeminjamanModel();
            peminjaman.setKodeanggota(kodeanggota);
            peminjaman.setKodebuku(kodebuku);
            peminjaman.setTglpinjam(tglpinjam);
            peminjaman.setTglkembali(dateNow);
            peminjamanDao.create(peminjaman);
            
            DefaultTableModel model = (DefaultTableModel) view.getTblPengembalian().getModel();
            model.setRowCount(0);
            
            JOptionPane.showMessageDialog(null, "Deleted!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        this.clear();
    }
     
     public void clear()
    {
        view.getTxtKodeAnggota().setText(null);
        view.getTxtNamaAnggota().setText(null);
        view.getTxtKodeBuku().setText(null);
        view.getTxtJudulBuku().setText(null);
        view.getTxtTglPinjam().setText(null);
        view.getTxtTglKembali().setText(null);
        view.getTxtTerlambat().setText(null);
        view.getTxtDenda().setText(null);
    } 
     
    public void onClickTablePeminjaman(){
        peminjamanDao = new PeminjamanDaoImpl();
        bukuDao = new BukuDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        
        String Kode = view.getTblPeminjaman().getValueAt(
            view.getTblPeminjaman().getSelectedRow(),0).toString();
        String KodeBuku = view.getTblPeminjaman().getValueAt(
                view.getTblPeminjaman().getSelectedRow(),1).toString();
        String TglPinjam = view.getTblPeminjaman().getValueAt(
                view.getTblPeminjaman().getSelectedRow(),2).toString();
        
        try {
            peminjaman = peminjamanDao.getPeminjam(Kode, KodeBuku, TglPinjam);
            
            view.getTxtKodeAnggota().setText(peminjaman.getKodeanggota());
            view.getTxtNamaAnggota().setText(anggotaDao.getAnggota(view.getTxtKodeAnggota().getText()).getNama());
            view.getTxtKodeBuku().setText(peminjaman.getKodebuku());
            view.getTxtJudulBuku().setText(bukuDao.getBuku(view.getTxtKodeBuku().getText()).getJudulbuku());
            view.getTxtTglPinjam().setText(peminjaman.getTglpinjam());
            view.getTxtTglKembali().setText(peminjaman.getTglkembali());
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(view, "Error : "+e);
        }
    }
    
    public void onClickTablePengembalian(){
        pengembalianDao = new PengembalianDaoImpl();
        bukuDao = new BukuDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        
        String Kode = view.getTblPengembalian().getValueAt(
                view.getTblPengembalian().getSelectedRow(),0).toString();
        String KodeBuku = view.getTblPengembalian().getValueAt(
                view.getTblPengembalian().getSelectedRow(),1).toString();
        String TglPinjam = view.getTblPengembalian().getValueAt(
                view.getTblPengembalian().getSelectedRow(),2).toString();
        
        try {
            pengembalian = pengembalianDao.getKembali(Kode,KodeBuku,TglPinjam);
            view.getTxtKodeAnggota().setText(pengembalian.getKodeAnggota());
            view.getTxtNamaAnggota().setText(anggotaDao.getAnggota(view.getTxtKodeAnggota().getText()).getNama());
            view.getTxtKodeBuku().setText(pengembalian.getKodeBuku());
            view.getTxtJudulBuku().setText(bukuDao.getBuku(view.getTxtKodeBuku().getText()).getJudulbuku());
            view.getTxtTglPinjam().setText(pengembalian.getTglPinjam());
            view.getTxtTglKembali().setText(pengembalian.getTglKembali());
            view.getTxtDikembalikan().setText(pengembalian.getTglDikembalikan());
            view.getTxtTerlambat().setText(String.valueOf(pengembalian.getTerlambat()));
            view.getTxtDenda().setText(String.valueOf(pengembalian.getDenda()));
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Error : "+e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.AnggotaModel;

/**
 *
 * @author PC-01
 */
public class AnggotaDao {

    Connection con;

    public AnggotaDao() {
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }

    public void create(AnggotaModel anggota) throws SQLException {
        String sql = "insert into Anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJekel());
        ps.executeUpdate();
    }

    public void update(AnggotaModel anggota) throws SQLException {
        String sql = "update anggota set namaanggota=?, alamat=?, jekel=? "
                + "where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, anggota.getKode());
        ps.setString(1, anggota.getNama());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3, anggota.getJekel());
        ps.executeUpdate();
    }

    public void delete(String kode) throws SQLException {
        String sql = "delete from anggota where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ps.executeUpdate();
    }

    public AnggotaModel getAnggota(String kode) throws SQLException {
        String sql = "select * from anggota where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        AnggotaModel anggota = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            anggota = new AnggotaModel();
            anggota.setKode(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJekel(rs.getString(4));
        }
        return anggota;
    }

    public List<AnggotaModel> getAllAnggota(Connection con) throws SQLException {
        String sql = "select * from anggota";
        PreparedStatement ps = con.prepareStatement(sql);
        AnggotaModel anggota;
        List<AnggotaModel> list = new ArrayList<AnggotaModel>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            anggota = new AnggotaModel();
            anggota.setKode(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJekel(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }

    public static void main(String[] args) {
        AnggotaDao dao = new AnggotaDao();
        //Insert Data
//        AnggotaModel anggota = new AnggotaModel();
//        anggota.setKode("A003");
//        anggota.setNama("Ali");
//        anggota.setAlamat("Padang Panjang");
//        anggota.setJekel("L");
//        try {
//            dao.create(anggota);
//            javax.swing.JOptionPane.showMessageDialog(null, "insert Ok");
//        } catch (Exception ex) {
//            javax.swing.JOptionPane.showMessageDialog(null,
//                    "Error " + ex.getMessage());
//        }
        
        //Update Data
//        AnggotaModel anggota = new AnggotaModel();
//        anggota.setKode("A001");
//        anggota.setNama("Alin");
//        anggota.setAlamat("Padang Panjang");
//        anggota.setJekel("L");
//        try {
//            dao.update(anggota);
//            javax.swing.JOptionPane.showMessageDialog(null, "update Ok");
//        }catch(Exception ex){
//            javax.swing.JOptionPane.showMessageDialog(null, 
//                    "Error " + ex.getMessage());
//        }
        
        //Select Data

//        try {
//            AnggotaModel anggota = new AnggotaModel();
//            anggota = dao.getAnggota("A001");
//            if (anggota != null) {
//                System.out.println(anggota.getKode());
//                System.out.println(anggota.getNama());
//                System.out.println(anggota.getAlamat());
//                System.out.println(anggota.getJekel());
//                
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Data Kosong");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        
        AnggotaModel anggota = new AnggotaModel();
      
        try {
            dao.delete("A001");
            javax.swing.JOptionPane.showMessageDialog(null, "DELETE Ok");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Error " + ex.getMessage());
        }
    }

}

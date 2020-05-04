/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.AnggotaModel;

/**
 *
 * @author Andi
 */
public class AnggotaDao {
    Connection con;

    public AnggotaDao() {
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
    public void create(AnggotaModel anggota) throws SQLException {
        String sql="INSERT INTO anggota VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJekel());
        ps.executeUpdate();
    }
    
    public void update(AnggotaModel anggota) throws SQLException {
        String sql="UPDATE anggota SET namaanggota=?, alamat=?, jekel=? "
                +"WHERE kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJekel());
        ps.executeUpdate();
    }
    
    public void delete(String kode) throws SQLException {
        String sql = "DELETE FROM anggota WHERE kodeanggota=?";
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
    
    public static void main(String[] args) {
        AnggotaDao dao = new AnggotaDao();
        AnggotaModel anggota = new AnggotaModel();
        anggota.setKode("A002");
        anggota.setNama("Ali");
        anggota.setAlamat("Padang Panjang");
        anggota.setJekel("L");
        try {
            dao.update(anggota);
            javax.swing.JOptionPane.showMessageDialog(null, "アプデートOK！");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
}

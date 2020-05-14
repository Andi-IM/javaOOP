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
import pja18_30042020.model.BukuModel;
/**
 *
 * @author Andi
 */
public class BukuDao {
    Connection con;

    public BukuDao() {
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
     public void create(BukuModel buku) throws SQLException {
        String sql = "insert into buku values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKode());
        ps.setString(2, buku.getJudul());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getTahun());
        ps.executeUpdate();
    }

    public void update(BukuModel buku) throws SQLException {
        String sql = "update buku set judul=?, pengarang=?, tahun=? "
                + "where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, buku.getKode());
        ps.setString(1, buku.getJudul());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getTahun());
        ps.executeUpdate();
    }

    public void delete(String kode) throws SQLException {
        String sql = "delete from buku where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ps.executeUpdate();
    }

    public BukuModel getAnggota(String kode) throws SQLException {
        String sql = "select * from buku where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        BukuModel buku = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            buku = new BukuModel();
            buku.setKode(rs.getString(1));
            buku.setJudul(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setTahun(rs.getString(4));
        }
        return buku;
    }

    public List<BukuModel> getAllAnggota(Connection con) throws SQLException {
        String sql = "select * from buku";
        PreparedStatement ps = con.prepareStatement(sql);
        BukuModel buku;
        List<BukuModel> list = new ArrayList<BukuModel>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            buku = new BukuModel();
            buku.setKode(rs.getString(1));
            buku.setJudul(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setTahun(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}

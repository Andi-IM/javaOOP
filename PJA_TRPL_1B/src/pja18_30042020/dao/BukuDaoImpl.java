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
public class BukuDaoImpl implements BukuDao{
    Connection con;

    public BukuDaoImpl() {
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }

    @Override
    public void create(BukuModel buku) throws SQLException {
        String sql = "insert into buku values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getTahun());
        ps.executeUpdate();
    }

    @Override
    public void update(BukuModel buku) throws SQLException {
        String sql = "update buku set judul=?, pengarang=?, tahun=? "
                + "where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, buku.getKodebuku());
        ps.setString(1, buku.getJudulbuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getTahun());
        ps.executeUpdate();
    }

    @Override
    public void delete(String kode) throws SQLException {
        String sql = "delete from buku where kodebuku=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ps.executeUpdate();
    }

    @Override
    public BukuModel getBuku(String kode) throws SQLException {
        String sql = "select * from buku where kodebuku=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        BukuModel buku = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            buku = new BukuModel();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setTahun(rs.getString(4));
        }
        return buku;
    }

    @Override
    public List<BukuModel> getAllBuku(Connection con) throws SQLException {
        String sql = "select * from buku";
        PreparedStatement ps = con.prepareStatement(sql);
        BukuModel buku;
        List<BukuModel> list = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            buku = new BukuModel();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setTahun(rs.getString(4));
            list.add(buku);
        }
        return list;
    } 
}

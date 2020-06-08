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
    import pja18_30042020.model.PeminjamanModel;
/**
 *
 * @author Andi
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    Connection con;

    public PeminjamanDaoImpl() {
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }

    @Override
    public void create(PeminjamanModel Peminjaman) throws SQLException {
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, Peminjaman.getKodeanggota());
        ps.setString(2, Peminjaman.getKodebuku());
        ps.setString(3, Peminjaman.getTglpinjam());
        ps.setString(4, Peminjaman.getTglkembali());
        ps.executeUpdate();
    }

    @Override
    public void update(PeminjamanModel Peminjaman) throws SQLException {
        String sql = "update Peminjaman set tglkembali=? "
                + "where kodeanggota=?"
                + "and kodebuku=? "
                + "and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(2, Peminjaman.getKodeanggota());
        ps.setString(3, Peminjaman.getKodebuku());
        ps.setString(4, Peminjaman.getTglpinjam());
        ps.setString(1, Peminjaman.getTglkembali());
        ps.executeUpdate();
    }

    @Override
    public void delete(String kode, String kodebuku, String tglpinjam) throws SQLException {
        String sql = "delete from Peminjaman where kodeanggota=? "
                    +"and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ps.executeUpdate();
    }

    @Override
    public PeminjamanModel getPeminjam(String kodeanggota, String kodebuku, String tglpinjam ) throws SQLException {
        String sql = "select * from Peminjaman where kodeanggota=? "
                    +"and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        PeminjamanModel Peminjaman = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Peminjaman = new PeminjamanModel();
            Peminjaman.setKodeanggota(rs.getString(1));
            Peminjaman.setKodebuku(rs.getString(2));
            Peminjaman.setTglpinjam(rs.getString(3));
            Peminjaman.setTglkembali(rs.getString(4));
        }
        return Peminjaman;
    }

    @Override
    public List<PeminjamanModel> getAllPeminjam(Connection con) throws SQLException {
        String sql = "select * from peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        PeminjamanModel Peminjaman;
        List<PeminjamanModel> list = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Peminjaman = new PeminjamanModel();
            Peminjaman.setKodeanggota(rs.getString(1));
            Peminjaman.setKodebuku(rs.getString(2));
            Peminjaman.setTglpinjam(rs.getString(3));
            Peminjaman.setTglkembali(rs.getString(4));
            list.add(Peminjaman);
        }
        return list;
    }
}

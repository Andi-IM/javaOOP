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
    import pja18_30042020.model.PengembalianModel;


/**
 *
 * @author Andi
 */

public class PengembalianDaoImpl implements PengembalianDao{
    Connection con;
    
    public PengembalianDaoImpl() {
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
    @Override
    public void create(PengembalianModel model) throws SQLException {
        String sql = "insert into pengembalian values(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getKodeAnggota());
        ps.setString(2, model.getKodeBuku());
        ps.setString(3, model.getTglPinjam());
        ps.setString(4, model.getTglKembali());
        ps.setString(5, model.getTglDikembalikan());
        ps.setInt(6, model.getTerlambat());
        ps.setDouble(7, model.getDenda());
        ps.executeUpdate();
    }
    
    @Override
    public void update(PengembalianModel model) throws SQLException {
        String sql="update pengembalian set tglkembali=?, tgldikembalikan=?, terlambat =?, denda=? "
                + "where kodeanggota=? "
                + "and kodebuku=? "
                + "and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, model.getTglKembali());
        ps.setString(5, model.getTglDikembalikan());
        ps.setInt(6, model.getTerlambat());
        ps.setDouble(7, model.getDenda());
        ps.setString(1, model.getKodeAnggota());
        ps.setString(2, model.getKodeBuku());
        ps.setString(3, model.getTglPinjam());
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
    public int getKurangTanggal(com.mysql.jdbc.Connection con, String tgl1, String tgl2) throws SQLException {
        String sql = "select datediff(?,?) as hasil";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return rs.getInt(1);
        }
        return 0;
    }

    // development
    @Override
    public PengembalianModel getKembali(String kodeAnggota, String kodeBuku, String tglPinjam) throws SQLException {
        String sql = "SELECT * FROM pengembalian WHERE kodeanggota=?"
                + "AND kodebuku=?"
                + "AND tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeAnggota);
        ps.setString(2, kodeBuku);
        ps.setString(3, tglPinjam);
        PengembalianModel kembali = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            kembali = new PengembalianModel();
            kembali.setKodeAnggota(rs.getString(1));
            kembali.setKodeBuku(rs.getString(2));
            kembali.setTglPinjam(rs.getString(3));
            kembali.setTglKembali(tglPinjam);
            kembali.setTglDikembalikan(tglPinjam);
            kembali.setTerlambat(0);
            kembali.setDenda(0);
        }
        return kembali;
    }
}

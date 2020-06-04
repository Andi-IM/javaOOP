/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.dao;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import pja18_30042020.model.PengembalianModel;

/**
 *
 * @author Andi
 */
public interface PengembalianDao {
     public void create(PengembalianModel model) throws SQLException;
     public void update(PengembalianModel model) throws SQLException;
     public void delete(String kode, String kodebuku, String tglpinjam) throws SQLException;
     public int getKurangTanggal(Connection con, String tgl1, String tgl2) throws SQLException;
     public PengembalianModel getKembali(String kodeAnggota, String kodeBuku, String tglPinjam) throws SQLException;
}

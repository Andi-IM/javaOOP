/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import pja18_30042020.model.PeminjamanModel;

/**
 *
 * @author Andi
 */
public interface PeminjamanDao {
    public void create(PeminjamanModel Peminjaman) throws SQLException;
    public void update(PeminjamanModel Peminjaman) throws SQLException;
    public void delete(String kode, String kodebuku, String tglpinjam) throws SQLException;
    public PeminjamanModel getPeminjam(String kode) throws SQLException;
    public List<PeminjamanModel> getAllPeminjam(Connection con) throws SQLException;
}

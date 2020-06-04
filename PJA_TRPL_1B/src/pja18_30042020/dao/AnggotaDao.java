/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import pja18_30042020.model.AnggotaModel;

/**
 *
 * @author Andi
 */
public interface AnggotaDao {
    public void create(AnggotaModel anggota) throws SQLException;
    public void update(AnggotaModel anggota) throws SQLException;
    public void delete(String kode) throws SQLException;
    public AnggotaModel getAnggota(String kode) throws SQLException;
    public List<AnggotaModel> getAllAnggota(Connection con) throws SQLException;
}

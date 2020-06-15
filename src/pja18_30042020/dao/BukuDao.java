/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import pja18_30042020.model.BukuModel;

/**
 *
 * @author Andi
 */
public interface BukuDao {
    public void create(BukuModel buku) throws SQLException;
    public void update(BukuModel buku) throws SQLException;
    public void delete(String kode) throws SQLException;
    public BukuModel getBuku(String kode) throws SQLException;
    public List<BukuModel> getAllBuku(Connection con) throws SQLException;
    
}

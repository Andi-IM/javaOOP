/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pja18_30042020.dao.BukuDaoImpl;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.BukuModel;
import pja18_30042020.view.FormBuku;

/**
 *
 * @author Andi
 */
public class BukuController {
    FormBuku view;
    BukuModel buku;
    BukuDaoImpl bukuDao;
    Koneksi k;
    Connection con;

    public BukuController(FormBuku view) {
        this.view = view;
        bukuDao = new BukuDaoImpl();
        k = new Koneksi();
        try {
            con = k.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }
    
    public void insert(){
        buku = new BukuModel();
        buku.setKodebuku(view.getTxtKodebuku().getText());
        buku.setJudulbuku(view.getTxtJudulbuku().getText());
        buku.setPengarang(view.getTxtPengarang().getText());
        buku.setTahun(view.getTxtTahun().getText());
        
        try {
            bukuDao.create(buku);
            JOptionPane.showMessageDialog(null, "INSERTED");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "ERROR: "+e.getMessage());
        }
    }
    
    public void update(){
        buku = new BukuModel();
        buku.setKodebuku(view.getTxtKodebuku().getText());
        buku.setJudulbuku(view.getTxtJudulbuku().getText());
        buku.setPengarang(view.getTxtPengarang().getText());
        buku.setTahun(view.getTxtTahun().getText());
        
        try {
            bukuDao.update(buku);
            JOptionPane.showMessageDialog(null, "UPDATED");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "ERROR: "+e.getMessage());
        }
    }
    
    public void getBuku(){
        String kodeCari = view.getTxtKodebuku().getText();
        try {
            buku = bukuDao.getBuku(kodeCari);
            if (buku != null) {
                view.getTxtKodebuku().setText(buku.getKodebuku());
                view.getTxtJudulbuku().setText(buku.getJudulbuku());
                view.getTxtPengarang().setText(buku.getPengarang());
                view.getTxtTahun().setText(buku.getTahun());
            } else {
            JOptionPane.showMessageDialog(null, "NOT FOUND");
            }
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void delete(){
        String kodebuku = view.getTxtKodebuku().getText();
        try {
            bukuDao.delete(kodebuku);
            JOptionPane.showMessageDialog(null, "DELETED");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.clear();
    }
    
    public void clear(){
        view.getTxtKodebuku().setText(null);
        view.getTxtJudulbuku().setText(null);
        view.getTxtPengarang().setText(null);
        view.getTxtTahun().setText(null);
    }
    
    public void isiTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) view.getTblBuku().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "SELECT * FROM buku");
            while (rs.next()) {
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                };
                model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void onMouseClickTabelBuku(){
       bukuDao = new BukuDaoImpl();
       String kodebuku = view.getTblBuku().getValueAt(
                view.getTblBuku().getSelectedRow(),0).toString();
       String judulbuku = view.getTblBuku().getValueAt(
                view.getTblBuku().getSelectedRow(),1).toString();
       String pengarang = view.getTblBuku().getValueAt(
                view.getTblBuku().getSelectedRow(),2).toString();
       String jekel = view.getTblBuku().getValueAt(
                view.getTblBuku().getSelectedRow(),3).toString();
        try {
            BukuModel buku = bukuDao.getBuku(kodebuku);
            view.getTxtKodebuku().setText(buku.getKodebuku());
            view.getTxtJudulbuku().setText(buku.getJudulbuku());
            view.getTxtPengarang().setText(buku.getPengarang());
            view.getTxtTahun().setText(buku.getTahun());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Error : "+e);
        }
    }   
       
}

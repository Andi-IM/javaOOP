/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pja18_30042020.dao.AnggotaDao;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.AnggotaModel;
import pja18_30042020.view.FormAnggota;

/**
 *
 * @author Andi
 */
public class AnggotaController {
    FormAnggota view;
    AnggotaModel anggota;
    AnggotaDao anggotaDao;
    Koneksi k;
    Connection con;

    public AnggotaController(FormAnggota view) {
        this.view = view;
        anggotaDao = new AnggotaDao();
        k = new Koneksi();
        try {
            con = k.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }
    
    public void insert(){
        anggota = new AnggotaModel();
        anggota.setKode(view.getTxtKodeAngg().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJekel(view.getCbJekel().getSelectedItem().toString());
        
        try {
            anggotaDao.create(anggota);
            JOptionPane.showMessageDialog(null, "INSERTED");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "ERROR: "+e.getMessage());
        }
    }
    
    public void update(){
        anggota = new AnggotaModel();
        anggota.setKode(view.getTxtKodeAngg().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJekel(view.getCbJekel().getSelectedItem().toString());
        
        try {
            anggotaDao.update(anggota);
            JOptionPane.showMessageDialog(null, "UPDATED");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "ERROR: "+e.getMessage());
        }
    }
    
    public void getAnggota(){
        String kodeCari = view.getTxtKodeAngg().getText();
        try {
            anggota = anggotaDao.getAnggota(kodeCari);
            if (anggota != null) {
            view.getTxtNamaAngg().setText(anggota.getNama());
            view.getTxtAlamat().setText(anggota.getAlamat());
            view.getCbJekel().setSelectedItem(anggota.getJekel());
            } else {
            JOptionPane.showMessageDialog(null, "NOT FOUND");
            }
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void delete(){
        String kodeanggota = view.getTxtKodeAngg().getText();
        try {
            anggotaDao.delete(kodeanggota);
            JOptionPane.showMessageDialog(null, "DELETED");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.clear();
    }
    
    public void clear(){
        view.getTxtKodeAngg().setText(null);
        view.getTxtNamaAngg().setText(null);
        view.getTxtAlamat().setText(null);
    }
    
    public void isiTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) view.getTblAnggota().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "SELECT * FROM anggota");
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
}

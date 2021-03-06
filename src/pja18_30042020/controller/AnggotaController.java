/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pja18_30042020.dao.AnggotaDaoImpl;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.AnggotaModel;
import pja18_30042020.view.FormAnggota;

/**
 *
 * @author Andi
 */
public class AnggotaController {
    private FormAnggota view;
    private AnggotaModel anggota;
    private AnggotaDaoImpl anggotaDao;
    private Koneksi k;
    private Connection con;

    public AnggotaController(FormAnggota view) {
        this.view = view;
        anggotaDao = new AnggotaDaoImpl();
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
        anggota.setNama(view.getTxtNamaAngg().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJekel(view.getCbJekel().getSelectedItem().toString());
        
        try {
            anggotaDao.create(anggota);
            JOptionPane.showMessageDialog(null, "INSERTED");
        } catch (HeadlessException | SQLException e) {
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
        } catch (HeadlessException | SQLException e) {
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
       } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void delete(){
        String kodeanggota = view.getTxtKodeAngg().getText();
        try {
            anggotaDao.delete(kodeanggota);
            JOptionPane.showMessageDialog(null, "DELETED");
        } catch (HeadlessException | SQLException e) {
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
    
    public void onMouseClickTabelAnggota(){
        AnggotaDaoImpl anggotaDao = new AnggotaDaoImpl();
        
        String kode = view.getTblAnggota().getValueAt(
                view.getTblAnggota().getSelectedRow(),0).toString();
        String nama = view.getTblAnggota().getValueAt(
                view.getTblAnggota().getSelectedRow(),1).toString();
        String alamat = view.getTblAnggota().getValueAt(
                view.getTblAnggota().getSelectedRow(),2).toString();
        String jekel = view.getTblAnggota().getValueAt(
                view.getTblAnggota().getSelectedRow(),3).toString();
        try {
            AnggotaModel anggota = anggotaDao.getAnggota(kode);
            view.getTxtKodeAngg().setText(anggota.getKode());
            view.getTxtNamaAngg().setText(anggota.getNama());
            view.getTxtAlamat().setText(anggota.getAlamat());
            view.getCbJekel().setSelectedItem(anggota.getJekel());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Error : "+e);
        }
    }   
    
}

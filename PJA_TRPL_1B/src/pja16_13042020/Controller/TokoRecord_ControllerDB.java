/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja16_13042020.Controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pja16_13042020.DAO.TokoRecord_DAO;
import pja16_13042020.Model.TokoRecord_Model;
import pja16_13042020.View.TokoRecord_ViewCashier;
import pja16_13042020.View.TokoRecord_ViewDB;
import pja16_13042020.TokoRecord_ViewMenu;

/**
 *
 * @author Andi
 */
public class TokoRecord_ControllerDB {
    TokoRecord_ViewDB db;
    TokoRecord_ViewCashier cashier;
    TokoRecord_DAO dao;
    TokoRecord_Model model;

    public TokoRecord_ControllerDB(TokoRecord_ViewDB db) {
        this.db = db;
        dao = new TokoRecord_DAO();
    }

    public void clearForm(){
        db.getTxtIdbarang().setText("");
        db.getTxtNamaBrg().setText("");
        db.getTxtJumlah().setText("");
        db.getTxtHargaJual().setText("");
        db.getTxtHargaBeli().setText("");
    }
    
    public void insert(){
        model = new TokoRecord_Model();
        model.setId_barang(db.getTxtIdbarang().getText());
        model.setNama_barang(db.getTxtNamaBrg().getText());
        model.setStok(Integer.parseInt(db.getTxtJumlah().getText()));
        model.setHargaBeli(db.getTxtHargaBeli().getText());
        model.setHarga_jual(db.getTxtHargaJual().getText());
                
        dao.insert(model);
        JOptionPane.showMessageDialog(db, "Entri data OK");
    }
    
    public void update(){
        model = new TokoRecord_Model();
        model.setId_barang(db.getTxtIdbarang().getText());
        model.setNama_barang(db.getTxtNamaBrg().getText());
        model.setJumlah(Integer.parseInt(db.getTxtJumlah().getText()));
        model.setHargaBeli(db.getTxtHargaBeli().getText());
        model.setHarga_jual(db.getTxtHargaJual().getText());
        
        System.out.println(db.gettblBarang().getSelectedRow());
        dao.update(db.gettblBarang().getSelectedRow()+1, model);
        JOptionPane.showMessageDialog(db,"OK");
    }
    
    public void delete(){
        int index = db.gettblBarang().getSelectedRow();
        System.out.println(index);
        dao.delete(index);
    }
    
    public void onClickTable(){
        int index = db.gettblBarang().getSelectedRow();
        model = dao.getTokoRecord(index);
        db.getTxtIdbarang().setText(model.getId_barang());
        db.getTxtNamaBrg().setText(model.getNama_barang());
        db.getTxtJumlah().setText(model.getJumlah()+" ");
        db.getTxtHargaBeli().setText(model.getHargaBeli());
        db.getTxtHargaJual().setText(model.getHarga_jual());
    }
    
    public void viewTable(){
      DefaultTableModel tableModel =(DefaultTableModel)db.gettblBarang().getModel();
      tableModel.setRowCount(0);
        for (TokoRecord_Model s : dao.getData()) {
            Object[] d ={
              s.getId_barang(),
              s.getNama_barang(),
              s.getStok(),
              s.getHargaBeli(),
              s.getHarga_jual()
        };
            tableModel.addRow(d);
        }
    }
    
    
}

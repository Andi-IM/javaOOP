/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja16_13042020.Controller;

import javax.swing.table.DefaultTableModel;
import pja16_13042020.DAO.TokoRecord_DAO;
import pja16_13042020.Model.TokoRecord_Model;
import pja16_13042020.View.TokoRecord_ViewCashier;

/**
 *
 * @author Andi
 */
public class TokoRecord_ControllerCashier {
    TokoRecord_ViewCashier cashier;
    TokoRecord_DAO dao;
    TokoRecord_Model model;
    
    public TokoRecord_ControllerCashier(TokoRecord_ViewCashier cashier) {
       this.cashier = cashier;
       dao = new TokoRecord_DAO();
    }
    
    public void clearForm(){
        cashier.getTxtIdBarang().setText("");
        cashier.getTxtNamaBarang().setText("");
        cashier.getTxtJumlah().setText("");
    }
    
    public void viewTable(){
      DefaultTableModel tableModel =(DefaultTableModel) cashier.getTblCashier().getModel();
      tableModel.setRowCount(0);
        for (TokoRecord_Model s : dao.getData()) {
            Object[] d ={
              s.getId_barang(),
              s.getNama_barang(),
              s.getJumlah(),
              s.getHarga_jual()
        };
            tableModel.addRow(d);
        }
    }
}

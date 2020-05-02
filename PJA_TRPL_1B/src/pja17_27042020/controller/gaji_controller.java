/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja17_27042020.controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pja17_27042020.dao.gaji_dao;
import pja17_27042020.gaji_view;
import pja17_27042020.model.gaji_model;
import uts_1911082006.model.ukt_model;

/**
 *
 * @author Andi
 */
public class gaji_controller {
    gaji_view view;
    gaji_model model;
    gaji_dao dao;
    int tunjangan;
    int gajipokok;
    
    public gaji_controller(gaji_view view) {
        this.view = view;
        dao = new gaji_dao();
    } 
    
      public void clearForm(){
      view.getTxtKodeSlip().setText("");
      view.getTxtTanggal().setText("");
      view.getTxtNIP().setText("");
      view.getTxtNama().setText("");
      view.getCbGolongan().setSelectedIndex(0);
      view.getTxtJumlahTanggungan().setText("");
    }
    
    public void getGajiPokok(ActionEvent e){
        int index;
        if (e.getSource() == view.getCbGolongan()) {
            index = view.getCbGolongan().getSelectedIndex();
            switch(index){
                case 1:
                    this.gajipokok = 1500000;
                    this.tunjangan = 500000;
                    break;
                case 2:
                    this.gajipokok = 2000000;
                    this.tunjangan = 800000;
                    break;
                case 3:
                    this.gajipokok = 3000000;
                    this.tunjangan = 1000000;
                    break;
            }   
        }
    }
    
    public void insert(){
      model = new gaji_model();
      int tanggungan=0; 
      double potong=0, gbersih=0;
      model.setKodeSlip(view.getTxtKodeSlip().getText());
      model.setTanggal(view.getTxtTanggal().getText());
      model.setNIP(view.getTxtNIP().getText());
      model.setNama(view.getTxtNama().getText());
      model.setGolongan((String) view.getCbGolongan().getSelectedItem());

      tanggungan = tunjangan * Integer.parseInt(view.getTxtJumlahTanggungan().getText());
      potong = (double) 0.1*gajipokok;
      model.setPotongan(String.valueOf(potong));
      
      gbersih = gajipokok+tunjangan-potong;
      model.setGajiBersih(String.valueOf(gbersih));
      
      dao.insert(model);
      JOptionPane.showMessageDialog(view, "Entri data OK");
        
    }
    
    public void update(){
      int tanggungan=0; 
      double potong=0, gbersih=0;
      model.setKodeSlip(view.getTxtKodeSlip().getText());
      model.setTanggal(view.getTxtTanggal().getText());
      model.setNIP(view.getTxtNIP().getText());
      model.setNama(view.getTxtNama().getText());
      model.setGolongan((String) view.getCbGolongan().getSelectedItem());

      tanggungan = tunjangan * Integer.parseInt(view.getTxtJumlahTanggungan().getText());
      potong = (double) 0.1*gajipokok;
      model.setPotongan(String.valueOf(potong));
      
      gbersih = gajipokok+tunjangan-potong;
      model.setGajiBersih(String.valueOf(gbersih));

      System.out.println(view.getTblGaji().getSelectedRow());
        dao.update(view.getTblGaji().getSelectedRow()+1, model);
        JOptionPane.showMessageDialog(view,"OK");
    }
    
    public void delete(){
        int index = view.getTblGaji().getSelectedRow();
        System.out.println(index);
        dao.delete(index);
    }
    
    public void onClickTable(){
        int index = view.getTblGaji().getSelectedRow();
        model = dao.getGajiModel(index);
        view.getTxtNama().setText(model.getNama());
        view.getTxtNIP().setText(model.getNIP());
        view.getTxtTanggal().setText(model.getTanggal());
        view.getTxtKodeSlip().setText(model.getKodeSlip());
    }
    
    public void viewTable(){
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblGaji().getModel();
        tableModel.setRowCount(0);
        for (gaji_model m : dao.getData()) {
            Object[] d ={
                m.getKodeSlip(),
                m.getTanggal(),
                m.getNIP(),
                m.getNama(),
                m.getGolongan(),
                "Rp."+m.getPotongan(),
                "Rp."+m.getGajiBersih()
            };
                tableModel.addRow(d);
        }
    }
}

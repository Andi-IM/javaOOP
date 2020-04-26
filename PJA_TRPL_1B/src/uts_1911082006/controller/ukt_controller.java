/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_1911082006.controller;

import uts_1911082006.dao.ukt_dao;
import uts_1911082006.model.ukt_model;
import uts_1911082006.ukt_view;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andi
 */
public class ukt_controller {
    ukt_view view;
    ukt_model model;
    ukt_dao dao;
    String nominal;
    public ukt_controller(ukt_view view){
        this.view=view;
        dao = new ukt_dao();
    }
    
    public void disable(){
        view.getTxtNama().setEnabled(false);
        view.getTxtNoBP().setEnabled(false);
        view.getTxtTA().setEnabled(false);
        view.getTxtJumlah().setEnabled(false);
        view.getCbPembayaran().setEnabled(false);
        view.getComboJurusan().setEnabled(false);
        view.getComboProdi().setEnabled(false);
        view.getRbGanjil().setEnabled(false);
        view.getRbGenap().setEnabled(false);
        view.getBtnBayar().setEnabled(false);
    }
    
    public void enable(){
        view.getTxtNama().setEnabled(true);
        view.getTxtNoBP().setEnabled(true);
        view.getTxtTA().setEnabled(true);
        view.getCbPembayaran().setEnabled(true);
        view.getComboJurusan().setEnabled(true);
        view.getRbGanjil().setEnabled(true);
        view.getRbGenap().setEnabled(true);

    }
    
    public void clear(){
        view.getTxtNama().setText("");
        view.getTxtNoBP().setText("");
        view.getTxtTA().setText("");
        view.getTxtJumlah().setText("");
        view.getCbPembayaran().setSelectedIndex(0);
        view.getComboJurusan().setSelectedIndex(0);
        view.getComboProdi().setSelectedIndex(0);
        view.getRbGanjil().setSelected(false);
        view.getRbGenap().setSelected(false);
    }
    
    public String setSemester(){
        if (view.getRbGanjil().isSelected()) {
          return  view.getRbGanjil().getText();
        } else {
          return  view.getRbGenap().getText();
        } 
    }
    
    public void getSemester(String smt){
        if (smt == "Ganjil") {
            view.getRbGanjil().setSelected(true);
        }else {
            view.getRbGenap().setSelected(true);
        }
    }
    
    public void insert(){
        model = new ukt_model();
        model.setNama(view.getTxtNama().getText());
        model.setNoBP(view.getTxtNoBP().getText());
        model.setJurusan((String) view.getComboJurusan().getSelectedItem());
        model.setProdi((String) view.getComboProdi().getSelectedItem());  
        model.setSemester(setSemester());
        model.setTA(view.getTxtTA().getText());
        model.setJPembayaran((String) view.getCbPembayaran().getSelectedItem());
        model.setJumlah(nominal);
        
        System.out.println("Nominal model : "+model.getJumlah());
        
        JOptionPane.showMessageDialog(view,"Anda terdaftar!");
        dao.insert(model);
        disable();
    }
    
    public void jumlahActionPerformed(ActionEvent e){
        nominal = null;
        if (e.getSource() == view.getTxtJumlah()) {
            nominal =  view.getTxtJumlah().getText();
            view.getBtnBayar().setEnabled(true);
        }
        System.out.println("nominal :"+nominal);
    }
    
    public void btnBayarAction(ActionEvent e){
        int pilih;
        int nom = Integer.parseInt(nominal);
        pilih = view.getCbPembayaran().getSelectedIndex();
        switch(pilih){
            case 1:
                JOptionPane.showMessageDialog(null,"Terima Kasih");
                break;
            case 2:
                Object []pesan ={
                    "Transfer dengan nominal sebesar",
                    "Rp."+(nom+432),
                    "Ke rekening Bank PNP",
                    "a.n Pak An : XXXX XXXX XXXX"
                };
                JOptionPane.showMessageDialog(null,pesan,"Bayar dulu!",1);
                break;
            case 3:
                Object []p ={
                    "Masukkan Kode Verifikasi ke akun PNP eWallet Anda",
                    (nom+121)
                };
                JOptionPane.showMessageDialog(null,p,"Bayar dulu!",1);
            default :
                break;
        }
    }
    
    public void bayarActionPerformed(ActionEvent e){
        int pilih;
        String nominal;
        if (e.getSource() == view.getCbPembayaran()) {
        pilih = view.getCbPembayaran().getSelectedIndex();
        switch(pilih){
            case 0:
             view.getTxtJumlah().setEnabled(false);
             break;
            case 1:
                view.getTxtJumlah().setEnabled(true);
             break;
            case 2:
                view.getTxtJumlah().setEnabled(true);
                
                break;
            default :
             view.getTxtJumlah().setEnabled(true);
             break;
        }
        }
    }
    
    public void update(){
        model = new ukt_model();
        model.setNama(view.getTxtNama().getText());
        model.setNoBP(view.getTxtNoBP().getText());
        model.setJurusan((String) view.getComboJurusan().getSelectedItem());
        model.setProdi((String) view.getComboProdi().getSelectedItem());
        model.setSemester(setSemester());
        model.setTA(view.getTxtTA().getText());
        model.setJPembayaran((String) view.getCbPembayaran().getSelectedItem());
        model.setJumlah(view.getTxtJumlah().getText());
        
        System.out.println(view.getTblMhs().getSelectedRow());
        dao.update(view.getTblMhs().getSelectedRow()+1, model);
        JOptionPane.showMessageDialog(view,"Data Anda up to date!");
        disable();
    }
    
    public void delete(){
        int index = view.getTblMhs().getSelectedRow();
        if (index >= 0) {
        System.out.println(index);
        dao.delete(index);
            JOptionPane.showMessageDialog(view, "Data telah terhapus!");    
        } else {
            JOptionPane.showMessageDialog(view, "Data telah terhapus!");    
        }
        
    }
    
    public void onClickTable(){
        int index = view.getTblMhs().getSelectedRow();
        model = dao.getUKTRecord(index);
        view.getTxtNama().setText(model.getNama());
        view.getTxtNoBP().setText(model.getNoBP());
        view.getComboJurusan().setSelectedIndex(index);
        view.getComboProdi().setSelectedIndex(index);
        getSemester(model.getSemester());
        view.getCbPembayaran().setSelectedIndex(index);
        view.getTxtJumlah().setText(model.getJumlah());
    }
    public void viewTable(){
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblMhs().getModel();
        tableModel.setRowCount(0);
        for (ukt_model u: dao.getData()) {
            Object[] o = {
                u.getNama(),
                u.getTA(),
                u.getSemester(),
                u.getJurusan(),
                u.getProdi(),
                u.getJumlah()
            };
            tableModel.addRow(o);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja15_06042020;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andi
 */
public class StudentRecord_Controller {
    StudentRecord_View view;
    StudentRecord_Model model;
    StudentRecord_DAO dao;

    public StudentRecord_Controller(StudentRecord_View view) {
        this.view = view;
        dao = new StudentRecord_DAO();
    }
    
    public void clearForm(){
        view.getjTF_Nama().setText("");
        view.getjTF_Umur().setText("");
        view.getjTF_Alamat().setText("");
        view.getjTF_Matematika().setText("");
        view.getjTF_BahasaInggris().setText("");
        view.getjTF_IPA().setText("");
    }
    
    public void insert(){
        model = new StudentRecord_Model();
        model.setName(view.getjTF_Nama().getText());
        model.setAddress(view.getjTF_Alamat().getText());
        model.setAge(Integer.parseInt(view.getjTF_Umur().getText()));
        model.setMathGrade(Double.parseDouble(view.getjTF_Matematika().getText()));
        model.setEnglishGrade(Double.parseDouble(view.getjTF_BahasaInggris().getText()));
        model.setScienceGrade(Double.parseDouble(view.getjTF_IPA().getText()));
        
        dao.insert(model);
        JOptionPane.showMessageDialog(view, "Entri data OK");
    }
    
    public void update(){
        model = new StudentRecord_Model();
        model.setName(view.getjTF_Nama().getText());
        model.setAddress(view.getjTF_Alamat().getText());
        model.setAge(Integer.parseInt(view.getjTF_Umur().getText()));
        model.setMathGrade(Double.parseDouble(view.getjTF_Matematika().getText()));
        model.setEnglishGrade(Double.parseDouble(view.getjTF_BahasaInggris().getText()));
        model.setScienceGrade(Double.parseDouble(view.getjTF_IPA().getText()));
        
        System.out.println(view.getTableStudent().getSelectedRow());
        dao.update(view.getTableStudent().getSelectedRow()+1, model);
        JOptionPane.showMessageDialog(view,"OK");
    }
    
    public void delete(){
        int index = view.getTableStudent().getSelectedRow();
        System.out.println(index);
        dao.delete(index);
    }
    
    public void onClickTable(){
        int index = view.getTableStudent().getSelectedRow();
        model = dao.getStudentRecord(index);
        view.getjTF_Nama().setText(model.getName());
        view.getjTF_Alamat().setText(model.getAddress());
        view.getjTF_Umur().setText(model.getAge()+" ");
        view.getjTF_Matematika().setText(model.getMathGrade()+" ");
        view.getjTF_BahasaInggris().setText(model.getEnglishGrade()+" ");
        view.getjTF_IPA().setText(model.getScienceGrade()+" ");
    }
    
    public void viewTable(){
      DefaultTableModel tableModel =(DefaultTableModel)view.getTableStudent().getModel();
      tableModel.setRowCount(0);
        for (StudentRecord_Model s : dao.getData()) {
            Object[] d ={
              s.getName(),
              s.getAddress(),
              s.getAge(),
              s.getAverage()
        };
            tableModel.addRow(d);
        }
    }
}
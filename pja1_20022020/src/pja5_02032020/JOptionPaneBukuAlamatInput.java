package pja5_02032020;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andi
 */
import javax.swing.*;
public class JOptionPaneBukuAlamatInput {
 
   public static void main(String[] args) {
      JTextField nama = new JTextField(5);
      JTextField alamat = new JTextField(5);
      JTextField notel = new JTextField(5);
      JTextField email = new JTextField(5);

      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Nama :"));
      myPanel.add(nama);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Alamat:"));
      myPanel.add(alamat);
      myPanel.add(Box.createVerticalStrut(5)); // a spacer
      myPanel.add(new JLabel("No Telp:"));
      myPanel.add(notel);
      myPanel.add(Box.createVerticalStrut(5)); // a spacer
      myPanel.add(new JLabel("Email:"));
      myPanel.add(email);
      
      

      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Enter ", JOptionPane.OK_CANCEL_OPTION);
      
      String pesan = 
                  "Nama          : " +nama.getText() +" "+
                "\nAlamat        : " +alamat.getText()+" "+
                "\nNomor Telp    : " +notel.getText() +" "+
                "\nEmail         : " +email.getText();
    if (result == JOptionPane.OK_OPTION) {
        JOptionPane.showMessageDialog(null, pesan);
      }    
       
      //if (result == JOptionPane.OK_OPTION) {
      //   System.out.println("x value: " + xField.getText());
      //   System.out.println("y value: " + yField.getText());
      //}
   }
}   

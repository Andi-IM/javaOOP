package pja1_20022020;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Andi
 */
public class JOptionPaneExample {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        String nama="";
        String alamat = "";
        String noBp = "";
        String jenisKelamin = "";
        String noHp = "";
        
        nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        alamat = JOptionPane.showInputDialog("Masukkan Alamat : ");
        noBp = JOptionPane.showInputDialog("Masukkan Jenis Kelamin : ");
        jenisKelamin = JOptionPane.showInputDialog("Masukkan Nomor HP : ");
        
        String pesan = "Nama : " + nama+" "+
                "\nAlamat : "+alamat+" "+
                "\nNomor Bp : "+noBp+" "+
                "\nJenis Kelamin : "+jenisKelamin+" "+
                "\nNomor HP : "+noHp;
        
        JOptionPane.showMessageDialog(null, pesan);
    }
}

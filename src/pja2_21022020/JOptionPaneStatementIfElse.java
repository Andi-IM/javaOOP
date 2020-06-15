/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja2_21022020;

import javax.swing.JOptionPane;

/**
 *
 * @author Andi
 */
public class JOptionPaneStatementIfElse {
    public static void main(String[] args) {
        String inputNilai = " ";
        String nilaiHuruf = " ";
        int nilai = 0;
        
        inputNilai = JOptionPane.showInputDialog("Masukkan Nilai : ");
        nilai = Integer.parseInt(inputNilai);
        if (nilai > 85) {
            nilaiHuruf = "A";
        } else if(nilai > 70){
            nilaiHuruf = "B";
        } else if(nilai > 55){
            nilaiHuruf = "C";
        } else if(nilai > 45) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        
        String pesan = "Nilai "+nilai+" Grade "+nilaiHuruf;
        JOptionPane.showMessageDialog(null, pesan);
    }
}

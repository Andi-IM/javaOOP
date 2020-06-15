/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja11_23032020;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andi
 */
public class MyIntegerExample {
    public static void main(String[] args) {
        Relation relation = new MyInteger();
        int panjang1, lebar1, panjang2, lebar2;
        panjang1=lebar1=panjang2=lebar2=0;
        
        try{
        panjang1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai panjang 1"));
        lebar1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai lebar 1"));
        panjang2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai panjang 2"));
        lebar2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai lebar 2"));
        }
        catch(HeadlessException | NumberFormatException e){
            e.printStackTrace();
            System.out.println("Inputan harus berupa angka.");
        }
        
        int luas1 = panjang1*lebar1;
        int luas2 = panjang2*lebar2;
        
        System.out.println(relation.isGreater(luas1, luas2));
        System.out.println(relation.isLess(luas1, luas2));
        System.out.println(relation.isEqual(luas1, luas2));
    }
}

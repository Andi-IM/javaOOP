/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja2_21022020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Andi
 */
public class BufferedReaderIfElseExample {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
         BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nilaiHuruf = " ";
        int nilai = 0;
        
        System.out.print("Masukkan Nilai : ");
        
        try {
        nilai = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
          System.out.print("Error");
        }
        
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
        
        String pesan = "Nilai "+nilai+" Grade "+nilaiHuruf+"\n";
        System.out.print(pesan);
    }
}

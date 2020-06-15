/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja3_24222020.BukuAlamat;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Andi
 */
public class recordBukuAlamat {
    public static void setBukuAlamat(){
        
    }
    public static void main(String[] args) {
        BukuAlamat AndiRecord = new BukuAlamat("Andi","Padang","0751969802","andi.irhamm@gmail.com");
        //BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        AndiRecord.print(AndiRecord.getName());
        
        /*
        int pil=0;
        while (pil!=5) {            
            System.out.println("Menu Pilihan");
            System.out.println("============");
            System.out.println("1. Entri data");
            System.out.println("2. Hapus data");
            System.out.println("3. Tampil data");
            System.out.println("4. Update data");
            System.out.println("5. Keluar");
            
            switch(pil){
                case 1:
                    setBukuAlamat();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
        System.out.println("apaan tuh? mungkin input Anda salah?");
        */
        
        
    }
    
}

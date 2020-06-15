/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pja13_30032020;

import java.util.ArrayList;

/**
 * @author Andi
 * 
 */
public class ListArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> mahasiswa = new ArrayList<>();
        System.out.println("\nMenambahkan nilai ArrrayLIst: ");
        mahasiswa.add("Alvin");
        mahasiswa.add("Syarif");
        mahasiswa.add("Tiara");
        System.out.println(mahasiswa);
        
        System.out.println("\nMenampilkan: ");
        System.out.println(mahasiswa.get(0));
        System.out.println(mahasiswa.get(1));
        System.out.println(mahasiswa.get(2));
        
        System.out.println("\nMenhapus list ke-0");
        mahasiswa.remove(0);
        System.out.println(mahasiswa);
        
        System.out.println("\nUpdate suatu nilai di dalam array list: ");
        mahasiswa.set(1, "Hidayat");
        System.out.println(mahasiswa);
    }

}

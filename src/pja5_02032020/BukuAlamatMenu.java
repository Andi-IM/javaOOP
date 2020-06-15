/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja5_02032020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andi
 */
public class BukuAlamatMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        BukuAlamatRecord bar = new BukuAlamatRecord();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nama = new String[100];
        String[] alamat = new String[100];
        String[] notel = new String[100];
        String[] email = new String[100];
        
        String pilihan = "";
        String jumlah = "";
        String n= "";
        int index;
        do {            
                System.out.print("\n------Menu------\n");
                System.out.println("1. Masukkan Data");
                System.out.println("2. Hapus Data");
                System.out.println("3. Tampilkan Data");
                System.out.println("4. Ubah Data");
                System.out.println("5. Keluar");
                System.out.println("----------------");
                System.out.print("Masukkan pilihan :");
                
                
                try {
                     pilihan = br.readLine();
                    } catch (IOException e) {
                            System.out.println("error");
                }
                switch(Integer.parseInt(pilihan)){
                    case 1:
                        System.err.print("Berapa Banyak data yang ingin diinput : ");   
                        {
                                try {
                                    jumlah = br.readLine();
                                } catch (IOException ex) {
                                    Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }    
                       
                        for (int i = 0; i < Integer.parseInt(jumlah); i++) {
                            System.out.println("Data ke : "+(i+1));
                            
                            System.out.print("Input Nama : ");    
                            try {
                                nama[i] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            System.out.print("Input Alamat :");
                            try {
                                alamat[i] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            System.out.print("Input No telp :");
                            try {
                                notel[i] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                            
                            System.out.print("Input email :");
                            try {
                                email[i] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    break;

                    case 2:
                        System.out.println("Menghapus data");
                        System.out.println("Input index siswa yang akan dihapus : ");
                            try {
                                n = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        index = Integer.parseInt(n);
                            
                        System.out.println("Ditemukan data ke : "+index);
                        bar.setNama(nama[index], index, alamat[index], notel[index], email[index]);
                        
                            nama[index]   = nama[index+1];
                            alamat[index] = alamat[index+1];
                            notel[index]  = notel[index+1];
                            email[index]  = email[index+1];
                            int jum = Integer.parseInt(jumlah);
                            jum--;
                            String s = String.valueOf(jum);
                            jumlah = s;
                        /*
                        nama[index]     = null;
                        alamat[index]   = null;
                        notel[index]    = null;
                        email[index]    = null;*/
                        
                        break;
                                

                    case 3:
                        System.out.println("=====DATA SISWA=====");
                        System.out.println("====================");
                        for (int j = 0; j < Integer.parseInt(jumlah); j++) {
                             bar.setNama(nama[j], j, alamat[j], email[j], notel[j]);
                                System.out.println("-----------------------------");
                                System.out.println("Nama : "+bar.getNama(j));
                                System.out.println("Alamat : "+bar.getAlamat(j));
                                System.out.println("Email : "+ bar.getEmail(j));
                                System.out.println("notel : "+ bar.getNotel(j));
                            }
                        break;
                    case 4:
                        System.out.println("Mengubah data");
                        System.out.println("Input index Mahasiswa yang ingin dihapus");
                        
                            try {
                                n = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        index = Integer.parseInt(n);
                        System.out.println("Ditemukan Data ke : "+index);
                        bar.setNama(nama[index], index, alamat[index], notel[index], email[index]);
                        
                            try {
                                System.out.print("Input Nama : ");    
                                nama[index] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            try {
                                System.out.print("Input Alamat :");
                                alamat[index] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            try {
                                System.out.print("Input No telp :");
                                notel[index] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            try {
                                 System.out.print("Input email :");
                                email[index] = br.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(BukuAlamatMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }    
                    break;
                    
                    case 5:
                        break;
                    default:
                        System.err.print("Input tidak ditemukan");
                }
        } while (Integer.parseInt(pilihan)!=5);
    }
}

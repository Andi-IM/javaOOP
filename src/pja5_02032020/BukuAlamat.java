/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja5_02032020;

/**
 *
 * @author Andi
 */
public class BukuAlamat {
    private String[] nama = new String[100];
    private String[] alamat = new String[100];
    private String[] noTelp = new String[100];
    private String[] eMail = new String[100];
    
    //variable menghitung nilai
    public static int jumlahData;
    public static int indexData;
   

    public String getNama() {
        return nama[indexData];
    }

    public String getAlamat() {
        return alamat[indexData];
    }

    public String getNoTelp() {
        return noTelp[indexData];
    }

    public String geteMail() {
        return eMail[indexData];
    }
    
    public BukuAlamat(){
        //kosong
    }
    
    public BukuAlamat(String nm, String alm, String noTlp, String em){
        this.nama[indexData] = nm;
        this.alamat[indexData] = alm;
        this.noTelp[indexData] = noTlp;
        this.eMail[indexData] = em;
    }
}

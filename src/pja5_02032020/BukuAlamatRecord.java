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
public class BukuAlamatRecord {
    public String[] nama = new String[100];
    public String[] alamat = new String[100];
    public String[] notel = new String[100];
    public String[] email = new String[100];
    
    public static int jumlahData;
    public static int indexData;
    
    public BukuAlamatRecord(){
        jumlahData=0;
    }

    public String getNama(int indexData) {
        return nama[indexData];
    }

    public String getAlamat(int indexData) {
        return alamat[indexData];
    }

    public String getNotel(int indexData) {
        return notel[indexData];
    }

    public String getEmail(int indexData) {
        return email[indexData];
    }

    public static int getJumlahData() {
        return jumlahData;
    }

    public void setNama(String nama, int indexData, 
            String Alamat, String notel, String email) {
        this.nama[indexData] = nama;
        this.alamat[indexData] = Alamat;
        this.email[indexData] = email;
        this.notel[indexData] = notel;
    }
    
    
    
    
}

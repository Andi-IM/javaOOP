/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja16_13042020.Model;

/**
 *
 * @author Andi
 */
public class TokoRecord_Model {
    String id_barang;
    String Nama_barang;
    int Jumlah;
    String Harga_jual;
    int Stok;
    String HargaBeli;
    String Keuntungan;
    String Diskon;
    int Harga;

    public int getHarga() {
        return Integer.parseInt(Harga_jual)*Jumlah;
    }

    public String getId_barang() {
        return id_barang;
    }

    public String getNama_barang() {
        return Nama_barang;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public String getHarga_jual() {
        return Harga_jual;
    }

    public int getStok() {
        return Stok;
    }

    public String getHargaBeli() {
        return HargaBeli;
    }

    public String getKeuntungan() {
        return Keuntungan;
    }

    public String getDiskon() {
        return Diskon;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public void setNama_barang(String Nama_barang) {
        this.Nama_barang = Nama_barang;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public void setHarga_jual(String Harga_jual) {
        this.Harga_jual = Harga_jual;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public void setHargaBeli(String HargaBeli) {
        this.HargaBeli = HargaBeli;
    }
    
}

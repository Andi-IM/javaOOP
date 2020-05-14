/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.model;

/**
 *
 * @author Andi
 */
public class BukuModel {
    private String kode;
    private String judul;
    private String pengarang;
    private String tahun;

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getTahun() {
        return tahun;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}

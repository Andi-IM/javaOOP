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
public class PeminjamanModel {
     private String kodeanggota;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;

    public String getKodeanggota() {
        return kodeanggota;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
}

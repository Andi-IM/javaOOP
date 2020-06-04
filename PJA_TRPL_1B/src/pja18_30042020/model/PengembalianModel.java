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
public class PengembalianModel {

    private String kodeAnggota;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    private String tglDikembalikan;
    private int terlambat;
    private double denda;

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public String getTglDikembalikan() {
        return tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
}

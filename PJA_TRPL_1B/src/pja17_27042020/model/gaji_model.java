/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja17_27042020.model;

/**
 *
 * @author Andi
 */
public class gaji_model {
    String KodeSlip;
    String tanggal;
    String NIP;
    String nama;
    String golongan;
    String potongan;
    String gajiBersih;
    String jmlTanggungan;

    public String getJmlTanggungan() {
        return jmlTanggungan;
    }

    public void setJmlTanggungan(String jmlTanggungan) {
        this.jmlTanggungan = jmlTanggungan;
    }

    public String getKodeSlip() {
        return KodeSlip;
    }

    public void setKodeSlip(String KodeSlip) {
        this.KodeSlip = KodeSlip;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getPotongan() {
        return potongan;
    }

    public void setPotongan(String potongan) {
        this.potongan = potongan;
    }

    public String getGajiBersih() {
        return gajiBersih;
    }  

    public void setGajiBersih(String gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
}

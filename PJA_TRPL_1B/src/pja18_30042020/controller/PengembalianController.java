/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja18_30042020.controller;

import java.sql.Connection;
import java.util.Date;
import pja18_30042020.dao.AnggotaDao;
import pja18_30042020.dao.AnggotaDaoImpl;
import pja18_30042020.dao.BukuDaoImpl;
import pja18_30042020.dao.PeminjamanDaoImpl;
import pja18_30042020.dao.PengembalianDaoImpl;
import pja18_30042020.http.Koneksi;
import pja18_30042020.model.PeminjamanModel;
import pja18_30042020.view.FormPengembalian;
import java.text.SimpleDateFormat;
/**
 *
 * @author Andi
 */
public class PengembalianController {
    final private FormPengembalian view;
    final private Koneksi k;
    final private Connection con;
    AnggotaDao anggotaDao;
    BukuDaoImpl bukuDao;
    PeminjamanDaoImpl peminjamanDao;
    PengembalianDaoImpl pengembalian;
    final private PeminjamanModel peminjaman;
    String dateNow;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

    public PengembalianController(FormPengembalian view) {
        this.view = view;
        k = new Koneksi();
        con = k.getConnection();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalian = new PengembalianDaoImpl();
        peminjaman = new PeminjamanModel();
        dateNow = format.format(new Date());   
    }

    public void viewTanggal(){
        view.getTxtDikembalikan().setText(dateNow);
    }
}

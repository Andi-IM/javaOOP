/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja5_02032020;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andi
 */
public class BukuAlamatAccesorMutator {    
    ArrayList<BukuAlamat>tampung;
    
    public BukuAlamatAccesorMutator(){
        //instansiasi
        tampung = new ArrayList<>();
    }
    
     public void isiData(String nama, String alm, String ntlp, String eml)
    {
        tampung.add(new BukuAlamat(nama,alm,ntlp,eml));
    }
     
    public void showData()
    {
        for(BukuAlamat ba:tampung)
        {
            System.out.println(
                    "\nNama : "+ba.getNama()+"\n"
                    +"Alamat : "+ba.getAlamat()
                    +"\n"+"No Telp : "+ba.getNoTelp()
                    +"\n"+"email : "+ba.geteMail());
        }
    }
public static void main(String[] args) 
{
    BukuAlamatAccesorMutator baam = new BukuAlamatAccesorMutator();
    Scanner in = new Scanner(System.in);
    
        baam.isiData("Andi","Padang","0823802932","andi@gmail.com");
        baam.isiData("Budi","Solok","082492302","anjing@goblok.com");
        baam.isiData("mmq","Piacman","0843923","mppsh@ahah.com");
         
        baam.showData();
}

}

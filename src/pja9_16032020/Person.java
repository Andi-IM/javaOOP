/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja9_16032020;

/**
 *
 * @author Andi
 */
public class Person {
    protected String nama;
    protected String alamat;
    
    /**
     *
     * @return
     */
    public String getName(){
        System.out.println("Parent : getName");
        return nama;
    }
    public Person () {
        System.out.println("Person Constructor ");
        nama = "";
        alamat = "";
    }
    public Person(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja3_24222020.BukuAlamat;

/**
 *
 * @author Andi
 */
public class BukuAlamat {
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    public void print(String temp) {
        System.out.println("Nama:" + name);
        System.out.println("Alamat: "+ address);
        System.out.println("No. HP: "+ phoneNumber);
        System.out.println("Alamat email: "+eMail);
    }
    
    public BukuAlamat(String name, String address, String phoneNum, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNum;
        this.eMail = email;
    }
}

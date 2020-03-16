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
public class Student extends Person{        //person meawariskan sifat ke Student
    protected String Nobp;
    public Student(){
        super("SomeName","SomeAddress");
        System.out.println("Inside Student: Constructor");
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getName(){
        System.out.println("Student : getName");
        return nama;
    }
    
    public static void main(String[] args) {
        Student student = new Student();        
        student.nama = "Ali";
        //student.alamat = "Padang";
        student.Nobp = "12345678";

        System.out.println("Nama   : "+student.getName());
        System.out.println("Alamat : "+student.alamat);
        System.out.println("NoBP   : "+student.Nobp);
    }
}

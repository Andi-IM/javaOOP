/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja3_24222020;

import java.text.DecimalFormat;

/**
 *
 * @author Andi
 */
public class studentRecord {
    protected String name;
    protected String address;
    protected int age;
    protected String NoBp;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double averageGrade;
    protected static int studentCount; 

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getNoBp() {
        return NoBp;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public String getAverageGrade() {
        averageGrade = (mathGrade+englishGrade+scienceGrade)/3;
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(averageGrade);
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNoBp(String NoBp) {
        this.NoBp = NoBp;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }
    
    /** 
     * Menghasilkan jumlah instance StudentRecord 
     */ 
    
    public static int getStudentCount(){ 
        return studentCount; 
    }
    
    public void print( String temp ){ 
        System.out.println("Name:" + name); 
        System.out.println("Address:" + address);  
        System.out.println("Age:" + age);  } 
 
    public void print(double eGrade, double mGrade, double sGrade){ 
        System.out.println("Name:" + name); 
        System.out.println("Math Grade:" + mGrade);  
        System.out.println("English Grade:" + eGrade);  
        System.out.println("Science Grade:" + sGrade);  
    }
    
    public studentRecord(){ 
    //letak kode inisialisasi 
    studentCount++; //menambah student 
    } 
 
    public studentRecord(String temp){ 
    this.name = temp;
    studentCount++; //menambah student
    }  
 
    public studentRecord(String name, String address){ 
    this.name = name; 
    this.address = address;  
    studentCount++; //menambah student 
    } 
 
 
    public studentRecord(double eGrade, double mGrade, double sGrade){ 
        mathGrade = mGrade;  
        englishGrade = eGrade;  
        scienceGrade = sGrade;  
        studentCount++; //menambah student 
        }
}
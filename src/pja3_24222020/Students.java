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
public class Students extends studentRecord{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getNoBp() {
        return NoBp;
    }

    @Override
    public double getMathGrade() {
        return mathGrade;
    }

    @Override
    public double getEnglishGrade() {
        return englishGrade;
    }

    @Override
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    public static void main(String[] args) {
        Students sw = new Students();
        sw.name = " Andi ";
        sw.NoBp = " 12345678 ";
        
        
        System.out.println("Nama : "+sw.name);
        System.out.println("BP   : "+sw.NoBp);
    }
}

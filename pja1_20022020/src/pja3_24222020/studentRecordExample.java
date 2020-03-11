/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja3_24222020;

/**
 *
 * @author Andi
 */
public class studentRecordExample {
    public static void main(String[] args) {
        //membuat 3 object record
        studentRecord anna = new studentRecord();
        studentRecord beah = new studentRecord();
        studentRecord benny = new studentRecord();
        
        anna.setName("Anna");
        anna.setNoBp("1911082008");
        anna.setAddress("Padang");
        anna.setAge(20);
        anna.setEnglishGrade(95.3);
        anna.setMathGrade(85.9);
        anna.setScienceGrade(76.5);
        
        benny.setName("Benni");
        benny.setNoBp("1911082003");
        benny.setAddress("Solok");
        benny.setAge(19);
        benny.setEnglishGrade(100);
        benny.setMathGrade(75.3);
        benny.setScienceGrade(80.0);

        System.out.println("Nama               :"+anna.getName());
        System.out.println("NoBP               :"+anna.getNoBp());
        System.out.println("Alamat             :"+anna.getAddress());
        System.out.println("Umur               :"+anna.getAge());
        System.out.println("Nilai Bahasa Ing   :"+anna.getEnglishGrade());
        System.out.println("Nilai Math         :"+anna.getMathGrade());
        System.out.println("Nilai Sains        :"+anna.getScienceGrade());
        System.out.println("Rata-rata          :"+anna.getAverageGrade());
        System.out.println("");
        System.out.println("Nama               :"+benny.getName());
        System.out.println("NoBP               :"+benny.getNoBp());
        System.out.println("Alamat             :"+benny.getAddress());
        System.out.println("Umur               :"+benny.getAge());
        System.out.println("Nilai Bahasa Ing   :"+benny.getEnglishGrade());
        System.out.println("Nilai Math         :"+benny.getMathGrade());
        System.out.println("NIlai Sains        :"+benny.getScienceGrade());
        System.out.println("Rata-rata          :"+benny.getAverageGrade());
    }
}

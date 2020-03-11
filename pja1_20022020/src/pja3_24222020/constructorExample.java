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
public class constructorExample {
    public static void main(String[] args) {
        studentRecord annaRecord = new studentRecord("Anna");
        studentRecord beahRecord = new studentRecord("Beah","Philippines");
        studentRecord chrisRecord = new studentRecord(80, 90, 100);
        
        //print methods
        annaRecord.print(annaRecord.getName() ); 
        annaRecord.print(annaRecord.getEnglishGrade(), annaRecord.getMathGrade(), annaRecord.getScienceGrade()); 
        System.out.println();
        beahRecord.print(  beahRecord.getName() ); 
        beahRecord.print(  beahRecord.getEnglishGrade(), annaRecord.getMathGrade(), annaRecord.getScienceGrade()); 
        System.out.println();
        chrisRecord.print(  chrisRecord.getName() ); 
        chrisRecord.print(  chrisRecord.getEnglishGrade(), annaRecord.getMathGrade(), annaRecord.getScienceGrade()); 
    }
}
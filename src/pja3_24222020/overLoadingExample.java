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


public class overLoadingExample {
    public static void main( String[] args ) { 
        
    studentRecord annaRecord = new studentRecord("Anna","Padang");  
 
    //annaRecord.setName("Anna"); 
    //annaRecord.setAddress("Philippines"); 
    //annaRecord.setAge(15); 
    //annaRecord.setMathGrade(80); 
    //annaRecord.setEnglishGrade(95.5); 
    //annaRecord.setScienceGrade(100); 
 
    //overloaded methods  
    annaRecord.print(  annaRecord.getName() ); 
    annaRecord.print(  annaRecord.getEnglishGrade(), annaRecord.getMathGrade(), annaRecord.getScienceGrade()); 
    }
}

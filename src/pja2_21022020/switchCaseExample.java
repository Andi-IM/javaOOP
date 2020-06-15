/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja2_21022020;

/**
 *
 * @author Andi
 */
public class switchCaseExample {
    public static void main(String[] args) {
        int grade = 92;   
        switch(grade){   
            case 100:                  
                System.out.println( "A" );                 
                break;                   
            case 90:                
                System.out.println("B" );                 
                break;  
            case 80:                
                System.out.println("C" );                 
                break;  
            case 45:
                System.out.println("D");
            default:                
                System.out.println("E");          
        }      
    }  
} 

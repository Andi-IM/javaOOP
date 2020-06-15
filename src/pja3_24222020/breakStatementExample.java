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
public class breakStatementExample {
     public static void main(String[] args) {
        String name[] = {
            "Anjing", "Babi", "Monyet", "Cebong", "Kampret"
        };
        
        String searchName = "Bebek";
        boolean foundName = false;
         for (int i = 0; i<name.length; i++) {
             if (name[i].equals(searchName)) {
                 foundName = true;
                 break;
             }
         }
         
         if (foundName) {
             System.out.println(searchName+", ketemu kau!");
         } else {
             System.out.println(searchName+", awas kau!");
         }
    }
}

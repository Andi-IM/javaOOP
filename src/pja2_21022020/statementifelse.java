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
public class statementifelse {

    public static void main(String[] args) {
        int nilai = 50;
        if (nilai > 90) {
            System.out.println("Very good");
        } else if (nilai > 60) {
            System.out.println("good");
        } else {
            System.err.println("Sorry you fail");
        }
    }
}

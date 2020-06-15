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
public class continueStatementExample {
    public static void main(String[] args) {
        String name[] = {
            "Anjing", "Babi", "Monyet", "Cebong", "Kampret", "Anjing"
        };
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (!name[i].equals("Anjing")) {
                continue;
            } count++;
        }
        System.out.println("Jumlah yang bernama Anjing "+count);
    }
}

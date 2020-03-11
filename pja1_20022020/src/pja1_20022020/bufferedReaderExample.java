package pja1_20022020;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Andi
 */
public class bufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String name = "";
        System.out.println("Mohon inputkan Nama Anda : ");
        try {
           name = dataIn.readLine();
        } catch (IOException e) {
            System.out.print("error");
        }
        System.out.println("Hello "+name+"!");
    }
    
}

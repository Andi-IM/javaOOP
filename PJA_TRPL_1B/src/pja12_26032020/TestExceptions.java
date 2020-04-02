/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja12_26032020;

/**
 *
 * @author Andi
 */
public class TestExceptions {
    public static void main(String[] args) {
        try{
                    for (int i = 0; true; i++) {
            System.out.println("args["+i+"]="+args[i]);
            }

        }catch(Exception ex){
            System.out.println("Error "+ex.getMessage());
            }
    }
}

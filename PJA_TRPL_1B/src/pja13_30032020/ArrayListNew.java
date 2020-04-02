/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pja13_30032020;

import java.util.*;

/**
 * @author Andi
 * 
 */
public class ArrayListNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("alvin");
        list_Strings.add("syarif");
        list_Strings.add("tiara");
        
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }

}

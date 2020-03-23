/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja11_23032020;

/**
 *
 * @author Andi
 */
public class MyInteger implements Relation{
    @Override
    public boolean isGreater(Object a, Object b){
        int nilai_a = (int) a;
        int nilai_b = (int) b;
        return nilai_a > nilai_b;
    }

    @Override
    public boolean isLess(Object a, Object b) {
       int nilai_a = (int) a;
       int nilai_b = (int) b;
       return nilai_a < nilai_b;
    }

    @Override
    public boolean isEqual(Object a, Object b) {
       int nilai_a = (int) a;
       int nilai_b = (int) b;
       return nilai_a == nilai_b; 
    }
}

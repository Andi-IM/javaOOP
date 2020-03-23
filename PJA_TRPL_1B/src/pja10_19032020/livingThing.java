/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja10_19032020;

/**
 *
 * @author Andi
 */
public abstract class livingThing{
    public void breath(){
        System.out.println("Living Thing breathing...");
    }
    
    public void eat(){
        System.out.println("Living Thing eating...");
    }
    
    /**
     * abstract mehod walk
     * Kita ingin mehthod ini di-overidden oleh subclasses
     */
    public abstract void walk();    
}

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
public class Human extends livingThing{
    @Override
    public void walk(){
        System.out.println("Human walks...");
    }
    @Override
    public void eat(){
        System.out.println("Human eats...");
    }
    @Override
    public void breath(){
        System.out.println("Human breath...");
    }
}

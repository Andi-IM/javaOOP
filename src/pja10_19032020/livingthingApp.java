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
public class livingthingApp {
    public static void main(String[] args) {
        Human human = new Human();
        human.breath();
        human.eat();
        human.walk();
        
        Dog dog = new Dog();
        dog.breath();
        dog.eat();
        dog.walk();
    }
}

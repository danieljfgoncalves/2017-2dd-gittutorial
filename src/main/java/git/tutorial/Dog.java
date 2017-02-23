/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tutorial;

/**
 *
 * @author Meireles
 */
public class Dog extends Animal{

    private int numberOfLegs;

    public Dog() {
        numberOfLegs = 4;
    }

    @Override
    public void makeSound() {
        System.out.println("Auff auff");
    }

    @Override
    public int numberOfLegs() {
        return numberOfLegs;
    }
}
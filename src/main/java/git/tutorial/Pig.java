/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tutorial;

/**
 *
 * @author Pedro Fernandes
 */
public class Pig extends Animal{

    public Pig () {
    }

    public void makeSound(int loudness) {
        System.out.println("oinc oinc");
    }

    public int numberOfLegs() {
        return 5;
    }

}

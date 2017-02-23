/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tutorial;

/**
 *
 * @author João
 */
public class Bird extends Animal {

    private static final int NUMBEROFLEGS = 2;

    public Bird() {

    }

    public void makeSound(int son) {
        System.out.println("piu piu");
    }

    @Override
    public int numberOfLegs() {
        return NUMBEROFLEGS;
    }
}

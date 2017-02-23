/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tutorial;

/**
 *
 * @author Henrique Oliveira [1150738@isep.ipp.pt]
 */
public class Cricket extends Animal {

    private static final int NUMBER_OF_LEGS = 4;

    public Cricket() {
    }

    public void makeSound() {
        System.out.println("cri cri");
    }

    @Override
    public int numberOfLegs() {
        return NUMBER_OF_LEGS;
    }
}

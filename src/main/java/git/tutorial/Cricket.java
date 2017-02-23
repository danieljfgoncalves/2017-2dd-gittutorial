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

    private void test() {
        String x = "test";
        String y = "new";
        int i = 0;
    }

    public Cricket() {
    }

    public void makeSound(int loudness) {
        System.out.println("cri cri");
    }

    private void something() {
        //this is just a demo
    }

    public int numberOfAntenas() {
        return 2;
    }

    @Override
    public int numberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    private void nova() {
        int y = 0;
        y++;
    }
}

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

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mindOfAPig(){
        System.out.println("My dream is to be the tastiest BigMac!");
    }
}

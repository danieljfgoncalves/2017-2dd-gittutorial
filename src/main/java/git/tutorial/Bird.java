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
    private static final int SIZENOZZLE = 2;

    public Bird() {

    }

    public void makeSound(int son) {
        System.out.println("piu piu");
        System.out.println("pipipipipipipipipiipiuuuuuuu");
    }
    
    public void fly(){
        System.out.println("flying");
    }

    @Override
    public int numberOfLegs() {
        return NUMBEROFLEGS;
    }
    
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private int nozzleSize(){
        return SIZENOZZLE;
    }
}

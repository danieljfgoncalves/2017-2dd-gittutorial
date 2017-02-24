/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tutorial;

/**
 *
 * @author Sofia
 */
public class Donkey extends Animal{

    public Donkey() {
    }
    
    public void makeSound(int loudness) {
    System.out.println("ió ió");
    }
    
    public int donkeyWalk(int meters){
        int steps=0;
        for(int i=0; i<meters; i++){
            steps+=2;
        }
        return steps;
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
    
}

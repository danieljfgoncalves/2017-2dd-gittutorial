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
public class Dog extends Animal {

    private int numberOfLegs;

    public Dog() {
        numberOfLegs = 4;
    }

    @Override
    public void makeSound(int loudness) {
        //TODO not all dogs bark the same way
        System.out.println("Auff auff");
    }


    public void whipTail(int howMuch){
        System.out.printf("I'll whip my tail %d times!", howMuch);
    }

    @Override
    public int numberOfLegs() {
        return numberOfLegs;
    }
    
    public void run() {
        System.out.println("tac tac tac tac ...");
    }
    
    public Dog giveBirth(){
        return new Dog();
    }
}

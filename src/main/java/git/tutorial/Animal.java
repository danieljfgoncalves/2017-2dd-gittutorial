/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tutorial;

/**
 *
 * @author pgsou_000
 */
public abstract class Animal {

    public Animal() {
    }

    /** **/
    public boolean isOdd(int x) {
        System.out.println("Comentário qualquer!!!");
        return x % 2 != 0;
    }

    public abstract void makeSound(int loudness);

    public abstract int numberOfLegs();

    public abstract void walk();

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public void doSomething() {
        System.out.println("doing something...");
    }

    /**
     * returns the age of the animal
     *
     * @return the age of the animal
     */
    private int age() {
        //FIXME this should be abstract
        throw new UnsupportedOperationException();
    }
}

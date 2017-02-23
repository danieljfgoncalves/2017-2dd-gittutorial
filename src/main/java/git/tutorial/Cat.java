/*
 * Package for tutorial concepts.
 */
package git.tutorial;

/**
 * Represents a cat.
 *
 * @author Tiago Correia, 1151031
 * @author Ivo Ferro, 1151159
 * @author Pedro Fernandes, 1060503
 */
public class Cat extends Animal {

    public Cat() {
    }

    public void makeSound() {
        System.out.println("miau");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
    
    public void walk() {
    }
}

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

    public void makeSound(int loudness) {
        System.out.println("miau");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
    
    public void eatMouse() {
        System.out.println("hmmmmmmmmmmmmm taaaaaaastyyyyyyy");
    }
    
    
}

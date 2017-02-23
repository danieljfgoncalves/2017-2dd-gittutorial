/*
 * Package for tutorial purposes.
 */
package git.tutorial;

/**
 *
 * @author Meireles
 * @author Ivo Ferro, 1151159
 */
public class Dog extends Animal {

    // Watch out for the warnings and code smells!
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
}

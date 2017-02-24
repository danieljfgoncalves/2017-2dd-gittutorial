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
        numberOfLegs = 6;
        numberOfLegs = 4;
    }

    @Override
    public void makeSound(int loudness) {
        //TODO not all dogs bark the same way
        System.out.println("Auff auff");
    }

    public void whipTail(int howMuch) {
        System.out.printf("I'll whip my tail %d times!", howMuch);
    }

    @Override
    public int numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Prints the reaction of the dog to a specific cause
     * @param cause - cause for the dog's reaction
     * CAUSE_OWNER = 0;
     * CAUSE_CAT = 1;
     * CAUSE_STRANGE_NOISE = 2;
     * CAUSE_TIRED = 3;
     */
    public static void dogReaction(int cause) {
        switch (cause) {
            case 0:
                System.out.println("Dog is very happy because its owner arrived!!!");
                break;
            case 1:
                System.out.println("Dog barks loudly because a cat walked by");
                break;
            case 2:
                System.out.println("Dog owls because he heard a strange noise");
                break;
            case 3:
                System.out.println("Dog layed in his bed because he was tired");
                break;
            default:
                System.out.println("Dog is confused");
                break;
        }
    }

    public void run() {
        System.out.println("tac tac tac tac ...");
    }

    public void walk() {
        System.out.println("tuc tuc tuc tuc ...");
    }
    
    public void sleep(int hours) {
        System.out.println("Dreaming about chasing cats for " + hours + " hours");
    }
}

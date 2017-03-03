package git.tutorial;

/**
 *
 * @author Eric
 */
public class Rooster extends Animal {
    
    private static final int NUM_LEGS = 2;

    public Rooster() {
    }

    public void makeSound(int loudness) {
        System.out.println("cócórócócó");
    }

    @Override
    public int numberOfLegs() {
        return NUM_LEGS;
    }
}

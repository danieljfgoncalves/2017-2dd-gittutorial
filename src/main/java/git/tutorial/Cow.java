package git.tutorial;

/**
 *
 * @author USER
 */
public class Cow extends Animal {

    public Cow() {
    }

    @Override
    public void makeSound(int loudness) {
        System.out.println("muuuuu");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
}

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
    
    public int giveMilk(){
        throw new IllegalArgumentException("No milk available");
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
    
    
}

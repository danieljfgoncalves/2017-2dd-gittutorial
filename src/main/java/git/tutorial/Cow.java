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

    public int giveMilk() {
        throw new IllegalArgumentException("No milk available");
    }

    public void sleep() {
        System.out.println("zzz");
    }

    public Cow giveBirth() {
        Cow child = new Cow();
        return child;
    }

    public void eatGrass(int hours) {
        System.out.println("nhamnham");
        makeSound(1);
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

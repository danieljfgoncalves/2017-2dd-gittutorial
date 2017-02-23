package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Turkey extends Animal{

    public Turkey() {
    }

    public void makeSound(int loudness) {
        System.out.println("glu glu");
    }

    public int numberOfLegs() {
        return 2;
    }
}

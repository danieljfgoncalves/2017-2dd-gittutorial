package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Turkey extends Animal{

    private static int LEGS_OF_TURKEY = 9;

    public Turkey() {
    }

    public void makeSound(int loudness) {
        System.out.println("glu glu");
    }

    public int numberOfLegs() {
        int legs = LEGS_OF_TURKEY;
        legs = legs + 2;
        legs = legs - LEGS_OF_TURKEY;
        return 2;
    }
}

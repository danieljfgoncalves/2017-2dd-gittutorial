package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Turkey extends Animal {

    public Turkey() {
    }

    public Turkey haveChild() {
        return new Turkey();
    }

    public void makeSound(int loudness) {
        System.out.println("glu glu");
    }

    public int numberOfLegs() {
        return 2;
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

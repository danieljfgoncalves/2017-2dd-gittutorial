package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Sheep extends Animal {

    public Sheep() {

    }

    public void makeSound(int loudness) {
        System.out.println("mêêê");
    }

    public int numberOfLegs() {
        return 4;
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

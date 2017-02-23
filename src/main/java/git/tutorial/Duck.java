package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Duck extends Animal {

    public Duck() {
    }

    public void makeSound() {
        System.out.println("qua qua");
    }

    @Override
    public int numberOfLegs() {
        return 2;
    }
    
    void quack() {
        makeSound();
    }
    
}

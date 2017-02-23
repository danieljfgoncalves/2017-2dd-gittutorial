package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Duck extends Animal {

    private int size;
    
    public Duck() {
        size = 30;
    }

    public void makeSound(int loudness) {
        System.out.println("qua qua");
    }

    @Override
    public int numberOfLegs() {
        return 2;
    }

    void sleep() {
    }

    void quack() {
        makeSound(1);
    }

    public void swim() {
    }

    public void fly() {
    }

    void layEgg() {
    }
    
    public int size() {
        return size;
    }
}

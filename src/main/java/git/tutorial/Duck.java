package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Duck extends Animal {

    private String owner;

    public Duck() {
        owner = "Miguel";
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
    
    public void swim() {
    }
    
    public void fly() {
    }

    void layEgg() {
    }

    public String owner() {
        return owner;
    }

}

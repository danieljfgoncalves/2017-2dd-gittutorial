package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 *
 * @author Ivo Ferro, 1151159
 */
public class Duck extends Animal {

    private static final int LEGS_NUMBER = 2;

    public Duck() {
    }

    public void makeSound() {
        System.out.println("qua qua qua");
    }

    @Override
    public int numberOfLegs() {
        return LEGS_NUMBER;
    }

    void sleep() {
    }
    
    void quack() {
        makeSound();
    }
    
    public void swim() {
    }
    
    public void fly() {
    }

    void layEgg() {
    }
    
    private void color(){
        System.out.println("yellow");
    }
}

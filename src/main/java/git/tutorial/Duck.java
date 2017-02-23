package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Duck extends Animal {
    
    private static final String DECENT_OWNER = "Meireles";
    
    private static final int LEGS_NUMBER = 2;

    private String owner;

    public Duck() {
        owner = "Miguel";
    }

    public void makeSound(int loudness) {
        System.out.println("qua qua");
    }

    @Override
    public int numberOfLegs() {
        return LEGS_NUMBER;
    }
    
    private void setDecentOwner() {
        owner = DECENT_OWNER;
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

    public String owner() {
        return owner;
    }
    
    private void color(){
        System.out.println("yellow");
    }
    
    void eat(){
        
    }

}

package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Duck extends Animal {
    
    private static final String DECENT_OWNER = "Meireles";
    
    private int size;
    
    private static final int LEGS_NUMBER = 2;

    private String owner;

    public Duck() {
        size = 30;
        owner = "Miguel";
    }

    public void shake() {
        System.out.println("I'm shaking my booty! Qua qua");
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
        System.out.println("ZzzZzzZzz");
    }

    void quack() {
        makeSound(1);
    }

    public void swim() {
        System.out.println("splash splash");
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
        System.out.println("mhom mhom");
    }
    
    public int size() {
        return size;
    }
    
    private String name(){
        return "Duck Donald.";
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void blink() {
        System.out.println("I'm blinking so hard and I can't stop!");
    }
    
    public void play() {
        System.out.println("Wasssuuuuupppp");
    }

    public void swimming() {
        System.out.println("squah squah!");
    }
}

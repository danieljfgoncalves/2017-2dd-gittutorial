package git.tutorial;

/**
 *
 * @author USER
 */
public class Cow extends Animal {

    public Cow() {
    }

    @Override
    public void makeSound(int loudness) {
        System.out.println("muuuuu");
    }
    
    public int giveMilk(){
        throw new IllegalArgumentException("No milk available");
    }
    
    public Cow giveBirth(){
        Cow child = new Cow();
        return child;
    }
    
    public void eatGrass(int hours){
        System.out.println("nhamnham");
        makeSound(1);
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
    
    
}

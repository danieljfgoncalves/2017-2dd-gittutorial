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


    public void forTheConflict(int howBad){
        for(int i = 0; i < howBad;i++){
            System.out.println("Very Very Badass conflict");
        }
    }
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

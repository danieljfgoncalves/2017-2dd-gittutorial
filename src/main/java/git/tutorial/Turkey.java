package git.tutorial;

/**
 * Created by j040_ on 23/02/2017.
 */
public class Turkey extends Animal {

    private static int LEGS_OF_TURKEY = 9;
    
    private static boolean IS_CHRISTMAS = true;

    public Turkey() {
    }

    public Turkey haveChild() {
        return new Turkey();
    }

    public void makeSound(int loudness) {
        System.out.println("glu glu");
    }

    public int numberOfLegs() {
        int legs = LEGS_OF_TURKEY;
        legs = legs + 2;
        legs = legs - LEGS_OF_TURKEY;
        return 2;
    }

    public void eat() {
        System.out.println("hummmmm tasty!!!!!");
    }
    
    public void goToDinnerTable() {
        if(IS_CHRISTMAS){
            System.out.println("NOOOOOOOOOOOO");
        }
        throw new UnsupportedOperationException("It is not Christmas yet.");
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void sleep() {

        System.out.println("zzzzzzzzzzzzzz");
    }
}

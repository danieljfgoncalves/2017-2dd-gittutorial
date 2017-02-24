package git.tutorial;

/**
 *
 * @author Eric
 */
public class Rooster extends Animal {
    
    private static final int NUM_LEGS = 2;

    public Rooster() {
    }

    public void whatDoesTheRoosterDo(){
        System.out.println("When I'm traveling abroad, my first question usually relates to barnyard animals. What do your roosters say? is a good icebreaker, as every country has its own unique interpretation. In Germany, where dogs bark vow vow and both the frog and the duck say quack, the rooster greets the dawn with a hearty kik-a-ricki. Greek roosters crow kiri-a-kee, and in France they scream coco-rico, which sounds like one of those horrible premixed cocktails with a pirate on the label. When told that an American rooster says cock-a-doodle-doo, my hosts look at me with disbelief and pity.");
    }

    public void makeSound(int loudness) {
        System.out.println("cócórócócó");
    }

    @Override
    public int numberOfLegs() {
        return NUM_LEGS;
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The KilgoreTrout class can be used as a model for your own class that represents you and your seating location in AP CSA.
 * 
 * @author Kavya
 * @version 1.0 Sept 2025
 */
public class KavyaSrivastava extends Student implements SpecialInterestOrHobby
{
    /**
     * Constructor for the KavyaSrivastava class.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     */
    public KavyaSrivastava(String f, String l, int r, int s) {
        firstName = f;
        lastName = l;
        mySeatX = r;
        mySeatY = s;
        portraitFile = f.toLowerCase() + l.toLowerCase() + ".jpeg";    
        standingFile = f.toLowerCase() + l.toLowerCase() + "-standing.jpeg";
        soundFile = f.toLowerCase() + l.toLowerCase() + ".wav";  
        setImage(portraitFile);
        sitting = true;
    }
    
    /**
     * Default constructor, if you don't pass in a name and seating location.
     */
    public KavyaSrivastava() {
        firstName = "Kavya";
        lastName = "Srivastava";
        mySeatX = 8;  // pick your row
        mySeatY = 6;  // pick your seat
        portraitFile = "kavyasrivastava.jpeg";
        standingFile = "kavyasrivastava-standing.jpeg";
        soundFile = "kavyasrivastava.wav";
        setImage(portraitFile);
        sitting = true;
    }
    
    /**
     * Act - do whatever the KavyaSrivastava actor wants to do.
     */   
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            sitting = false;
            setImage(standingFile);
            System.out.println(""); // Print a blank line for clarity
            getName();
            sayName(soundFile);
            myHobby("I like to read and bake!");
            spinAround();  // <-- my custom animation
            sitDown();
        }
    } 
    
    /**
     * Prints the first and last name to the console.
     */
    public void getName() {
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.
     */
    public void myHobby(String s) {
        System.out.println(s);
    }

    /**
     * A custom animation for the student avatar.
     * This spins the image around once before returning to seat.
     */
    public void spinAround() {
        GreenfootImage original = getImage(); // save original image
        for (int i = 0; i < 36; i++) {
            GreenfootImage rotated = new GreenfootImage(original);
            rotated.rotate(i * 10);
            setImage(rotated);
            Greenfoot.delay(3);
        }
        setImage(original); // reset image
        returnToSeat();
    }
}

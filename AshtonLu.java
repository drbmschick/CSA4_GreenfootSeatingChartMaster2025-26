import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The AshtonLu class can be used as a model for your own class that represents you and your seating location in AP CSA
 * * @author Ashton Lu
 * @version 1.0 Aug 29, 2025
 */
public class AshtonLu extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the AshtonLu class.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * */
    public AshtonLu(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    /**
     * Default constructor, if you don't pass in a name and seating location
     */
    public AshtonLu() {
        firstName="Ashton";
        lastName="Lu";
        mySeatX=4;
        mySeatY=4;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    /**
     * Act - do whatever the AshtonLu actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            sitting=false;
            setImage(standingFile);
            System.out.println(""); // Print a blank line for spacing
            getName();
            sayName(soundFile);
            
            myHobby("I have a record of 211 wpm on Monkeytype!");
            
            // Call your special method here
            spinAvatar();
            
            sitDown();
        }
    }
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    /**
     * A method to animate the character by making it spin.
     */
    public void spinAvatar(){
        for (int i = 0; i < 360; i += 10) {
            GreenfootImage image = getImage();
            image.rotate(10);
            setImage(image);
            Greenfoot.delay(1);
        }
        // Set the image back to its original rotation
        setImage(portraitFile);
    }
    
    /**
     * myHobby is one of the interfaces provided.
     */
    public void myHobby(String s) {
        System.out.println(s);
    }
}
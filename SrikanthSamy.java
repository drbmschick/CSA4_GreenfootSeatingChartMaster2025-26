import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The SrikanthSamy class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Srikanth Samy
 * @version 1.0 Sep 10, 2025
 */
public class SrikanthSamy extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the SrikanthSamy class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public SrikanthSamy(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public SrikanthSamy() {
        firstName="Srikanth";
        lastName="Samy";
        mySeatX=3;
        mySeatY=4;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the SrikanthSamy actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
                System.out.println("CLICKED! Starting animation...");
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I love coding and building awesome applications!");
            
                spiralDance();  // Srikanth's special method - a spiral dance movement
           
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
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */

   
    /**
     * This is a local method specific to the SrikanthSamy class used to animate the character once the image is clicked on.
     */
    public void spiralDance(){
        
        // Simple movement test - just move in a small square
        setLocation(4,4);
        Greenfoot.delay(15);
        setLocation(5,4);
        Greenfoot.delay(15);
        setLocation(5,5);
        Greenfoot.delay(15);
        setLocation(4,5);
        Greenfoot.delay(15);
        setLocation(3,5);
        Greenfoot.delay(15);
        setLocation(2,5);
        Greenfoot.delay(15);
        setLocation(2,4);
        Greenfoot.delay(15);
        setLocation(2,3);
        Greenfoot.delay(15);
        setLocation(3,3);
        Greenfoot.delay(15);
        setLocation(4,3);
        Greenfoot.delay(15);
        
        Greenfoot.delay(20);
        returnToSeat();
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}

}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The RevanthGuda class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class RevanthGuda extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the RevanthGuda class.
     */
    public RevanthGuda(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".mp3";  // Make sure to name your sound files firstlast.mp3, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    
    /**
     * Default constructor - Fixed coordinates to match your seating position
     */
    public RevanthGuda() {
        firstName="Revanth";
        lastName="Guda";
        mySeatX=6;  // Fixed: matches your actual seat position
        mySeatY=9;  // Fixed: matches your actual seat position
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".mp3";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the RevanthGuda actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            sitting=false;
            setImage(standingFile);
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);  // Fixed: use the soundFile variable instead of hardcoded string
        
            myHobby("I like to code in my freetime!");
            
            // Your custom animation
            circleClass();  
       
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
     * Custom animation method - moves around the classroom in a rectangular path
     */
    public void circleClass(){
        // Save original position
        int originalX = getX();
        int originalY = getY();
        
        // Start from current position and move in a rectangle
        // Move right
        for (int i = originalX; i <= originalX + 4; i++){
            setLocation(i, originalY);
            Greenfoot.delay(10);
        }
        
        // Move down
        for (int i = originalY; i <= originalY + 3; i++){
            setLocation(originalX + 4, i);
            Greenfoot.delay(10);
        }      
        
        // Move left
        for (int i = originalX + 4; i >= originalX; i--){
            setLocation(i, originalY + 3);
            Greenfoot.delay(10);
        }      
        
        // Move up
        for (int i = originalY + 3; i >= originalY; i--){
            setLocation(originalX, i);
            Greenfoot.delay(10);
        }   
        
        Greenfoot.delay(20);
        returnToSeat();
    }
    
     /**
     * myHobby is one of the interfaces provided.  
     */
     public void myHobby(String s) {
         System.out.println(s);
    }
}
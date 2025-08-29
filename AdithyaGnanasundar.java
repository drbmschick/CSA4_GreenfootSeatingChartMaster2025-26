import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AdithyaGnanasundar extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the AdithyaGnanasundar class.
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
    public AdithyaGnanasundar(String f, String l, int r, int s) {
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
    public AdithyaGnanasundar() {
        firstName="Adithya";
        lastName="Gnanasundar";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I like to read books!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                zigzagDance();  // My unique zigzag dance animation with visual effects!
           
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
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void zigzagDance(){
        // Start from current position and do a zigzag dance pattern
        int startX = getX();
        int startY = getY();
        
        // Save original image for restoration
        GreenfootImage originalImage = getImage();
        
        // Dance pattern 1: Zigzag across the top
        for (int i = 0; i <= 9; i += 2) {
            setLocation(i, 0);
            // Make image slightly larger for effect
            getImage().scale(getImage().getWidth() + 5, getImage().getHeight() + 5);
            Greenfoot.delay(8);
        }
        
        // Dance pattern 2: Diagonal zigzag down
        for (int i = 0; i <= 5; i++) {
            int x = 9 - i;
            int y = i;
            setLocation(x, y);
            // Rotate image slightly
            getImage().rotate(15);
            Greenfoot.delay(8);
        }
        
        // Dance pattern 3: Spiral inward
        for (int i = 0; i <= 4; i++) {
            setLocation(4 - i, 4 - i);
            // Make image smaller for spiral effect
            getImage().scale(getImage().getWidth() - 3, getImage().getHeight() - 3);
            Greenfoot.delay(8);
        }
        
        // Dance pattern 4: Bounce back to center
        for (int i = 0; i <= 4; i++) {
            setLocation(4 + i, 4 + i);
            // Restore original size
            getImage().scale(originalImage.getWidth(), originalImage.getHeight());
            Greenfoot.delay(8);
        }
        
        // Final flourish: spin in place
        for (int i = 0; i < 4; i++) {
            getImage().rotate(90);
            Greenfoot.delay(10);
        }
        
        // Restore original image
        setImage(originalImage);
        Greenfoot.delay(15);
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
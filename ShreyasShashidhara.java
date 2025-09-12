import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents Shreyas Shashidhara and his seating/behavior in the classroom.
 * Modeled after AtharvaSharma: sits, on click stands, says name/hobby,
 * moves around, then returns to seat and sits down.
 */
public class ShreyasShashidhara extends Student implements SpecialInterestOrHobby {

    /**
     * Full constructor used if you want to specify name and seat.
     */
    public ShreyasShashidhara(String f, String l, int r, int s) {
        firstName = f;
        lastName = l;
        mySeatX = r;
        mySeatY = s;
        portraitFile = (f + l).toLowerCase() + ".png";
        standingFile = (f + l).toLowerCase() + "-standing.png";
        soundFile = (f + l).toLowerCase() + ".wav"; // optional if provided
        // Set and scale portrait image to fit a 60x60 cell
        GreenfootImage portrait = new GreenfootImage(portraitFile);
        portrait.scale(60, 60);
        setImage(portrait);
        sitting = true;
    }

    /**
     * Default constructor with seat 5,3.
     */
    public ShreyasShashidhara() {
        firstName = "Shreyas";
        lastName = "Shashidhara";
        mySeatX = 5;
        mySeatY = 3;
        portraitFile = (firstName + lastName).toLowerCase() + ".png"; // images/shreyasshashidhara.png
        standingFile = (firstName + lastName).toLowerCase() + "-standing.png"; // images/shreyasshashidhara-standing.png
        soundFile = (firstName + lastName).toLowerCase() + ".wav"; // place in sounds/ if available
        // Set and scale portrait image to fit a 60x60 cell
        GreenfootImage portrait = new GreenfootImage(portraitFile);
        portrait.scale(60, 60);
        setImage(portrait);
        sitting = true;
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            sitting = false;
            // Set and scale standing image to 60x60
            GreenfootImage standing = new GreenfootImage(standingFile);
            standing.scale(60, 60);
            setImage(standing);
            System.out.println("");
            getName();
            // Play name clip if provided in sounds/ (safe to call even if missing)
            sayName(soundFile);
            myHobby("I love building cool CS projects!");
            circleClass();
            sitDown();
        }
    }

    /** Prints first and last name to console. */
    public void getName() {
        System.out.println("My name is " + firstName + " " + lastName);
    }

    /** Simple animation around the room, then return. */
    public void circleClass() {
        setLocation(0, 0);
        Greenfoot.delay(5);

        // move right across top
        for (int x = 1; x <= 14; x++) {
            setLocation(x, 0);
            Greenfoot.delay(5);
        }
        // move down right edge
        for (int y = 1; y <= 9; y++) {
            setLocation(14, y);
            Greenfoot.delay(5);
        }
        // move left across bottom
        for (int x = 14; x >= 0; x--) {
            setLocation(x, 9);
            Greenfoot.delay(5);
        }
        // move up left edge
        for (int y = 9; y >= 0; y--) {
            setLocation(0, y);
            Greenfoot.delay(5);
        }
        Greenfoot.delay(10);
        returnToSeat();
    }

    /** Required by SpecialInterestOrHobby interface. */
    public void myHobby(String s) {
        System.out.println(s);
    }

    /**
     * Ensure portrait remains 60x60 when sitting back down.
     */
    public void sitDown() {
        super.returnToSeat();
        GreenfootImage portrait = new GreenfootImage(portraitFile);
        portrait.scale(60, 60);
        setImage(portrait);
        sitting = true;
    }
}

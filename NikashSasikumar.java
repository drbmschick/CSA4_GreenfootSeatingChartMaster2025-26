import greenfoot.Greenfoot;

public class NikashSasikumar extends Student implements SpecialInterestOrHobby {
   public NikashSasikumar(String f, String l, int r, int s) {
      this.firstName = f;
      this.lastName = l;
      this.mySeatX = r;
      this.mySeatY = s;
      String var10001 = f.toLowerCase();
      this.portraitFile = var10001 + l.toLowerCase() + ".jpg";
      var10001 = this.firstName.toLowerCase();
      this.standingFile = var10001 + this.lastName.toLowerCase() + "-standing.jpg";
      var10001 = f.toLowerCase();
      this.soundFile = var10001 + l.toLowerCase() + ".wav";
      this.setImage(this.portraitFile);
      this.sitting = true;
   }

   public NikashSasikumar() {
      this.firstName = "Nikash";
      this.lastName = "Sasikumar";
      this.mySeatX = 5;
      this.mySeatY = 5;
      String var10001 = this.firstName.toLowerCase();
      this.portraitFile = var10001 + this.lastName.toLowerCase() + ".jpg";
      var10001 = this.firstName.toLowerCase();
      this.standingFile = var10001 + this.lastName.toLowerCase() + "-standing.jpg";
      var10001 = this.firstName.toLowerCase();
      this.soundFile = var10001 + this.lastName.toLowerCase() + ".wav";
      this.setImage(this.portraitFile);
      this.sitting = true;
   }

   public void act() {
      if (Greenfoot.mouseClicked(this)) {
         this.sitting = false;
         this.setImage(this.standingFile);
         System.out.println("");
         this.getName();
         this.sayName(this.soundFile);
         this.myHobby("I like to play the piano!");
         this.circleClass();
         this.sitDown();
      }

   }

   public void getName() {
      System.out.println("My name is " + this.firstName + " " + this.lastName);
   }

   public void circleClass() {
      this.setLocation(10, 10);
      Greenfoot.delay(10);

      int i;
      for(i = 3; i <= 12; ++i) {
         this.setLocation(i, 10);
         Greenfoot.delay(15);
      }

      for(i = 2; i <= 11; ++i) {
         this.setLocation(5, i);
         Greenfoot.delay(6);
      }

      Greenfoot.delay(10);
      this.returnToSeat();
   }

   public void myHobby(String s) {
      System.out.println(s);
   }
}

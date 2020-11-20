package paintingAWall;
import java.util.Scanner;
import java.lang.Math;
public class paintingAWall {
	 public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();
	      
	      // FIXME (1): Prompt user to input wall's width
	      
	      // Calculate and output wall area
	      wallArea = wallHeight * wallWidth;                        // FIXME (1): Calculate the wall's area
	      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
	      
	      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
	      double paintNeeded = wallArea / 350;
	      System.out.println("Paint needed: " + paintNeeded + " gallons");
	      
	      
	      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
	      int cansNeeded = (int) Math.round(paintNeeded);
	      System.out.println("Cans needed: " + cansNeeded + " can(s)");
	      
	   }

}

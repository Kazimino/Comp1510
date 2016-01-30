
package walk;
import java.util.Scanner;
/**
 * @author Justin
 *
 */
//************************************************************
//TestWalk.java
//
//Program to test methods in the RandomWalk class.
//************************************************************


public class TestWalk
{
    
    public static void main (String[] args)
    {
        
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int xCoord, yCoord; // starting x and y coordinates for a walk
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        
        System.out.print("Enter the starting x and y coordinates with "
                + "a space between: ");
        xCoord = scan.nextInt();
        yCoord = scan.nextInt();

        RandomWalk rw1 = new RandomWalk(10,5);
        RandomWalk rw2 = new RandomWalk(maxSteps,maxCoord,xCoord,yCoord);

        for(int i=1;i <=maxSteps; i++)
        {
            rw1.takeStep();
            rw2.takeStep();
            System.out.println(rw1);
            System.out.println(rw2);
        }

        System.out.println(rw1.getMaxDistance());
        System.out.println(rw2.getMaxDistance());


    }
}
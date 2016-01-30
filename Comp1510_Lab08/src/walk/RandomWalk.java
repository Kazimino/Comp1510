package walk;
import java.util.Random;

/**
 * @author Justin
 *
 */
public class RandomWalk 
{
    private int xCord;
    private int yCord;
    private int maxSteps;
    private int numSteps;
    private int edge;
    private int maxDistance;
    
    //-------------------------------------------------
    //Constructor to initialize max and edge
    //-------------------------------------------------
    public RandomWalk(int max, int edge) 
    {
        maxSteps = max;
        this.edge = edge;
        xCord = 0;
        yCord = 0;
        numSteps = 0;
        maxDistance = 0;
    }
    
    //-------------------------------------------------
    //overloaded Constructor
    //-------------------------------------------------
    public RandomWalk(int max, int edge, int startX, int startY) 
    {
        maxSteps = max;
        this.edge = edge;
        xCord = startX;
        yCord = startY;
        numSteps = 0;
        maxDistance = 0;
    }

    public int getX()
    {
        return xCord;
    }

    public int getY() 
    {
        return yCord;
    }

    public int getMaxDistance() 
    {
        return maxDistance;
    }

    public String toString() 
    {
        return "steps: " + numSteps + "; Position: (" + xCord + "," + yCord + ")";
    }

    public void takeStep() 
    {
        int step;
        Random walk = new Random();
        step = walk.nextInt(4);
        //case statement for each step taken
        switch (step) {
        case 0:
            xCord++;
            maxDistance = max(maxDistance, xCord);
            numSteps++;
            break;
        case 1:
            yCord++;
            maxDistance = max(maxDistance, yCord);
            numSteps++;
            break;
        case 2:
            xCord--;
            maxDistance = max(maxDistance, xCord);
            numSteps++;
            break;
        case 3:
            yCord--;
            maxDistance = max(maxDistance, yCord);
            numSteps++;
            break;
        }
    }

    public boolean moreSteps()
    {
        return (numSteps < maxSteps) ? true : false;
    }

    //-------------------------------------------------
    //uses conditional operator to check if xCord and yCord is 
    //greater than the edge and multiplies it by -1 to 
    //make it a positive value
    //this doesn't work, fix logic
    //-------------------------------------------------
    public boolean inBounds()
    {
        return (xCord <= edge && xCord >= edge * (-1) && yCord <= edge && yCord >= edge
                * (-1)) ? true : false;
    }

    public void walk()
    {
        while (this.moreSteps() && this.inBounds()) 
        {
            this.takeStep();
        }
    }

    private int max(int num1, int num2) 
    {
        return Math.abs((Math.abs(num1) >= Math.abs(num2)) ? num1 : num2);
    }

}
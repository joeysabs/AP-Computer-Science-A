
/**
 * This class defines a Circle object.
 * This has been added
 *
 * @author Joey Sabarese
 * @version 05/19/19
 */

public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int radius;

    // Constructor for objects of class Circle
    public Circle2(int x, int y, int radius)
    {
        // initialize instance variables
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getRadius()
    {
        return this.radius;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "center is at (" + this.x + ", " + this.y + ")";
    }

    public String getName()
    {
      return "Circle";
    }
}


/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 * This has been added
 *
 * @author Joey Sabarese
 * @version 05/19/19
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int length, int width)
    {
        // initialize instance variables
        this.length = length;
        this.width = width;
    }

    // return the height
    public int getLength()
    {
        return this.length;
    }

    // return the width
    public int getWidth()
    {
        return this.width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Rectangle - " + this.length + " X " + this.width;
    }

    public int getArea()
    {
      return this.length * this.width;
    }

    public void equals(Rectangle4 i, Rectangle4 j) // Only needed in one class because of the getArea method
    {
      if (i.getArea() == j.getArea())
        System.out.println(i + " is same size as " + j);
      else
        System.out.println(i + " is not the same size as " + j);
    }
}

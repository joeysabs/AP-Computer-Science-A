/** This program is to calculate the volume of a
 *  cylinder by using Object-Oriented Programming
 *  and to use other functions
 *
 * @author Joey Sabarese
 * @version 4/20/19
*/

public class CylinderV8
{
  //instance varibles
  private double myHeight, myBase, myRadius, myVolume, myDiff;
  private String mySize;

  //Constructor and Declaration of variables
  public CylinderV8(String s, double r, double h)
  {
    myRadius = r;
    myHeight = h;
    mySize = s;
    myBase = 0.0;
    myVolume = 0.0;
    myDiff = 0.0;
  }

  public void findBase() // mutator to find the base of a cylinder
  {
    myBase = Math.pow(myRadius , 2) * 3.14;
  }

  public void findVolume() // mutator to find the volume of a cylinder
  {
    myVolume = Math.pow(myRadius , 2) * 3.14 * myHeight;
  }

  public void findDiff() // mutator to find the difference between height and radius
  {
    myDiff = myHeight - myRadius;
  }

  public double getHeight() // getter method for height
  {
      return myHeight;
  }

  public double getRadius() // getter method for radius
  {
      return myRadius;
  }

  public double getBase() // getter method for base
  {
    return myBase;
  }

  public double getVolume() // getter mehtod for volume
  {
    return myVolume;
  }

  public double getDiff() // getter method for difference
  {
    return myDiff;
  }

  public String getSize() // getter method for size
  {
    return mySize;
  }

  public void setSize(String s) // setter method for size
  {
    mySize = s;
  }

  public void setRadius(double r) // setter method for radius
  {
    myRadius = r;
  }

  public void setHeight(double h) // setter method for height
  {
    myHeight = h;
  }

  public String toString() // Prints Cylinder infor to screen
  {
    return String.format("%-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f" , mySize,myRadius, myHeight, myBase, myVolume, myDiff);
  }
}

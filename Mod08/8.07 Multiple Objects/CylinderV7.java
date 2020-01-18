/** This program is to calculate the volume of a
 *  cylinder by using Object-Oriented Programming
 *  and to use other functions
 *
 * @author Joey Sabarese
 * @version 4/18/19
*/

public class CylinderV7
{
  private double myRadius; //Instance Variables
  private double myHeight;
  private String myName;

  public CylinderV7(String n, double h, double r) //constructor and declaration of variables
  {
    myHeight = h;
    myRadius = r;
    myName = n;
  }

  public double findBase() // to find the base of a cylinder
  {
    return Math.pow(myRadius , 2) * 3.14;
  }

  public double findVolume() // to find the volume of a cylinder
  {
    return Math.pow(myRadius , 2) * 3.14 * myHeight;
  }

  public double findDiff(CylinderV7 b) // to find the difference in heights of the cylinder
  {
    return myHeight - b.getHeight();
  }

  public double findDiff() // to find the difference between height and radius
  {
    return myHeight - myRadius;
  }

  public double getHeight() // accessor method for height
  {
      return myHeight;
  }

  public double getRadius() // accessor method for radius
  {
      return myRadius;
  }

  public String getName() // accessor method for name
  {
    return myName;
  }
}

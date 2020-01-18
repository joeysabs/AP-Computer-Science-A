/** This program is to calculate the volume of a
 *  cylinder by using Object-Oriented Programming
 *
 *
 * @author Joey Sabarese
 * @version 4/14/19
*/

public class CylinderV3
{
  public CylinderV3(){}

  public double findBase(double r)
  {
    return Math.pow(r , 2) * 3.14;
  }

  public double findVolume(double b, double h)
  {
    return b * h;
  }

  public static void main(String[] args)
  {
    double height, radius, base, volume;

    height = 5.5;
    radius = 2.2;

    CylinderV3 cylinder = new CylinderV3();

    base = cylinder.findBase(radius);
    volume = cylinder.findVolume(cylinder.findBase(radius) , height);
    System.out.printf("%27s%n", "Voulume of a Cylinder");
    System.out.println("----------------------------------------------------------");
    System.out.printf("%-15s%-15s%-15s%-15s%n" , "Radius (in)" , "Height (in)" , "Base (in^2)" , "Volume (in^3)");
    System.out.printf("%-15.2f%-15.2f%-15.2f%-15.2f" , radius , height , base , volume);
  }
}

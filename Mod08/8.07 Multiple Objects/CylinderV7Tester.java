/** This program is to create a table of object values
 *  and to use methods established in the class CylinderV7
 *
 *
 * @author Joey Sabarese
 * @version 4/18/19
*/

public class CylinderV7Tester
{
  public static void main(String[] args)
  {
    //Creation of objects
    CylinderV7 a = new CylinderV7("Big Can", 5.5, 2.2);
    CylinderV7 b = new CylinderV7("Medium Can" , 4.5, 2.2);
    CylinderV7 c = new CylinderV7("Small Can" , 2.5, 2.2);

    //Creates table of the objects
    System.out.printf("%35s%n", "Voulume of Cans");
    System.out.println("--------------------------------------------------------------------------------------------------");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n" , "Size" , "Radius (in)" , "Height (in)" , "Base (in^2)" , "Volume (in^3)", "Diff. Height and Radius");
    System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%n" , a.getName() ,a.getRadius() , a.getHeight() , a.findBase() , a.findVolume(), a.findDiff());
    System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%n" , b.getName() ,b.getRadius() , b.getHeight() , b.findBase() , b.findVolume(), b.findDiff());
    System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%n" , c.getName() ,c.getRadius() , c.getHeight() , c.findBase() , c.findVolume(), c.findDiff());
    System.out.println("Difference in height of Big Can and Small Can: " + a.findDiff(c));

  }
}

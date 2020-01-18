/** This program is to create a table of object values
 *  and to use methods established in the class CylinderV8
 *
 *
 * @author Joey Sabarese
 * @version 4/20/19
*/

public class CylinderV8Tester
{
  public static void main(String[] args)
  {
    CylinderV8[] cylinders = {new CylinderV8("Big Can",2.2, 5.5), new CylinderV8("Medium Can", 2.2, 4.5), new CylinderV8("Small Can", 2.2, 2.5)}; //Stores objects to an array

    // Sets names for table
    System.out.printf("%35s%n", "Voulume of Cans");
    System.out.println("--------------------------------------------------------------------------------------------------");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n" , "Size" , "Radius (in)" , "Height (in)" , "Base (in^2)" , "Volume (in^3)", "Diff. Height and Radius");

    //creates table of objects
    for( int i = 0; i < cylinders.length; i++)
    {
      cylinders[i].findBase();
      cylinders[i].findVolume();
      cylinders[i].findDiff();
      System.out.println(cylinders[i]);
    }
    //Declaring min, max, and average variables
    double minDiff, minVol;
    minDiff = minVol = Double.MAX_VALUE;
    double maxDiff, maxVol;
    maxDiff = maxVol = Double.MIN_VALUE;
    double averageVol = 0.0;
    double averageDiff = 0.0;

    //Finding min, max, and Average values
    for( int i = 0; i < cylinders.length; i++)
    {
      if (cylinders[i].getVolume() < minVol)
         minVol = cylinders[i].getVolume();
      if (cylinders[i].getVolume() > maxVol)
         maxVol = cylinders[i].getVolume();

      averageVol += cylinders[i].getVolume();

      if (cylinders[i].getDiff() < minDiff)
         minDiff = cylinders[i].getDiff();
      if (cylinders[i].getDiff() > maxDiff)
         maxDiff = cylinders[i].getDiff();

      averageDiff += cylinders[i].getDiff();
    }
    averageDiff /= cylinders.length;
    averageVol /= cylinders.length;

    //Printing min, max, and average values
    System.out.println("--------------------------------------------------------------------------------------------------");
    System.out.printf("%60s%9.2f%15.2f%n" , "Maximum: " , maxVol, maxDiff);
    System.out.printf("%60s%9.2f%15.2f%n" , "Minimum: " , minVol, minDiff);
    System.out.printf("%60s%9.2f%15.2f%n" , "Average: " , averageVol, averageDiff);


  }
}

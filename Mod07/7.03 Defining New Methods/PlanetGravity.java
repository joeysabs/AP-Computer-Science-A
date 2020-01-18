/** This program is to calculate and display the surface
 *  on different planets.
 *
 *
 * @author Joey Sabarese
 * @version 4/13/19
*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class PlanetGravity
{
  public static double[] findGravity( double[] r, double[] m)
  {
    double gravityConstant = 6.67e-11;
    double[] gravities = new double[r.length];

    for(int i = 0; i < r.length; i++){
     gravities[i] = (gravityConstant * m[i]) / Math.pow(r[i] , 2);
   }
   return gravities;
  }

  public static void planetFile(double[] g) throws IOException
  {
    File file = new File("PlanetGravities.txt");
    PrintWriter printWriter = new PrintWriter(file);

    for(int i = 0; i < 8; i++)
      printWriter.println(g[i]);

    printWriter.close();
  }

  public static void makeTable(String[] n, double[] d, double[] m, double[] g)
  {
    System.out.printf("%30s%n" , "Planetary Data");
    System.out.printf("%-15s%15s%15s%15s%n","Planet" , "Diameter (km)" , "Mass (kg)" , "g (m / s^2)");
    System.out.println("-------------------------------------------------------------");

    for(int i = 0; i < n.length; i++){
      System.out.printf("%-15s" , n[i]);
      System.out.printf("%10.1f" , d[i]);
      System.out.printf("%19.2E" , m[i]);
      System.out.printf("%15.2f%n" , g[i]);
    }
  }

  public static void main(String[] args) throws IOException
  {
    String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    double[] diameters = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
    double[] masses = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
    double[] radii = new double[planetNames.length];

    for(int i = 0; i < planetNames.length; i++)
      radii[i] = (diameters[i]/2) * 1000;

    planetFile(findGravity(radii , masses));
    makeTable(planetNames , diameters , masses , findGravity(radii , masses));

  }
}

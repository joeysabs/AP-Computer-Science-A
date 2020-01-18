/** This program is to calculate and display my weight
 *  on different planets.
 *
 *
 * @author Joey Sabarese
 * @version 4/13/19
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class PlanetWeights
{
  public static double[] findWeight(double m , double[] g)
  {
      double massG;
      double[] weights = new double[g.length];
      for (int i = 0; i < g.length; i++){
          massG = (m * (453.59237));
          weights[i] = (massG * (g[i] / 9.8)) / 453.59237;
      }
      return weights;
  }

  public static void makeTable1(String[] n , double[] g , double[] w)
  {
    System.out.printf("%30s%n" , "My weight on other planets");
    System.out.printf("%-15s%15s%15s%n" , "Planet" , "Gravity" , "Weight (lbs)");
    System.out.println("----------------------------------------------");
    for (int i = 0; i < n.length; i++){
      System.out.printf("%-15s" , n[i]);
      System.out.printf("%15.2f%15.2f%n" , g[i] , w[i]);
    }
  }

  public static double[] getGravities(File g) throws IOException
  {
    Scanner in = new Scanner(g);
    double[] gravities = new double[8];

    for(int i = 0; i < 8; i++)
      gravities[i] = in.nextDouble();

    return gravities;
  }

  public static void main(String[] args) throws IOException
  {
    String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    double myWeight = 100.0;
    File file = new File("PlanetGravities.txt");
    makeTable1(planetNames, getGravities(file) , findWeight(myWeight, getGravities(file)));
  }
}

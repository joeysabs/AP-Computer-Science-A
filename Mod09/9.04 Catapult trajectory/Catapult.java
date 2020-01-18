/** The purpose of this program is to calculate
 *  the distance of a projectile
 *
 *
 * @author Joey Sabarese
 * @version 4/28/19
 */

public class Catapult
{
  //Declaration of instance variables
  private double g, velMeters, distance;
  private double velocity, angle;
  private int[][] individualAges;
  private String[][] ageCategory;

  /**
   * Constructor for objects of type Catapult
   * @param v velocity mph
   * @param a angle
   * Precondition: a is positive
   */
  public Catapult(int v, double a)
  {
    velocity = v;
    angle = a;
    g = 9.8;
    velMeters = 0.0;
    distance = 0.0;
  }

  /**
   * Mutator method to calculate the velocity in meters per second.
   */
  public void calcMeters()
  {
    velMeters = velocity * 1609 / 3600;
  }

  /**
   * Mutator method to calculate the distance in meters.
   */
  public void calcDistance()
  {
    angle = Math.toRadians(angle);
    angle = Math.sin(2 * angle);
    distance = Math.pow(velMeters, 2) * angle / g;
  }

  /**
   * Mutator method to calculate the distance in Feet.
   */
  public void calcFeet()
  {
    distance = (distance * 100) / (2.54 * 12);
  }

  /**
   * Getter method to return the distance.
   * @return the distance.
   */
  public double getDistance()
  {
    return distance;
  }

  public double categoryAverage(String category)
       {
 double average = 0.0;
 int counter = 0;
 for(int i = 0; i < ageCategory.length; i++){
 for(int k = 0; k < ageCategory[0].length; k++){
 if (ageCategory[i][k].equals(category)){
 average += individualAges[i][k];
 counter++;
 }
 }
 }
 if (average == 0.0)
 return -1;
 else
 return average / counter;
       }
}

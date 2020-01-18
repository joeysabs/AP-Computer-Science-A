/**
 * This class tests Circle objects by printing the centers.
 *
 * @author Joey Sabarese
 * @version 05/19/19
 */

import java.util.ArrayList;
public class CircleTester
{
  public static String showCenter(Circle2 a)
  {
    return " the center is at " + a.getCenter();
  }

  public static void main(String[] args)
  {
    ArrayList<Circle2> circles = new ArrayList<Circle2>();

    circles.add(new Circle2(2, 4, 2));
    circles.add(new Cylinder2(10, 15, 2, 3));
    circles.add(new Oval2(10, 25, 2, 3));
    circles.add(new OvalCylinder2(40, 10, 2, 3, 6));

    for(Circle2 c : circles){
      System.out.println("For this " + c.getName() + showCenter(c));
    }
  }
}

/** The purpose of this program is to print
 *  the incremented points on a circle.
 *
 *
 * @author Joey Sabarese
 * @version 4/7/2019
 */

public class CirclePoints
{
  public static void main(String[] args)
  {
    double radius = 5.0;
    double increment = 0.1;
    double xCOOR = radius;
    double yCOOR = 0;
    double yCOOR2 = 0;

    System.out.println("Points On a Circle with the radius of " + radius);
    System.out.printf("%8s", "x1");
    System.out.printf("%8s", "y1");
    System.out.printf("%8s", "x1");
    System.out.printf("%8s%n", "y2");
    System.out.println("*******************************************");

    while((xCOOR <= radius) && (xCOOR >= radius * -1.0)){
      yCOOR = Math.sqrt(Math.pow(radius , 2) - Math.pow(xCOOR , 2));

      if(yCOOR > 0.00001) //This statement is because I had -0.0 showing up
        yCOOR2 = yCOOR * -1;

      else
        yCOOR2 = 0.0;

      System.out.printf("%8.2f", xCOOR);
      System.out.printf("%8.2f" , yCOOR);
      System.out.printf("%8.2f", xCOOR);
      System.out.printf("%8.2f%n" , yCOOR2);
      xCOOR -= increment;
    }
  }
}

/** The purpose of this program is to calculate
 *  a projectiles distance using the Catapult class
 *
 * @author Joey Sabarese
 * @version 4/28/19
 */
import java.util.ArrayList;
public class CatapultTester
{
  public static void main(String[] args)
  {
    System.out.println(Math.PI);
    int index = 0;
    int side = 20;

    ArrayList<Catapult> d = new ArrayList<Catapult>();
    double[][] values = new double[7][6];

    for(int i = 20; i <= 50; i+=5)
      for(int j = 25; j <= 50; j+=5)
        d.add(new Catapult(i, j));

    System.out.printf("%45s%n", "Projectile distance (feet)");
    System.out.println("*********************************************************");
    System.out.printf("%8s%8s%8s%8s%8s%8s%8s%n", "MPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");

    for(int i = 0; i < values.length; i++){
      System.out.printf("%8d" , side);
      side += 5;
      for(int j = 0; j < values[0].length; j++){
        d.get(index).calcMeters();
        d.get(index).calcDistance();
        d.get(index).calcFeet();
        values[i][j] = d.get(index).getDistance();
        index++;
        System.out.printf("%8.2f", values[i][j]);
      }
      System.out.println();
    }
  }
}

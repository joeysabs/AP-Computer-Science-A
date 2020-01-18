
 /**
 * This class defines a basic WinterMountain Terrain.
 *
 * @author Joey Sabarese
 * @version 5/9/19
 */

public class WinterMountain extends Mountain
{
  private int myTemp;

  public WinterMountain(int l, int w, int m, int temp)
  {
    super(l, w, m);
    myTemp = temp;
  }

  public String getTemp()
  {
    return " and is " + myTemp + " degrees Celcius";
  }
}

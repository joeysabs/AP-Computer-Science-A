
 /**
 * This class defines a basic Moutain Terrain.
 *
 * @author Joey Sabarese
 * @version 5/9/19
 */

public class Mountain extends Terrain
{
  private int myMountains;

    public Mountain(int l, int w, int m)
    {
      super(l, w);
      myMountains = m;
    }

    public String getMountains()
    {
      return " and has " + myMountains + " mountains";
    }
}

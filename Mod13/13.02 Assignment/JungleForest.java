
 /**
 * This class defines a basic Jungle Forest Terrain.
 *
 * @author Joey Sabarese
 * @version 5/9/19
 */

public class JungleForest extends Forest
{
  private int myRain;

  public JungleForest(int l, int w, int trees, int rain)
  {
    super(l, w, trees);
    myRain = rain;
  }

  public String getRain()
  {
    return " and has " + myRain + " inches of rain";
  }
}

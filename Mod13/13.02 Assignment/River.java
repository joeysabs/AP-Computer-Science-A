
 /**
 * This class defines a basic River Terrain.
 *
 * @author Joey Sabarese
 * @version 5/9/19
 */

public class River extends Terrain
{
  private int myFlow;

  public River(int l, int w, int flow)
  {
    super(l, w);
    myFlow = flow;
  }

  public String getFlow()
  {
    return " and has " + myFlow + " gallons per minute";
  }
}

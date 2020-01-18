
 /**
 * This class defines a basic Forest Terrain.
 *
 * @author Joey Sabarese
 * @version 5/9/19
 */

public class Forest extends Terrain
{
  private int myTrees;

  public Forest(int l, int w, int trees)
  {
    super(l, w);
    myTrees = trees;
  }

  public String getTrees()
  {
    return " and has " + myTrees + " trees";
  }
}

/**
 * This class defines a Cube object by extending
 * Box.
 * The toString method has been added.
 *
 * @author Joey Sabarese
 * @version 05/14/19
 */
public class Cube4 extends Box4
{
  public Cube4(int x)
  {
    super(x, x, x);
  }

  public String toString()
  {
    return "Cube - " + getLength() + " X " +  getWidth() + " X " + getHeight();
  }
}

/**
 * This class defines a Square object by extending
 * Rectangle
 * The toString method has been added.
 *
 * @author Joey Sabarese
 * @version 05/14/19
 */

public class Square4 extends Rectangle4
{
  public Square4(int x)
  {
    super(x, x);
  }

  public String toString()
  {
    return "Square - " + getWidth() + " X " + getLength();
  }
}

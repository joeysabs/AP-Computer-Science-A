/**
 * This class defines a Trapezoid object by extending
 * Rectangle and includes a second base.
 * The toString method has been added.
 *
 * @author Joey Sabarese
 * @version 05/14/19
 */

public class Trapezoid4 extends Rectangle4
{
  private int b2;

  public Trapezoid4(int h, int b1, int base2)
  {
    super(h, b1);

    b2 = base2;
  }

  public int getBase2()
  {
    return b2;
  }

  public String toString()
  {
    return "Trapezoid - " + "1/2" + " X (" + getWidth() + " + " + b2 + ") X " + getLength();
  }

  public int getArea()
  {
    return ((getBase2() + getWidth()) / 2) * getLength();
  }

}

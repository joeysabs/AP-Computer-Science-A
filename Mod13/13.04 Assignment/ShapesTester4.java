
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Joey Sabarese
 * @version 05/14/19
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 a = new Rectangle4(5, 20);
        Rectangle4 b = new Box4(4, 10, 5);
        Rectangle4 c = new Box4(4, 10, 5);
        Rectangle4 d = new Cube4(4);
        Rectangle4 e = new Trapezoid4(2, 3, 4);
        Rectangle4 f = new Square4(2);

        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( a );
        shapes.add( b );
        shapes.add( c );
        shapes.add( d );
        shapes.add( e );
        shapes.add( f );

        System.out.println("My Shapes\n");

        for(Rectangle4 rect: shapes){
        	showEffectBoth(rect);
        }

        System.out.println("\nTest for equality\n");
        for(int i = 0; i < shapes.size() - 1; i++){
          shapes.get(i).equals(shapes.get(i), shapes.get(i+1) );
        }
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

}

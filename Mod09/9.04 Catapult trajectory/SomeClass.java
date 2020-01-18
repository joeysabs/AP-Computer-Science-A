import java.util.ArrayList;
public class SomeClass
{
   public static void main (String[] args)
   {
     int[][] arr2 = {{1, 1, 1},
                   {3, 3, 3},
                   {5, 5, 5},
                   {7, 7, 7}};
                   //System.out.println(vals[1][2]);

    String[] fruits = { "apple", "banana", "peach", "strawberry" };
    String str = "a";
    for (String item : fruits)
    {
      str += item.substring(0, 1);
    }
    ArrayList<Integer> grades = new ArrayList<Integer>();
grades.add(88);
grades.add(92);
grades.add(95);
grades.add(1, 80);
grades.add(83);
System.out.println(grades.get(1 + 5 % 2));

int sum = 0;
int k = 1;
int val = 1;
for (k = 0; k <= 7; k++)
{
   sum += val;
   val++;
}
System.out.println(sum);
  }
}

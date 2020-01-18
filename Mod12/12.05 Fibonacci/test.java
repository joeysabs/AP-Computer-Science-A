public class test
{

public static int mystery(int n)
{
     if (n < 5)
     {
          return mystery(n + 1) - 2;
     }

     return n - 1;
}

   public static void main(String[] args)
   {
     System.out.println(mystery(3));
   }
}

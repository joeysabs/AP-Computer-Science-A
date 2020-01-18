/** The purpose of this program is to calculate
 *  a users number in the Fibonacci sequence.
 *
 *
 * @author Joey Sabarese
 * @version 5/5/19
 */

import java.util.Scanner;
public class Fibonacci
{
    public int find(int num)
    {
        int fibNum;

        if(num == 0)
            fibNum = 0;
        else if(num == 1)
            fibNum = 1;
        else
            fibNum = find(num-1) + find(num-2);

        return fibNum;

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();

        System.out.println("Please select a number from 0-35 (-1 TO QUIT)!");

        System.out.print("Enter a digit: ");
          int fibo = in.nextInt();

        if(fibo > 35)
          System.out.println("You have entered an invalid number");
        if(fibo < 0)
          System.out.println("Goodbye");

        while ((fibo >= 0) && (fibo <= 35)){
          System.out.println("Fibonacci number is: " + fib.find(fibo));
          System.out.print("Enter a digit: ");
          fibo = in.nextInt();
        }

        if(fibo > 35)
          System.out.println("You have entered an invalid number");
        if(fibo < 0)
          System.out.println("Goodbye");
    }
}

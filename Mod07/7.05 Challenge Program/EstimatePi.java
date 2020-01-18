/** This program is to estimate the value of pi by using
 *  a simulation of darts with random numbers.
 *
 *
 * @author Joey Sabarese
 * @version 4/14/19
*/

import java.util.Scanner;

public class EstimatePi
{
  public static double calcAv(double[] p) //Function calculating pi average between trials
  {
    double average = 0.0;
    for( int i = 0; i < p.length; i++)
      average += p[i];

    return average / p.length;
  }

  public static boolean hitMiss(double x, double y) // function to determine whether dart is a hit or miss
  {
    if((Math.pow(x , 2) + Math.pow(y , 2)) <= 1) //Pythagoream theorem
      return true;
    else
      return false;
  }

  public static double getCoor() //Function using random numbers to obtain coordinates of a dart
  {
    double randNum = Math.random();
    return randNum;
  }

  public static double findPi(int h, int n) // Fucntion that calculates pi for each tiral
  {
    return 4 * ((double)h / n);
  }

  public static void main(String[] args)
  {
    int trials;
    int darts;
    int hit = 0;
    int miss = 0;
    int total;
    double average = 0.0;
    Scanner in = new Scanner(System.in);

    System.out.print("How many darts per trial? "); //Asking for # of darts
    darts = in.nextInt(); //Saving the number
    System.out.print("How many trials? "); //Asking for # of trials
    trials = in.nextInt(); // Svaing the number

    double[] piData = new double[trials]; //Array that will contain pi for each trial

    for (int i = 0; i < trials; i++){ //For loop cycling through trials
      for(int j = 1; j <= darts; j++){ //Loop cycling thorugh darts
        if(hitMiss( getCoor() , getCoor() )) //Using functions to detrmine hit or miss
          hit++;
        else
          miss++;
        }

      total = hit + miss; //Creating the total number of darts
      System.out.printf("%-7s%2d%-2s" , "Trial [" , (i + 1) , "]:"); //Printing info to screen
      System.out.printf("%6s%7.6f%n" , "pi = " , findPi(hit , total));
      piData[i] = findPi(hit , total); //storing data to pi array
    }
    System.out.printf("Estimate of pi = " + "%7.6f" , calcAv(piData)); // Printing average to screen
  }
}

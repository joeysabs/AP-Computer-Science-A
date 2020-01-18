/** This program is to estimate the value of pi by using
 *  a simulation of darts with random numbers.
 *
 *
 * @author Joey Sabarese
 * @version 4/26/19
*/

import java.util.Scanner;
import java.util.ArrayList;
public class DartsTester
{
  public static void main(String[] args)
  {
    int index; //Declares index
    Scanner in = new Scanner(System.in); //Creation of a scanner

    //ArrayList with multiple trial options included
    ArrayList<Darts> pis = new ArrayList<Darts>();
    pis.add(new Darts(1000, 10));
    pis.add(new Darts(1500, 100));
    pis.add(new Darts(10000, 100));
    pis.add(new Darts(18374, 96));
    pis.add(new Darts(10000000, 10));
    pis.add(new Darts(10000, 10000));

    Prompts User to enter which trial they would like to run
    System.out.print("Please enter a number between 0-5: ");
    index = in.nextInt();

    Darts datarecord = pis.get(index); //Sets object in ArrayList to datarecord

    Use of methods from Dart Class
    datarecord.hitMiss();
    datarecord.findPiAverage();

    Prints the information to the screen
    for(int i = 0; i < datarecord.getTrials(); i++){
      System.out.print(datarecord.toString(i));
    }
    System.out.printf("Estimate of pi = " + "%7.6f" , datarecord.getAverage());
  }
}

/** This program is to estimate the value of pi by using
 *  OOP with multiple methods that can be tested in main method.
 *
 *
 * @author Joey Sabarese
 * @version 4/26/19
*/

public class Darts
{
  //private instance variables
  private int myDarts, myTrials, myHits, myMisses;
  private double myX, myY, myAverage;
  private double[] myPi;

  //Object Delcaration with all variable declarations
  Darts(int d, int t)
  {
    myDarts = d;
    myTrials = t;
    myX = 0.0;
    myY = 0.0;
    myAverage = 0.0;
    myHits = 0;
    myMisses = 0;
    myPi = new double[t];
  }

  //Calculates hits and misses, Mutator
  public void hitMiss()
  {
    for( int i = 0; i < myTrials; i++){ //Loop through trials
      for( int j = 0; j < myDarts; j++){ //Loop thorugh each dart
        //Declares each coordinate randomly
        myX = Math.random();
        myY = Math.random();
        if((Math.pow(myX , 2) + Math.pow(myY , 2)) <= 1) //Pythagoream theorem
          myHits++;
        else
          myMisses++;
        }
      myPi[i] =  4 * ((double) myHits / myDarts); //Calculates pi for each trial
      myHits = 0; //Resets the amount of hits
    }
  }

  //Finds the average of pi for all trials, Mutator
  public void findPiAverage()
  {
    for(int i = 0; i < myPi.length; i++)
      myAverage += myPi[i];

    myAverage /= myPi.length;
  }

  public String toString(int i)
  {
      return String.format("%-7s%2d%-2s%6s%7.6f%n" , "Trial [" , (i + 1) , "]:" , "pi = " , myPi[i]); //Printing info to screen
  }

  //Getter method for average
  public double getAverage()
  {
    return myAverage;
  }

  //Getter Method for trials
  public int getTrials()
  {
    return myTrials;
  }

  //Getter Method for Misses
  public int getMisses()
  {
    return myMisses;
  }

  //Getter method for pi in each tiral
  public double getMyPi(int i)
  {
    return myPi[i];
  }
}

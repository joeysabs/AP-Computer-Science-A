/**
 * The purpose of this program is to simulate the # of Hippos
 * spotted by using a random number.
 *
 * @author Joey Sabarese
 * @version 01/28/19
 */

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.text.DecimalFormat;

class AnimalPopulation
{
   public static void main (String [ ] args) throws IOException
   {
     int otherAnimals = 0;
     int hippo = 0;
     int totalAnimals = 0;
     int totalSims = 0;
     int totAnimalPerTrial = 0;
     int tokenVal = 0;
     String token = "";
     double averageHippo = 0;

     File fileName = new File("Population.txt");
     Random randNumList = new Random();
     Scanner in = new Scanner(System.in);
     PrintWriter outFile = new PrintWriter(fileName);
     DecimalFormat numberFormat = new DecimalFormat("#.000");


     System.out.println("Welcome to the Hippo Simulator!");
     System.out.println("\nHow many trials should be simulated?");
     System.out.print("Enter a value greater than 1,000: ");
     totalSims = in.nextInt();

     if(totalSims >= 1000)
     {
       for(int simsCounter = 1; simsCounter <= totalSims; simsCounter++)
       {
             for(int animalCounter = 1; animalCounter <= 10; animalCounter++)
             {
                int randNum = randNumList.nextInt(10);

                if(randNum == 7)
                {
                    hippo++;
                    animalCounter = 10;
                    totAnimalPerTrial++;
                }
                else
                {
                    otherAnimals++;
                    totAnimalPerTrial++;
                }
              }
            outFile.println(totAnimalPerTrial);
            totAnimalPerTrial = 0;
        }
        //System.out.println(hippo); for debugging purposes.
      }
      else
        System.out.println("Please try again. Enter a number greater than 1000.");

      outFile.close( );

      Scanner inFile = new Scanner(fileName);

      while(inFile.hasNext())
      {
        token = inFile.next();
        tokenVal = Integer.parseInt(token);
        totalAnimals += tokenVal;
      }

      averageHippo = totalAnimals/(double)hippo;

      System.out.println("\nThe results!");
      System.out.print("The average number of animals spotted until\n");
      System.out.print("spotting a Hippo in Africa is: ");
      System.out.println(numberFormat.format(averageHippo));
      inFile.close();
    }
}

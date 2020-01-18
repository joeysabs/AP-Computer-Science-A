/**
 * This program uses a while loop to record the amount of families
 * in a text file and record how many children there are.
 *
 *
 * @author Joey Sabarese
 * @version 01/10/19
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Family
{
  public static void main(String[] args) throws IOException
    {
      String token = "";
      File fileName = new File("maleFemaleInFamily.txt");
      Scanner inFile = new Scanner(fileName);
      int girlGirl = 0;
      int boyBoy = 0;
      int boyGirl = 0;
      int families = 0;

      while(inFile.hasNext())
        {
          token = inFile.next();
          families++;

          if ((token.equals("GB")) || (token.equals("BG")))
            boyGirl++;

          else if (token.equals("GG"))
            girlGirl++;

          else if (token.equals("BB"))
            boyBoy++;
        }

        DecimalFormat numberFormat = new DecimalFormat("#.00");

        //Percentages
        double girlGirlPercent =(double)(girlGirl) / families * 100;
        double boyBoyPercent = (double)(boyBoy) / families * 100;
        double boyGirlPercent = (double)(boyGirl) / families * 100;

        //Output
        System.out.println("Composition statistics for families with two children.\n");
        System.out.println("Total number of families: " + families + "\n");
        System.out.println("Number of families with\n");
        System.out.println("\t2 Girls: " + girlGirl + " represents " +  numberFormat.format(girlGirlPercent) + "%");
        System.out.println("\t2 Boys: " + boyBoy + " represents " +  numberFormat.format(boyBoyPercent) + "%");
        System.out.println("\t1 Girl and 1 Boy: " + boyGirl + " represents " +  numberFormat.format(boyGirlPercent) + "%");

        inFile.close();
    }
}

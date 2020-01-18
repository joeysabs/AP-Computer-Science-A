/**
 * This program is used to create a table of average temperetures and
 * percipitation values according to a users selection of units.
 *
 * @author Joey Sabarese
 * @version 2/19/19
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class HurricaneSelector
{
    public static void main(String[] args) throws IOException
    {
      //Creating variables and objects
      File data = new File("hurricanedata.txt");
      Scanner inFile = new Scanner(data);
      Scanner in = new Scanner(System.in);
      String year;
      String month;
      String stormName;
      int windSpeed;
      int pressure;
      String token = "";
      String [] years = new String[156];
      String [] months = new String[156];
      int [] pressures = new int[156];
      double [] windSpeeds = new double[156];
      String [] names = new String[156];
      int [] categories = new int[156];
      int i = 0;
      int cat1 = 0;
      int cat2 = 0;
      int cat3 = 0;
      int cat4 = 0;
      int cat5 = 0;
      int catMin = Integer.MAX_VALUE;
      int catMax = Integer.MIN_VALUE;
      double catAv = 0;
      double speedMin = Double.MAX_VALUE;
      double speedMax = Double.MIN_VALUE;
      double speedAv = 0;
      int pressMin = Integer.MAX_VALUE;
      int pressMax = Integer.MIN_VALUE;
      double pressAv = 0;
      int userCounter = 0;
      double catTotal = 0.0;
      double pressTotal = 0.0;
      double speedTotal = 0.0;

      while (inFile.hasNext()) // defining arrays
      {
        token = inFile.next();

        if (i == 0 || (i % 5 == 0)) //to years array
          years[i/5] = token;

        if ((i - 1) == 0 || ((i - 1) % 5 == 0)) //to months array
          months[i/5] = token;

        if ((i - 2) == 0 || ((i - 2) % 5 == 0)) //to pressures array
          pressures[i/5] = Integer.parseInt(token);

        if ((i - 3) == 0 || ((i - 3) % 5 == 0)) //to windSpeeds array
          windSpeeds[i/5] = Double.parseDouble(token) * 1.151;

        if ((i - 4) == 0 || ((i - 4) % 5 == 0)) //to names array
          names[i/5] = token;

        i++;
      }
      for (int j = 0; j < windSpeeds.length; j++) // determining categories
      {
        if(windSpeeds[j] >= 74 && windSpeeds[j] <= 95)
          categories[j] = 1;

        if(windSpeeds[j] >= 96 &&  windSpeeds[j] <= 110)
          categories[j] = 2;

        if(windSpeeds[j] >= 111 && windSpeeds[j] <= 129)
          categories[j] = 3;

        if(windSpeeds[j] >= 130 && windSpeeds[j] <= 156)
          categories[j] = 4;

        if(windSpeeds[j] >= 156)
          categories[j] = 5;
      }
      System.out.println("Welcome to the Hurricane Data Generator!");
      System.out.println("Please enter the range of years for which you would like to see data presented.");
      System.out.print("Lower Range (1995): "); //Finds low range
      String userLowYear = in.next();
      System.out.print("Upper Range (2015): "); //Finds high range
      String userHighYear = in.next();

      System.out.println("\nHurricanes " + userLowYear + "-" + userHighYear);
      System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Year" ,"Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
      System.out.println("==================================================================================================");

      for (int k = 0; k < years.length; k++)
        if(Integer.parseInt(years[k]) >= Integer.parseInt(userLowYear) && Integer.parseInt(years[k]) <= Integer.parseInt(userHighYear))
        {
          System.out.printf("%-15s", years[k]); // Prints all of the data read from the arrays.
          System.out.printf("%-18s", names[k]);
          System.out.printf("%-15d", categories[k]);
          System.out.printf("%-7d", pressures[k]);
          System.out.printf("%15.2f%n", windSpeeds[k]);

          if(categories[k] == 1) // Creates the amount of in category 1
              cat1++;
          if(categories[k] == 2) // Creates the amount of in category 2
              cat2++;
          if(categories[k] == 3) // Creates the amount of in category 3
              cat3++;
          if(categories[k] == 4) // Creates the amount of in category 4
              cat4++;
          if(categories[k] == 5) // Creates the amount of in category 5
              cat5++;

          while(categories[k] < catMin) //Establishes category minimum
            catMin = categories[k];
          while(categories[k] > catMax) //Establishes category maximum
            catMax = categories[k];
          while(pressures[k] < pressMin) //Establishes pressure minimum
            pressMin = pressures[k];
          while(pressures[k] > pressMax) //Establishes pressure maximum
            pressMax = pressures[k];
          while(windSpeeds[k] < speedMin) //Establishes speed minimum
            speedMin = windSpeeds[k];
          while(windSpeeds[k] > speedMax) //Establishes speed maximum
            speedMax = windSpeeds[k];

          catTotal += categories[k];
          pressTotal += pressures[k];
          speedTotal += windSpeeds[k];

          userCounter++; //Counts the length of the the user selected range
        }

        catAv = catTotal/userCounter; //Calculating category average
        pressAv = pressTotal/userCounter; //Calculating pressure average
        speedAv = speedTotal/userCounter; //Calculating speed average
        System.out.println("==================================================================================================");
        System.out.printf("%15s%21.1f%17.1f%17.2f%n" ,"Average:" ,catAv , pressAv, speedAv); //Format and print averages
        System.out.printf("%15s%19d%17d%19.2f%n", "Minimum:", catMin, pressMin, speedMin); //Format and print minimum
        System.out.printf("%15s%19d%17d%19.2f%n", "Maximum:", catMax, pressMax, speedMax); //format and print maximum
        System.out.println("\nSummary of Categories:"); //Prints summary of categories
        System.out.println("\tCat 1: " + cat1);
        System.out.println("\tCat 2: " + cat2);
        System.out.println("\tCat 3: " + cat3);
        System.out.println("\tCat 4: " + cat4);
        System.out.println("\tCat 5: " + cat5);

    }
}

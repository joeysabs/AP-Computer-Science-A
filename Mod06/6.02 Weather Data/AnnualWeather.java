/**
 * This program is used to create a table of average temperetures and
 * percipitation values according to a users selection of units.
 *
 * @author Joey Sabarese
 * @version 2/19/19
 */
import java.util.Scanner;
public class AnnualWeather
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double [] averageTemps = {68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9}; //temps for Miami
        double [] averageRain = {1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2}; //Precipitation for Miami
        //double [] averageTemps = {70.3,	70.8,	73.8,	77.0,	80.7,	83.4,	84.5,	84.4,	83.4,	80.2,	76.3,	72.0}; (This is the extra for Key West)
        //double [] averageRain = {2.2,	1.5, 1.9, 2.1, 3.5, 4.6, 3.3, 5.4, 5.5, 4.3, 2.6, 2.1}; (This is the extra for Key West)
        String userTempScale;
        String userRainScale;
        double averageTemp = 0.0;
        double annualRain = 0.0;

        System.out.println("Choose the Temperature Scale (F = Fahrenheit, C = Celsius): ");
        userTempScale = in.next();
        System.out.println("Choose the Precipitation Scale (i = Inches, c = Centimeters): ");
        userRainScale = in.next();

        if(userTempScale.equalsIgnoreCase("C"))
            for(int n = 0; n < averageTemps.length; n++)
                averageTemps[n] = (averageTemps[n] - 32) * (5.0/9);

        if(userRainScale.equalsIgnoreCase("C"))
            for(int n = 0; n < averageRain.length; n++)
                averageRain[n] = averageRain[n] * 2.54;

        System.out.println("\t\tWeather Data");
        System.out.println("\tLocation: Miami, Florida");

        if(userTempScale.equalsIgnoreCase("F") && userRainScale.equalsIgnoreCase("i"))
            System.out.println("Month\t\t" + "Temperature (F)\t\t" + "Precipitation (in)");

        else if(userTempScale.equalsIgnoreCase("C") && userRainScale.equalsIgnoreCase("C"))
            System.out.println("Month\t\t" + "Temperature (C)\t\t" + "Precipitation (cm)");

        else if(userTempScale.equalsIgnoreCase("F") && userRainScale.equalsIgnoreCase("c"))
            System.out.println("Month\t\t" + "Temperature (F)\t\t" + "Precipitation (cm)");

        else if(userTempScale.equalsIgnoreCase("C") && userRainScale.equalsIgnoreCase("i"))
            System.out.println("Month\t\t" + "Temperature (C)\t\t" + "Precipitation (in)");

        System.out.println("************************************************************");

        for(int n = 0; n < months.length; n++)
          {
            System.out.printf("%-20s%-25.1f%-6.1f\n" , months[n] , averageTemps[n], averageRain[n]);
            averageTemp += averageTemps[n];
            annualRain += averageRain[n];
          }

        averageTemp = averageTemp/averageTemps.length;
        System.out.println("************************************************************");
        System.out.printf("Average Temperature: %-8.1f Annual Rain: %-8.1f" , averageTemp , annualRain);
    }
}

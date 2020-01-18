/** The purpose of this program is to create a table of
 * information about CO2 emissions given off by gas. This
 * table will include the amount of CO2 emissions given off
 * by gas in gallons, pounds, and tons.
 *
 *
 * @author Joey Sabarese
 * @version 4/20/19
 */
public class CO2FootprintV2Tester //Creating the testor class for CO2PrintV2
{
    public static void main(String[] args) // Start of main method
    {
        double gallonsOfGas = 2410; // Declaration of gallons of gas

        //Creation CO2FootprintV2 object using gallons of gas along with calculations
        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas);
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        //Creation of table using println 
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}

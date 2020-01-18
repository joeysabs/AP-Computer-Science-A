/**
 * This class tests the CO2FromWaste class.
 * An ArrayList of CO2FromWaste objects is created.
 * The add() method is used to add the objects to the ArrayList as they are instantiated.
 *
 * A for loop is used to call the  methods on each object in the ArrayList.
 * A second for loop is used to print the values of the instance variables for each object.
 *
 * @author Alan Kay
 * @version 04/23/19
 */

import java.util.ArrayList;
public class CO2FromWasteTester
{
  public static void main(String[] args)
  {
    ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
    households.add(new CO2FromWaste(1, true, true, true, true));
    households.add(new CO2FromWaste(3, true, true, false, false));
    households.add(new CO2FromWaste(6, true, false, true, false));
    households.add(new CO2FromWaste(2, true, true, false, false));
    households.add(new CO2FromWaste(7, true, false, false, false));
    households.add(new CO2FromWaste(10, true, false, false, true));

    CO2FromWaste dataRecord;

    for( int i = 0; i < households.size(); i++)
      {
        dataRecord = households.get(i);
        dataRecord.calcGrossWasteEmission();
        dataRecord.calcNetWasteReduction();
        dataRecord.calcWasteReduction();
      }

    System.out.printf("%115s%n", "Pounds of CO2");
    System.out.printf("%70s%26s%29s%n" , "Household Waste Recycled", "Total", "Net");
    System.out.printf("%10s%15s%13s%15s%15s%15s%15s%15s%15s%n" , "Index", "People", "Paper", "Plastic", "Glass", "Cans", "Emission", "Reduction", "Emission");
    System.out.println("*************************************************************************************************************************************");

    for(int i = 0; i < households.size(); i++)
    {
      System.out.println("\t" + i + "\t" + households.get(i));
    }
  }
}

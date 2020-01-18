/**
 * This class instantiates CO2FromWaste objects with eight private instance variables.
 * It contains mutator methods to calculate the calcGrossWasteEmission and the
 * wasteReduction of a household.
 *
 * @author Joey Sabarese
 * @version 04/23/19
 */
public class CO2FromWaste
{
  private int myNumPeople;
  private double totalWaste, netWaste, wasteReduction;
  private boolean myPaper, myPlastic, myGlass, myCans;

  CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
  {
    myNumPeople = numPeople;
    myPaper = paper;
    myPlastic = plastic;
    myGlass = glass;
    myCans = cans;
    totalWaste = 0.0;
    netWaste = 0.0;
    wasteReduction = 0.0;
  }

  public void calcGrossWasteEmission()
  {
    totalWaste = myNumPeople * 1018;
  }

  public void calcWasteReduction()
  {
    wasteReduction = totalWaste - netWaste;
  }

  public void calcNetWasteReduction()
  {
    netWaste = totalWaste;
    if(myPaper)
      netWaste -= (184 * myNumPeople);
    if(myPlastic)
      netWaste -= (25.6 * myNumPeople);
    if(myGlass)
      netWaste -= (46.6 * myNumPeople);
    if(myCans)
      netWaste -= (165.8 * myNumPeople);
  }

  public String toString()
  {
    return String.format("%7d%15s%15s%15s%15s%15.2f%15.2f%15.2f", myNumPeople, myPaper, myPlastic, myGlass, myCans, totalWaste, wasteReduction, netWaste);
  }
}

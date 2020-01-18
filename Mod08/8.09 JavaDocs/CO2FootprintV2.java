/** The purpose of this program is to calculate
 *  the amount of CO2 emissions given of by gas in different units.
 *  The amount of emissions in gallons is given
 *  and this program converts this to both pounds
 *  and tons of gas.
 *
 * @author Joey Sabarese
 * @version 4/20/19
 */
public class CO2FootprintV2
{
    //Declaration of provate instance variables
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    /**
     * Constructor for objects of type CO2FootprintV2
     * @param gallons gallons of gas
     * Precondition: gallons is a positive value
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate the amount of tons of CO2 from gallons of gas (no parameters).
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to convert the amount of tons of CO2 to Pounds of CO2 (no parameters).
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the value of Gallons of gas (no parameters).
     * @return the gallons of gas.
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the value of tons of CO2 (no parameters).
     * @return the tons of CO2.
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the value of pounds of CO2 (no parameters).
     * @return the pounds of CO2.
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

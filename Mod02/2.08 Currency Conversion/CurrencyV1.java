/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given
 * the current exchange rate.
 *
 * @author Joey Sabarese
 * @version 11/10/18
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico

        //remaining variables below here
        //Britain
        double poundsSpent = 672.35;
        double poundExhangeRate = 0.762453;
        double dollarsSpentInBritain = 0.0;
        double dollarsAfterBritain = 0.0;

        //Korea
        double wonSpent = 20834.20;
        double wonExchangeRate = 1117.010;
        double dollarsSpentInKorea = 0.0;
        double dollarsAfterKorea = 0.0;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println("Starting US Dollars:  " + startingUsDollars);

        dollarsSpentInMexico = (pesosSpent / pesoExchangeRate);
        dollarsAfterMexico = (startingUsDollars - dollarsSpentInMexico);
        System.out.println();
        System.out.println("Mexico");
        System.out.println("  Pesos Spent:  " + pesosSpent);
        System.out.println("  US Dollars Equivalent:  " + dollarsSpentInMexico);
        System.out.println("  US Dollars Remaining: " + dollarsAfterMexico);
        System.out.println();

        dollarsSpentInBritain = (poundsSpent / poundExhangeRate);
        dollarsAfterBritain = (dollarsAfterMexico - dollarsSpentInBritain);
        System.out.println();
        System.out.println("Britain");
        System.out.println("  Pounds Spent:  " + poundsSpent);
        System.out.println("  US Dollars Equivalent:  " + dollarsSpentInBritain);
        System.out.println("  US Dollars Remaining: " + dollarsAfterBritain);
        System.out.println();

        dollarsSpentInKorea = (wonSpent / wonExchangeRate);
        dollarsAfterKorea = (dollarsAfterBritain - dollarsSpentInKorea);
        System.out.println();
        System.out.println("Korea (South)");
        System.out.println("  Won Spent:  " + wonSpent);
        System.out.println("  US Dollars Equivalent:  " + dollarsSpentInKorea);
        System.out.println("  US Dollars Remaining: " + dollarsAfterKorea);
        System.out.println("==============================================");
        System.out.println("Remaining Us Dollars: " + dollarsAfterKorea);
        System.out.println();

        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = (budget1 / costItem1); 		//how many items can be purchased
		int fundsRemaining1 = (budget1 % costItem1);  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
    System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = (double)budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

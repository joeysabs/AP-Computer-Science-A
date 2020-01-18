/**
 * The purpose of this program is to calculate the cost of shoes.
 *
 * @author Joey Sabarese
 * @version (11/20/18)
 */
import java.util.Scanner;
public class BuyingShoes
{
      public static void main(String[] args)
      {
        //Creating scanner object
        Scanner in = new Scanner(System.in);

        //Name Information
        System.out.println("Hello welcome to Nike Shoes!");
        System.out.print("Please state your name: ");
        String firstName = in.next();
        String lastName = in.nextLine();


        //Current date
        System.out.print("Please enter todays date (mm-dd-yyyy): ");
        String currentDate = in.nextLine();


        //Shoe Information
        System.out.print("Please state the name of the Shoes: ");
        String shoeName = in.nextLine();


        //Quantity of Shoes
        System.out.print("How many pairs would you like to buy: ");
        String quantityOfShoes = in.next();

        //Cost of Shoes
        System.out.print("What is the cost of the shoe: ");
        String shoePrice = in.next();


        //Credit Card number
        System.out.print("Please enter your credit card number (xxxx-xxx-xxxx): ");
        String creditCardNumber = in.next();

        //Pin number
        System.out.print("Please enter your pin number (xxxx): ");
        String pinNumber = in.next();
        System.out.print("\n");

        //Seperation Banner
        System.out.println("####################################################################");
        System.out.println("####################################################################");

        //Receipt
        //Date and Order Number
        System.out.println("Here is Your E-Receipt!");
        System.out.println("\n\n");
        System.out.println(currentDate);
        System.out.println("Order Number: " + currentDate.substring(0,2) + creditCardNumber.substring(5,8) + "\n");

        //Name with first Intial
        String firstInitial = firstName.substring(0,1);
        System.out.println("\t Name: " + firstInitial + ". " + lastName);

        //Account number
        String accountNumber = creditCardNumber.substring(9); //Last 4 digits of card Number
        System.out.println("\t Account Number: " + "xxxx-xxx-" + accountNumber);

        //General Information About Shoes
        System.out.println("\t Type of Shoes: " + shoeName);
        System.out.println("\t Amount of pairs: " + quantityOfShoes);
        System.out.println("\t Price of Single Pair: " + "$" + shoePrice);

        //Parsing Strings and finding Total Price
        int numberOfShoes = Integer.parseInt(quantityOfShoes); //parsing pairs of shoes to an int
        double priceOfShoe = Double.parseDouble(shoePrice); // parsing shoe price to a double
        double totalPrice = numberOfShoes * priceOfShoe; //finding total price
        System.out.println("\n\t Your Total Amount is: " + "$" + totalPrice + "\n");
        System.out.println("Have a great day!");
      }
}

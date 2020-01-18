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

class SecretPasscodes
{
   public static void main (String [ ] args) throws IOException
   {

     int userSelection = 0;
     int passLength = 0;
     int counter = 0;
     int difRandNum = 0;
     int passCount = 1;

     Random randNumList = new Random();
     File fileName = new File("Passwords.txt");
     Scanner in = new Scanner(System.in);
     PrintWriter outFile = new PrintWriter(fileName);

     System.out.println("\t\tPassword Generator Menu");
     System.out.println("*********************************************************");
     System.out.println("*\t[1] Lowercase Letters\t\t\t\t*");
     System.out.println("*\t[2] Uppercase Letters\t\t\t\t*");
     System.out.println("*\t[3] Only Numbers\t\t\t\t*");
     System.out.println("*\t[4] Uppercase, Lowercase, and numbers\t\t*");
     System.out.println("*\t[5] Quit\t\t\t\t\t*");
     System.out.println("*********************************************************");

     System.out.print("Enter Selection (1-5): ");
     userSelection = in.nextInt();

     if(userSelection > 5)
      System.out.println("Invalid option. Please try again.");

     if(userSelection == 5)
      System.out.println("done.");

     while(userSelection < 5)
     {
     System.out.print("Password Length (6 or more): ");
     passLength = in.nextInt();


     if((userSelection == 1) && (passLength >= 6))
     {
       for(counter = 0; counter <= passLength; counter++)
       {
           int randNum = randNumList.nextInt(27) + 97;

              if((randNum >= 97))
                outFile.print((char)randNum);
        }
        outFile.println();
     }
     else if ((userSelection == 2) && (passLength >= 6))
     {
       for(counter = 0; counter <= passLength; counter++)
       {
           int randNum = randNumList.nextInt(26) + 65;

              if((randNum >= 65))
                outFile.print((char)randNum);
        }
        outFile.println();
     }
     else if((userSelection == 3) && (passLength >= 6))
     {
       for(counter = 0; counter <= passLength; counter++)
       {
           int randNum = randNumList.nextInt(9) + 48;

              if((randNum >= 48))
                outFile.print((char)randNum);
        }
        outFile.println();
     }
     else if((userSelection == 4) & (passLength >= 6))
     {
       for(counter = 0; counter <= passLength; counter++)
       {
         difRandNum = randNumList.nextInt(3);
         if(difRandNum == 0)
         {
           int randNum = randNumList.nextInt(9) + 48;
           if(randNum >= 48)
                outFile.print((char)randNum);
         }
          else if(difRandNum == 1)
          {
            int randNum1 = randNumList.nextInt(26) + 65;
            if(randNum1 >= 65)
                outFile.print((char)randNum1);
          }
          else
          {
            int randNum2 = randNumList.nextInt(27) + 97;
            if(randNum2 >= 97)
                outFile.print((char)randNum2);
          }
        }
        outFile.println();
     }
     else if((userSelection == 5) & (passLength >= 6))
      System.out.println("Thank you for using the Password Generator");

     else
      System.out.println("Invalid option. Please try again.");

      System.out.println();

      System.out.print("Enter Selection (1-5): ");
      userSelection = in.nextInt();
    } //end of while loop

      outFile.close();

      Scanner inFile = new Scanner(fileName);

      if(userSelection < 5)
        System.out.println("Here are your randomly generated passwords:");

      while(inFile.hasNext())
      {
        String password = inFile.next();
        System.out.println("\t" + passCount + "\t" + password);
        passCount++;
      }
   }
}

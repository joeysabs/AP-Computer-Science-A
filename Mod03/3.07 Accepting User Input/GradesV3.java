
/**
 * Script to calculate a students average grade
 * with students input
 * @author Joey Sabarese
 * @version 11/19/18
 */
import java.util.Scanner;
public class GradesV3
{
    public static void main(String[ ] args)
    {
        //Scanner Object creation
        Scanner in = new Scanner(System.in);

        //local variables
        int numTests = 0;      //counts number of tests
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        //Student Information
        //Name
        System.out.print("Please enter your Name: ");
        String name = in.nextLine();
        System.out.println();

        //Subject
        System.out.print("Please enter your Current Subject: ");
        String subject = in.nextLine();
        System.out.println();

        //Grades
        System.out.print("Please enter your 5 grades seperated by spaces: ");
        int grade1 = in.nextInt();
        int grade2 = in.nextInt();
        int grade3 = in.nextInt();
        int grade4 = in.nextInt();
        int grade5 = in.nextInt();
        numTests = 5;
        System.out.println();

        //Showing Information Given
        System.out.print("Name: " + name);
        System.out.print("  Subject: " + subject);
        System.out.println("  Grades: " + grade1 + " " + grade2 + " " + grade3 + " " + grade4 + " " + grade5);
        System.out.println();

        //Printing total Points and Average
        totalPoints = (grade1 + grade2 + grade3 + grade4 + grade5);
        average = (double)(totalPoints) / numTests;
        System.out.println(" Total Points: " + totalPoints);
        System.out.println(" Average Grade: " + average);

    }
}

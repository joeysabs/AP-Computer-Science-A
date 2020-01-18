/**
 * This program calculates your body mass index using
 * an if-else-if statement
 *
 * @author Joey Sabarese
 * @version 12/4/2018
 */
 import java.util.Scanner;
 public class BMI
 {
   public static void main(String[] args)
   {
     int weight;
     int heightFeet;
     int heightInches;
     String height;
     String name;
     String category;
     Scanner in = new Scanner(System.in);

     System.out.print("Please enter your name (first last): ");
     name = in.nextLine();
     System.out.print("Please enter your weight in pounds (e.g. 207): ");
     weight = in.nextInt();
     System.out.print("Please enter your height in feet and inches (e.g. 6 4): ");
     heightFeet = in.nextInt();
     heightInches = in.nextInt();

     int heightTotalInches = (heightFeet * 12 + heightInches);

     double heightInMeters = (heightTotalInches * 0.0254);
     double weightInKilograms = (weight * 0.453592);
     double bodyMassIndex = (weightInKilograms / (heightInMeters * heightInMeters));

     if (bodyMassIndex < 18.5)
      category = "UnderWeight";
     else if (bodyMassIndex < 24.9)
      category = "Helathy Weight";
     else if (bodyMassIndex < 29.9)
      category = "Over Weight";
     else
      category = "Obese";

     System.out.println("\nBody Mass Index Calculator");
     System.out.println("==========================");
     System.out.println("Name: " + name);
     System.out.println("Height (m) : " + heightInMeters);
     System.out.println("Weight (kg): " + weightInKilograms);
     System.out.println("BMI: " + bodyMassIndex);
     System.out.println("Category: " + category);

   }
}

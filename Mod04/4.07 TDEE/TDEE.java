/**
 * This program is used to calculate a person's
 * Total Daily Energy Expenditure.
 *
 * @author Joey Sabarese
 * @version 12/9/18
 */
import java.util.Scanner;
public class TDEE
  {
    public static void main(String[] args)
    {
          Scanner in = new Scanner(System.in);

          String name;
          double BMR;
          String gender;
          double activityFactor = 0.0;

          System.out.print("Please enter your name: ");
          name = in.nextLine();
          System.out.print("Please enter your BMR: ");
          BMR = in.nextInt();
          System.out.print("Please enter your gender (M or F): ");
          gender = in.next();

          System.out.println("\n\nSelect Your Activity Level");
          System.out.println("[A] Resting           (Sleeping, Reclining)");
          System.out.println("[B] Sedentary         (Minimal Movement)");
          System.out.println("[C] Light             (Sitting, Standing)");
          System.out.println("[D] Moderate          (Light Manual Labor, Dancing, Cycling)");
          System.out.println("[E] Very Active       (Hard Manual Labor, Team Sports)");
          System.out.println("[F] Extremely Active  (Heavy Manual Labor, Full-Time Athletes)");
          System.out.print("\nEnter a letter from above that best fits you: ");
          String userActivityLevel = in.next();
          String activityLevel = userActivityLevel.toUpperCase();

          if (activityLevel.equals("A"))
          {
              activityLevel = "Resting";
              activityFactor = 1.0;
          }
          else if (activityLevel.equals("B"))
          {
              activityLevel = "Sedentary";
              activityFactor = 1.3;
          }
          else if (activityLevel.equals("C") && gender.equalsIgnoreCase("m"))
          {
              activityLevel = "Light";
              activityFactor = 1.6;
          }
          else if (activityLevel.equals("C") && gender.equalsIgnoreCase("f"))
          {
              activityLevel = "Light";
              activityFactor = 1.5;
          }
          else if (activityLevel.equals("D") && gender.equalsIgnoreCase("m"))
          {
              activityLevel = "Moderate";
              activityFactor = 1.7;
          }
          else if (activityLevel.equals("D") && gender.equalsIgnoreCase("f"))
          {
              activityLevel = "Light";
              activityFactor = 1.6;
          }
          else if (activityLevel.equals("E") && gender.equalsIgnoreCase("m"))
          {
              activityLevel = "Very Active";
              activityFactor = 2.1;
          }
          else if (activityLevel.equals("E") && gender.equalsIgnoreCase("f"))
          {
              activityLevel = "Light";
              activityFactor = 1.9;
          }
          else if (activityLevel.equals("F") && gender.equalsIgnoreCase("m"))
          {
              activityLevel = "Extremely Active";
              activityFactor = 2.4;
          }
          else if (activityLevel.equals("F") && gender.equalsIgnoreCase("f"))
          {
              activityLevel = "Light";
              activityFactor = 2.2;
          }
          else
              System.out.println("You did not choose a correct letter");

          double userTDEE = (BMR * activityFactor);

          System.out.println("\n\nYour Results");
          System.out.println("Name: " + name + "\t\t\t" + "Gender: " + gender.toUpperCase());
          System.out.println("BMR: " + BMR + " calories" + "\t\t" + "Activity Factor: " + activityFactor);
          System.out.println("TDEE: " + userTDEE + " calories");

    }
  }

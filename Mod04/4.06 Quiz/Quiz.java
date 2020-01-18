import java.util.Scanner;
public class Quiz
  {
    public static void main(String[] args)
    {
int blue = 0;
int red = 0;
int yellow = 0;
int green = 0;
int spinCounter = 0;
int spinsAmount = 15;
double randNum;

while(spinCounter < spinsAmount)
{
   randNum = Math.random();
   spinCounter++;
   System.out.print(spinCounter + "\t" + randNum);

   if(randNum < 0.25)
   {
      blue++;
      System.out.println("blue");
   }
   else if (randNum >= 0.25 && randNum < 0.5)
   {
      red++;
      System.out.println("red");
   }
   else if (randNum >= 0.25 && randNum < 0.5)
   {
      red++;
      System.out.println("red");
   }
   else if (randNum >= 0.25 && randNum < 0.5)
   {
      red++;
      System.out.println("red");
   }
   else if (randNum >= 0.25 && randNum < 0.5)
   {
      red++;
      System.out.println("red");
   }
   else if (randNum >= 0.25 && randNum < 0.5)
   {
      red++;
      System.out.println("red");
   }
   else if (randNum >= 0.5 && randNum < 0.75)
   {
      yellow++;
      System.out.println("yellow");
   }
   else
   {
      green++;
      System.out.println("green");
   }
}

System.out.println("green: " + green);
System.out.println("yellow: " + yellow);
System.out.println("red: " + red);
System.out.println("blue: " + blue);    }
}

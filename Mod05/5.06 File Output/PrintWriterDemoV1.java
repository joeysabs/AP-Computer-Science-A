/**
 * The purpose of this program is to demonstrate the PrintWriter
 * class and its methods for writing to text files.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
class PrintWriterDemoV1
{
    public static void main (String [ ] args) throws IOException
    {

       PrintWriter outFile = new PrintWriter(new File("hello.txt"));
       Random randNumList = new Random();

       for (int loop = 1; loop <= 5; loop++)
       {
           outFile.println(randNumList.nextInt(100));
       }//end for loop

       outFile.close( );    //close the file when finished
    }//end of main method
}//end of class

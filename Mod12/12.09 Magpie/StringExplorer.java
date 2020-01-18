/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Joey Sabarese
 * @version 5/8/18
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = " like ";

        //  Add examples below for the following methods:
        //    trim()
        sample = sample.trim();
        System.out.println(sample);
        //    length()
        int sampleLen = sample.length();
        System.out.println(sampleLen);
        //    indexOf with one and two parameters
        int ind = sample.indexOf("k");
        System.out.println(ind);
        int ind1 = sample.indexOf("i", 0);
        System.out.println(ind1);
        //    substring() with one and two parameters
        String subStr = sample.substring(1);
        System.out.println(subStr);
        String subStr1 = sample.substring(1, 3);
        System.out.println(subStr1);
        //    compareTo()
        int compare = sample.compareTo("Like");
        System.out.println(compare);
        //    any other String methods you'd like to try

    }

}

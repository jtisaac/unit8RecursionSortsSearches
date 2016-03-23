import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
/**
 * Write a description of class thingreadedr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reader
{
    /** description of instance variable x (add comment for each instance variable) */
    private static int charcount;

    /**
     * Default constructor for objects of class thingreadedr
     */
    public reader()
    {
        // initialise instance variables
        charcount = 0;
    }


    public static void main(String[] args)
    {
        try
        {
            File inputFile = new File("words.txt");

            Scanner in = new Scanner(inputFile);
            in.useDelimiter("");

            while (in.hasNext())
            {
                charcount ++;
                in.next();
            }
            //System.out.println();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(charcount);
    }
}

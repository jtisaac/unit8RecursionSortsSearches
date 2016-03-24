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
    private static int wordcount;
    private static int linecount;
    

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
         try
        {
            File inputFile = new File("words.txt");

            Scanner inz = new Scanner(inputFile);
            inz.useDelimiter(" ");

            while (inz.hasNext())
            {
                wordcount ++;
                inz.next();
            }
            //System.out.println();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
         try
        {
            File inputFile = new File("words.txt");

            Scanner inq = new Scanner(inputFile);
            inq.useDelimiter("\n");

            while (inq.hasNext())
            {
                linecount ++;
                inq.next();
            }
            //System.out.println();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("The # of characters is: " + charcount + "\n"  + "The # of words is: " + wordcount + "\n" + "The # of lines is: " + linecount );
    }
}

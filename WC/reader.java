import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
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

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main()
    {
        File inputFile = new File("input.txt");

        Scanner in = new Scanner(System.in);
        in.useDelimiter("");
        PrintWriter out = new PrintWriter("input.txt");
        out.println("Hello");
        out.printf("Total: %8.2f\n");
        out.close();
        while (in.hasNext())
        {
            charcount ++;

        }

    }
}

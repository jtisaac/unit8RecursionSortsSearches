import java.util.Arrays;
/**
 * Write a description of class BubbleSorter here.
 * 
 * @author (Joseph name) 
 * @version (1)
 */
public class BubbleSorter
{
    /** description of instance variable x (add comment for each instance variable) */
    private static int x;
    private static int[] array = new int[10];
    private static boolean sorted;
    /**
     * Default constructor for objects of class BubbleSorter
     */
    public BubbleSorter()
    {
        // initialise instance variables
        sorted = false;
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
    public static void fillarray()
    {
        for (x = 0; x < array.length-1; x++)
        {
            array[x] = (int)(Math.random()*10);

        }
        for (int i : array)
        {
            System.out.println(i);
        }
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
    public static void sort()
    {
        int temp1;
        int temp2;
        int check = 0;
        //for (int x = 0; x < array.length - 1; x++)
        while (sorted == false)

        {
            for (int x = 0; x < array.length - 1; x++)

            {
                if (array[x] > array[x+1])

                {
                    temp1 = array[x];
                    temp2 = array[x+1];
                    array[x] = temp2;
                    array[x+1] = temp1;
                }
            }
            check = 0;
            for (int x = 0; x < array.length - 1; x++)
            {
                if (array[x] <= array[x+1])
                {
                    check ++;
                }
            }
            if (check == 9)
            {
                sorted = true;
            }
            
        }
        
        System.out.println(Arrays.toString(array));
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
    public static void main(String[] args)
    {
        fillarray();
        sort();
    }
}

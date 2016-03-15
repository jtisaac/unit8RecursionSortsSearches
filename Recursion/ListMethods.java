import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>(n);
      int t = n;
      
      if (n <= 0)  // The smallest list we can make
      {
          return new ArrayList<Integer>();
          
      }
      else        // All other size lists are created here
      {
          tempList.add(t);
          t --;
          tempList.addAll(ListMethods.makeList(t)); //head recusion
          
          
          
      }
      return tempList;
   }
   //public static ArrayList<Integer> reverseList(ArrayList<Integer> list)
   //{
       
    //}
    
}
public class StringReverse
{
    public static String reverse(String text)
    {
        if(text.length() == 1)
        {
            return text;
        }
        
        char c = text.charAt(0);
        String rest = text.substring(1);
        
        String reverseText = reverse(rest);
        reverseText += c;
        return reverseText;
        
    }
    public static String reverseIter(String text)
    {
        String reverseText = " ";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            char c = text.charAt(i);
            reverseText += c;
        }
        return reverseText;
    }
    public static void main (String[] args)
    {
        System.out.println(StringReverse.reverse("This is the the hte the the tehteh tthe teh teh ehteth eh teeeeeeeeeeeeeeeeeeeeeeeeeewwjethwkejthwkjehthtejwkwkjehthtjekwwkjehtthjewklekrjhhjtjlkwelwkerjhttrhjkwellwkerjthhtjrekwl!"));
        System.out.println(StringReverse.reverseIter("THTJHJT"));
        System.out.println("Expected: !olleH");
    }
}
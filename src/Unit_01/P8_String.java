package Unit_01;


/*
 * (Create separate logic in separate function)
 * Function 1 - Check the entered string is palindrome or not?
 * Function 2 - Make a reverse of a string using?
 * Function 3 - String Compare: Check if the strings are equal or not?
 */

public class P8_String
{
    public static void main(String[] args)
    {
        QuestionsOnString obj = new QuestionsOnString();

        String s1 = new String("12345");
        String s2 = new String("112211");

        obj.palindromeOrNot(s2);
        obj.reverseOfAString(s1);
        obj.stringEqualOrNot(s1, s2);
    }
}

class QuestionsOnString
{
    void palindromeOrNot(String s)
    {
        int n = s.length();
        String b = "";

        for(int i = n-1; i >= 0; i--)
        {
            b = b + s.charAt(i);
        }

        if(s.equalsIgnoreCase(b))
        {
            System.out.println("The String is palindrome");
        }
        else
        {
            System.out.println("The string is not palindrome");
        }
    }

    void reverseOfAString(String s)
    {
        int n = s.length();
        String b = "";
        for(int i = n-1; i >= 0; i--)
        {
            b = b + s.charAt(i);
        }
        System.out.println(b);

    }

    void stringEqualOrNot(String s1,String s2)
    {
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

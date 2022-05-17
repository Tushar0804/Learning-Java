package Unit_01;

import java.util.*;

/*
 * Create a switch statement, In Which:
 * When you pass 1 your program would print current year
 * When you pass 2 your program would print current month
 * When you pass 3 your program would print current day
 */
public class P7_SwitchStatementsInJava
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        System.out.println("Enter 1 - For Current Year");
        System.out.println("Enter 2 - For Current Month");
        System.out.println("Enter 3 - For Current Day");

        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println(c.get(Calendar.YEAR));
                break;
            case 2:
                System.out.println(c.get(Calendar.MONTH) + 1);  // since month's are indexed from 0
                break;
            case 3:
                System.out.println(c.get(Calendar.DATE));
                break;
            default:
                System.out.println("Not applicable");
                break;
        }
    }
}

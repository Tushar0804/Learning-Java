package Unit_02;
/*
 *  extends keyword
 *  Subclass
 *  SuperClass
 *  "Code Re-usability"
 *
 *  Types of inheritance:
 *  - single inheritance
 *  - Multilevel Inheritance
 *  - Multiple Inheritance : Java does not support multiple inheritances with classes
 *    It handles this feature by implementing more than one interface instead of extending more than one class.
 *  - Hierarchical Inheritance(Tree?)? : Yes!
 *  - Hybrid Inheritance? No!
 *
 *  Constructor Calls flow in inheritance!
 *  - Default constructor
 *  - Parameterized constructor
 */

public class P10_Task01_InheritanceInJava
{
    public static void main(String[] args)
    {
        Three obj = new Three();

        obj.methodOne();
        obj.methodTwo();
        obj.methodThree();
    }
}

class One
{
    int a;

    One(int a)
    {
        System.out.println("One Constructor");
        this.a = a;
    }

    public void methodOne()
    {
        System.out.println("First Method");
    }
}
class Two extends One
{
    int b;

    Two(int a, int b)
    {
        super(a);
        System.out.println("Two Constructor");
        this.b = b;
    }

    public void methodTwo()
    {
        System.out.println("Second Method");
    }
}
class Three extends Two
{
    int c;

    Three()
    {
        super (10, 20);
        System.out.println("Three Constructor");
        c = 30;
    }

    public void methodThree()
    {
        System.out.println("Third Method");
    }
}
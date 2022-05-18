package Unit_02;

public class P10_Task03_OverloadingAndOverridingInJava
{
    public static void main(String[] args)
    {
        OverloadingAndOverridingInJava obj = new OverloadingAndOverridingInJava();

        System.out.println("add() with 2 parameters (1, 2)");
        System.out.println(obj.add(1, 2));

        System.out.println("add() with 3 parameters (1, 2, 3)");
        System.out.println(obj.add(1, 2, 3));

        Inherit obj2 = new Inherit();
        System.out.println("Overriding");
        System.out.println(obj2.add (1, 2));
        System.out.println(obj2.add(1, 2, 3));

    }
}

class OverloadingAndOverridingInJava
{
    // Within the same class: Method overloading
    int add (int a, int b)
    {
        return a + b;
    }

    int add (int a, int b, int c)
    {
        return a + b + c;
    }
}

// Overriding in Java: Required Inheritance
class Inherit extends OverloadingAndOverridingInJava
{
    int add(int a, int b)
    {
        return a + b + 1;
    }

    int add (int a, int b, int c)
    {
        return a + b + c + 1;
    }
}

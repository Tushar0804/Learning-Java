package Unit_01;

/*
 * Variables in Java is a data container that saves the data values during Java program execute.
 * Types of variables :
 * In Java , there are three types of variables :
 *      Local Variables - They are declared inside the body of a method
 *      Instance Variables - They are defined without the STATIC keyword.
 *                         - They are defined outside a method declaration.
 *                         - They are object specific and are known as instance variables.
 *      Static Variables - They are defined with the STATIC keyword.
 *                       - They are initialized only once, at the start of the program execution.
 *                       - These static variables should be initialized first , before the initialization of any Data Types In Java.
 */
public class P3_Task01_VariablesAndDataTypesInJava {
    static int q = 11;
    int p = 10;

    public static void main(String[] args) {
        // Valid Declarations
        int a, b, c;
        float pi;
        double d;
        char e;

        // Valid Initialization
        pi = 3.14f;
        d = 20.22d;
        e = 'v';

        a = 10;
        b = 10;
        c = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("pi = " + pi);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int myNum = 5;                  // Integer (Whole Number)
        float myFloatNum = 5.99f;       // Floating Point Number
        char myLetter = 'D';            // Character
        boolean myBool = true;          // Boolean
        String myText = "Hello";        // String

        System.out.println("myNum = " + myNum);
        System.out.println("myFloat = " + myFloatNum);
        System.out.println("myLetter = " + myLetter);
        System.out.println("myBool = " + myBool);
        System.out.println("myText = " + myText);

        /*
         * Java Variables Type Conversion & Type Casting
         */

        double f;
        int i = 10;
        f = i;                     // Type Conversion

        double g = 10;
        int j;
        j = (int) g;                // Type Casting

        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("j = " + j);

        byte k = 10;                    // 1 byte
        boolean l = true;               // 1 bit = true or false only
        long m = 10L;
        float n = 1.2f;
        double o = 1.2d;

        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);

        System.out.println("ABC.j = " + ABC.j);       // data + functions/methods
        //ABC.display();

        ABC obj1 = new ABC();
        System.out.println("obj1.i++ = " + obj1.i++);
        System.out.println("obj1.i = " + obj1.i);

        ABC obj2 = new ABC();
        System.out.println("obj2.i = " + obj2.i);

        System.out.println("ABC.j++ = " + ABC.j++);
        System.out.println("ABC.j = " + ABC.j);

        ABC.typeConversionAndTypeCasting();
    }

    int r = 10;

    void display() {
        int a = 5;                  // local variable
        System.out.println("This is Display Method !");
        System.out.println(a);
    }
}
class ABC
{
    static int j = 10;               // class variable/static variable
    int i = 10;                     // Instance variable

    static void display()
    {
        int a = 5;                  // local variable
        System.out.println("This is display method!");
        System.out.println(a);
    }


    static void typeConversionAndTypeCasting()
    {
        double f;                    // 64 slots
        int i = 10;                  // 32 slots
        f = i;                       // Type Conversion
        System.out.println(f);

        double g = 10;               // 64 slots
        int j;                       // 32 slots
        j = (int)g;                  // Type Casting

        System.out.println("In Function \"typeConversionAndTypeCasting\"");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
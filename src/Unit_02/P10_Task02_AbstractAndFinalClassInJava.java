package Unit_02;

/*
 * Abstract Class:
 * An abstract class must be declared with an abstract keyword.
 * Abstraction is a process of hiding the implementation details and showing only functionality
 * (function declarations) to the user.
 * Can not make object of abstract class directly, but through derived class
 *
 * Example of abstract method?
 *
 * Abstract Class may contain abstract and non-abstract methods - (0-100%) abstract methods can be there.
 *
 * In case of Interface: 100% abstract methods should be there.
 *
 * Final Class:
 * The main purpose of using a class being declared as final is to prevent the class from being inherited.
 * If a class is marked as final then no class can inherit any feature from the final class.
 * You cannot extend a final class. If you try it gives compile time error.
 */

abstract class Bike
{
    Bike()
    {
        System.out.println("Inside Bike Constructor");
    }

    abstract void run(); // abstract method! (0-100%)

    void display()
    {
        System.out.println("This is display method of Bike class");
    }
}
class Honda extends Bike
{
    // Override
    void run()
    {
        System.out.println("This is run method inside class Honda");
    }
}

public class P10_Task02_AbstractAndFinalClassInJava
{
    public static void main(String[] args)
    {
        // Bike obj = new Bike();  // cannot be instantiated

        Honda hd = new Honda();
        hd.display();
        hd.run();
    }
}


// Final Class - cannot be extended
final class Super
{
    public int data = 30;

    void display()
    {
        System.out.println(data);
    }
}

/*
public class Sub extends Super {

	void display2()
	{
		display();
	}
}
*/


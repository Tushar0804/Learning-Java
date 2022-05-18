package Unit_02;

/*
 * An interface is a completely (100%) "abstract class",
 * that is used to group related methods with empty bodies
 * Need of interface?
 * Multiple interface can be implemented at the same time in one class?
 * Can an interface extends another interface?
*/

// interface (100% Abstract Class)
interface Animal
{
    public void animalSound();      // interface method (does not have a body)
    public void run();
}
interface Human
{
    public void humanSound();       // interface method (does not have a body)
    public void run1();
}

// Multiple interfaces can be implemented at the same time
class Species implements Animal, Human
{
    public void animalSound()
    {
        System.out.println("Class Species - Method animalSound");
    }
    public void run()
    {
        System.out.println("Class Species - Method run");
    }

    public void humanSound()
    {
        System.out.println("Class Species - Method humanSound");
    }
    public void run1()
    {
        System.out.println("Class Species - Method run1");
    }
}

interface A1
{
    void funcA();
}

interface B1 extends A1
{
    void funcB();
}

class C1 implements B1
{
    public void funcA()
    {
        System.out.println("This is funcA from A1");
    }
    public void funcB()
    {
        System.out.println("This is funcB from A2");
    }
}

public class P12_InterfaceInJava implements Animal
{
    public void animalSound ()
    {
        System.out.println("Animal Sound Method");
    }
    public void run()
    {
        System.out.println("Run Method");
    }

    public static void main(String[] args)
    {
        P12_InterfaceInJava obj = new P12_InterfaceInJava();
        obj.animalSound();
        obj.run();

        Species obj2 = new Species();
        obj2.animalSound();
        obj2.run();
        obj2.humanSound();
        obj2.run1();


        C1 obj3 = new C1();
        obj3.funcA();
        obj3.funcB();
    }
}

package Unit_03;

/*
 * MultiThreading in java is a process of executing multiple threads simultaneously.
 * So, Independent work can be done simultaneously.
 * It is used to utilize cpu to a maximum.
 *
 * Main Thread -> If no other is there then work will be done is main thread only.
 *
 * There are two ways to create a thread in java.
 * -> By implementing Runnable Interface.
 * -> By extending Thread class.  (Overriding run method)
 *
 * There are various stages of life cycle of a thread
 * -> New
 * -> Runnable
 * -> Running
 * -> Waiting
 * -> Dead
 */

public class P16_MultiThreadingInJava
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new T1(), "T1");
        Thread t2 = new Thread(new T2(), "T2");

        t1.start();
        t2.start();
    }
}

// creating a thread by extending class Thread
class T1 extends Thread
{
    @Override
    public void run()
    {
        try{
            Thread.sleep(3);
            System.out.println("T1 is done by now!");
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

// creating a thread by implement interface runnable
class T2 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println(i + " T2");
        }
    }
}
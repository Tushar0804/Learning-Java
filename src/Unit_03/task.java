package Unit_03;

import java.util.Random;

public class task
{
    public static void main(String[] args) throws InterruptedException
    {
        // Creating three Threads t1, t2, t3
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadOne());
        Thread t3 = new Thread(new ThreadOne());

        // starting the thread
        t1.start();
        t2.start();
        t3.start();

        // waiting for the threads to finish
        t1.join();
        t2.join();
        t3.join();

        // printing the maximum number generated
        System.out.println("Max: " + ThreadOne.max);
    }
}

// creating a thread by extending class Thread
class ThreadOne extends Thread
{
    static int max = 0;             // for storing the maximum generated number

    public synchronized void maximum(int a)
    {
        if(max < a)
            max = a;
    }

    public void run()
    {
        // generating a random number using Random class method
        Random rd = new Random();
        int num = 1 + rd.nextInt(99);

        // printing the random number
        System.out.println("Random Number: " + num);

        // finding the maximum number generated till now
        maximum(num);
    }
}
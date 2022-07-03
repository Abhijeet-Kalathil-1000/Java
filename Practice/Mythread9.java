import java.lang.*;
import java.util.*;
import java.lang.Exception;


class Marvellous extends Thread
{
     public void run()
    {
        System.out.println("Insiede thread :"+Thread.currentThread().getName());
        System.out.println("Thread priority :"+Thread.currentThread().getPriority());
    }
}

class Mythread9
{
    public static void main(String ar[]) throws Exception
    {
        Marvellous mobj1 = new Marvellous();
        Thread t1 = new Thread(mobj1,"First");

        Marvellous mobj2 = new Marvellous();
        Thread t2 = new Thread(mobj2,"Second");

        t1.start();
        t2.start();

        System.out.println("End of main thread");
    }
}
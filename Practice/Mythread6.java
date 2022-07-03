import java.lang.*;
import java.lang.Exception;

class Demo extends Thread
{
    public void run() //    3.RUNNING STATE
    {
        for(int i = 0;i<10;i++)
        {
            System.out.println("Vlaue of i : "+i);
            try
            {
                Thread.sleep(100);
            }
            catch(Exception obj)
            { }
        }
    }
}

class Mythread6
{
    public static void main(String[] args) throws Exception
    {
    
        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1,"First"); //    1.NEW STATE


        Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2,"Second"); //    1.NEW STATE

        t1.start();     //  2.RUNNABLE STATE

        t1.join();

        t2.start();     //  2.RUNNABLE STATE

        //DEAD STATE
    }
}
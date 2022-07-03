import java.lang.*;

class Marvellous extends Thread
{
    public void run()
    {
        System.out.println("Inside thread : "+Thread.currentThread().getName());
    }
}

class Mythread2
{
    public static void main(String args[])
    {
        Marvellous mobj1 = new Marvellous();
        Thread t1  = new Thread(mobj1,"First");
                
        Marvellous mobj2 = new Marvellous();
        Thread t2  = new Thread(mobj2,"Second");
        
        t1.start();
        t2.start();
    }
}
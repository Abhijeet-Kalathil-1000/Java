import java.util.*;

class Mythread1
{
    public static void main(String args[])
    {
        System.out.println("Inside main");

        Thread tobj = Thread.currentThread();
        System.out.println("Name od current thread is : "+tobj.getName());
        
    }
}
import java.lang.*;

class Virtual
{
public static void main (String arg[])
    {
        //Base bobj = new Base();
        //Derived dobj = new Derived();

        Base obj = new Derived();
        //Base obj2 = new Base();

        obj.fun();
        obj.gun();
        obj.sun();
        //obj.run();
    }   
}

class Base
{
    
    public int i , j;
    public void fun()
    {
        System.out.println("Base Fun");
    }
    
    public void gun()
    {
        System.out.println("Base gun");
    }
    
    public void sun()
    {
        System.out.println("Base sun");
    }
}

class Derived extends Base
{
    public int x,y;

    public void fun()
    {
        System.out.println("Derived Fun");
    }
    
    public void sun()
    {
        System.out.println("Derived sun");
    }
    
    public void run()
    {
        System.out.println("Derived run");
    }
}


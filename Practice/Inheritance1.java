import java.lang.*;
import java.net.SocketPermission;

class Inheritance1
{

    public static void main(String arg[])
    {
        System.out.println("Inside main block");
        Derived dobj = new Derived();
        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        dobj.sun();
    }

    static
    {
        System.out.println("Inside Static block");
    }
}

class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside Base cons");
    }

    public void  fun()
    {
        System.out.println("Inside Base Fun");
    }

    public void  fun(int x)
    {
        System.out.println("Inside Base Fun with integer argument");
    }
    
    public void  gun()
    {
        System.out.println("Inside Base Gun");
    }
}

class Derived extends Base
{
    public int x;
    public int y;

    public Derived()
    {
        System.out.println("Inside derived Cons");
    }
    public void sun()
    {
        System.out.println("Inside derived sun");
    }
}
import java.lang.*;
import java.net.SocketPermission;

class Inheritance4
{
    public static void main(String arg[])
    {
        System.out.println("Inside main block");
        Derived dobj = new Derived();
 
        dobj.sun();
    }
}

class Base
{
    public int i;
    public int j;

    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base
{
    public int x;
    public int y;


    public void sun()
    {
        System.out.println("Inside derived sun");
    }
}

class DerivedX extends Derived
{
    public int a;

    public void sun()
    {
        System.out.println("Inside derivedX sun");
    }
}
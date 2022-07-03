import java.lang.*;


class Final2
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();
    }
}

class Base
{
    public void fun()
    {
        System.out.println("Base Fun");
    }
    
    public final void gun()
    {
        System.out.println("Base final gun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived Fun");
    }
    /*
    public void gun()
    {
        System.out.println("Derived final gun");
    }*/
}
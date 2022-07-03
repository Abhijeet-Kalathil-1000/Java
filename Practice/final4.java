import java.lang.*;

class Final4
{
    public static void main(String arg[])
    {
    System.out.println("Inside main");
    Derived dobj = new Derived();
    dobj.bobj.fun();
    dobj.gun();
    }
}
final class Base 
{
    public void fun()
    {
        System.out.println("Base fun");
    }
}

class Derived
{
    public Base bobj = new Base();   //composition

    public void gun()
    {
        System.out.println("Derived gun");
    }

}
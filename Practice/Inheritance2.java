import java.lang.*;
import java.net.SocketPermission;

class Inheritance2
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

    public Base()
    {
        System.out.println("Inside Base cons");
        this.i = 10;
        this.j = 20;
    }

    public Base(int a, int b)
    {
        this.i = a;
        this.j = b;
    }

    public void  fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base
{
    public int x;
    public int y;

    public Derived()
    {
        super(11,21);  //3
        System.out.println("Inside derived Cons");
        this.x = 30;
        this.y = 40;
    }
    public void sun()
    {
        System.out.println("Inside derived sun");
        System.out.println(super.i); //1
        super.fun();   // 2
    }
}
import java.lang.*;


class Marvellous
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        Demo1 obj = new Demo1();
        obj.fun();
        obj.gun();
        System.out.println(obj.i);

        Demo1 objx = new Demo1(11,21);
        objx.fun();
        objx.gun();
        System.out.println(objx.i);
        System.out.println(objx.j);
    }
}

class Demo1
{
    public int i;
    public int j;

    public Demo1()
    {
        this.i = 0;
        this.j = 0;
    }

    public Demo1(int x,int y)
    {
        this.i = x;
        this.j = y;
    }
    
    public void fun()
    {
        System.out.println("Inside Fun");
    }
    public void gun()
    {
        System.out.println("Inside Gun");
    }
}

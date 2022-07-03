import java.lang.*;


class Final1
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.k);
        System.out.println("---------------------------");
        Demo obj2 = new Demo(11,21);
        obj2.fun();
        System.out.println(obj2.i);
        System.out.println(obj2.j);
        System.out.println(obj2.k);
    }
}

class Demo
{
    public int i;
    public final int j=20;
    public final int k;

    public Demo()
    {
        this.i = 10 ;
        this.k = 30;
    }

    public Demo(int a, int b)
    {
        this.i = a;
        this.k = b;
    }
    public void fun()
    {
        i++;    //Allowed
//        j++;   Not allowed
//        k++;   Not allowed
    }
}

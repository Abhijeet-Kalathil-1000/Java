import java.lang.*;

class Command
{
    public static void main(String Arg[])
    {
        int iSum = 0;
        System.out.println("First number is : "+Arg[0]);
        System.out.println("Second number is : "+Arg[1]);

        iSum = Integer.parseInt(Arg[0])+ Integer.parseInt(Arg[1]);

        System.out.println(iSum);
    }
}
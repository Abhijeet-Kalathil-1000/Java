import java.util.*;

class Input
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sobj.nextLine();

        System.out.println("Please enter yout age");
        int age = sobj.nextInt();

        System.out.println("Please enter your percentage");
        float percentage = sobj.nextFloat();

        System.out.println("Yout name is : "+name);
        System.out.println("Yout age is : "+age);
        System.out.println("Yout percentage is : "+percentage);
        
        sobj.close();
    }
}
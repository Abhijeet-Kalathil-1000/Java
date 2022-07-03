import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean CheckBit(int iNo)
    {
        int iMask = 64, iResult = 0;
        
        iResult = iNo & iMask;

        if(iResult == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class program196
{
    public static void main(String args[]) 
    {
        Scanner sobj =  new Scanner(System.in);
        
        System.out.println("Enter number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bRet = bobj.CheckBit(value);

        if (bRet == true)
        {
            System.out.println("Bit is on");
        }
        else
        {
            System.out.println("Bit is off");
        }
    }
}
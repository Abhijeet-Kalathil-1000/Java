import java.lang.*;
import java.util.*;

class Bitwise
{
    public int CheckBit(int iNo)
    {
        int iMask = 0X04000000; 
        int iResult = 0;
        
        iResult = iNo | iMask;

        return iResult;
        
    }
}

class program200
{
    public static void main(String args[]) 
    {
        Scanner sobj =  new Scanner(System.in);
        
        System.out.println("Enter number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iRet = bobj.CheckBit(value);

        System.out.println(iRet);
           }
}
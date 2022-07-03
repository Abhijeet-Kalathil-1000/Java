import java.lang.*;
import java.util.*;

class Bitwise
{
    public int DynamicMask(int iNo,int iPos)
    {
        if((iPos < 1)||(iPos>32))
        {
            System.out.println("Invalid position");
            return 0;
        }
        int iMask = 0X00000001; 
        
        int iResult = 0;
        
        iMask = iMask<<(iPos-1);
        
        iResult = iNo ^ iMask;

        return iResult;
    }
}

class program203
{
    public static void main(String args[]) 
    {
        Scanner sobj =  new Scanner(System.in);
        
        System.out.println("Enter number");
        int value = sobj.nextInt();

        System.out.println("Enter pos");
        int pos = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iRet = bobj.DynamicMask(value,pos);

        System.out.println(iRet);       
    }
}
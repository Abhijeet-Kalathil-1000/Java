import java.lang.*;
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo)
    {
        int iMask = 0X00000048; 
        int iResult = 0;
        
        iResult = iNo ^ iMask;

        return iResult;
    }
}

class program202
{
    public static void main(String args[]) 
    {
        Scanner sobj =  new Scanner(System.in);
        
        System.out.println("Enter number");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iRet = bobj.ToggleBit(value);

        System.out.println(iRet);       
    }
}
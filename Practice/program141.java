import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number : ");
        this.iNo = sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Value is : "+this.iNo);
    }
    
    public int Factotial()
        {
            int iCnt = 0,iFact=1;
            for(iCnt=1;iCnt<=iNo;iCnt++)
            {
                iFact = iFact*iCnt;
            }
            return iFact;
        }

}

class program141
{
    public static void main(String args[]) 
    {
        int iRet = 0 ;
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();
        iRet = nobj.Factotial();

        System.out.println("Factorialis : "+iRet);
    }
}
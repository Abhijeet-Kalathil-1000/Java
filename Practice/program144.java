import java.lang.*;
import java.util.*;

class ArrayX
{
    private int Arr[];
    
    public ArrayX(int iNo)
    {
        Arr = new int[iNo];
    }

    public void Accept()
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the values : ");    
        for(iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]= sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;
        System.out.println("Elements of array are : ");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Summation()
    {
        int iCnt = 0, iSum = 0;
        for(iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class program144
{
    public static void main(String[] args) 
    {
        int iLenght = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value for cons : ");
        iLenght = sobj.nextInt();

        ArrayX obj = new ArrayX(iLenght);

        obj.Accept();
        obj.Display();
        iRet = obj.Summation();

        System.out.println("Addition is : "+iRet);

        obj = null;
    }
}
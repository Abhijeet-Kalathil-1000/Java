import java.lang.*;
import java.lang.Exception;

import javax.lang.model.element.Name;

class Employee implements Cloneable
{
    public int EID;
    public String Ename;
    public int ESalary;

    public Employee(int id, String str, int no)
    {
        this.EID = id;
        this.Ename = str;
        this.ESalary = no;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Copy
{
    public static void main(String arg[]) throws Exception
    {
        Employee eobj = new Employee(18,"Abhijeet",2500);
        System.out.println("EID :"+eobj.EID+" Name :" +eobj.Ename+" Salary : "+eobj.ESalary);

        Employee eobjX = (Employee)eobj.clone();
        System.out.println("EID :"+eobjX.EID+" Name :" +eobjX.Ename+" Salary : "+eobjX.ESalary);

        eobj.Ename = "Wolver";
        System.out.println("EID :"+eobjX.EID+" Name :" +eobjX.Ename+" Salary : "+eobjX.ESalary);
    }
}
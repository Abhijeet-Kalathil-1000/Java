import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

class Student
{
    public int iRoll;
    public String sName;
    public int iAge;

    public Student(int a,String b,int c)
    {
        this.iRoll = a;
        this.sName = b;
        this.iAge = c;
    }

    public String toString() 
    {
        return iRoll + " " + sName + " " + iAge;
    }
}

class CDBMS
{

    // public static void AddStudent(LinkedList SLL,String iRoll, String sName, String iAge)
    // {

    //     int Roll = Integer.parseInt(iRoll);
    //     int Age = Integer.parseInt(iAge);

    //     SLL.add(new Student(Roll, sName, Age));
        
    //     System.out.println("Student added successfully !!!");
    // }

    // public static void DisplayStudent(LinkedList SLL)
    // {
    //     for(Student stdobj : SLL)
    //     {
    //         System.out.println( stdobj );
    //     }
            
    // }   


    public static void DisplayMenu()
    {

        System.out.println("Below are the list of Operations available :\n");
        System.out.println("SELECT QUERY: Select * from table_name;");
        System.out.println("INSERT QUERY: Insert into table_name values value1 value2 value3;");
        System.out.println("DELETE QUERY: Delete from table_name where value1 = value_data");
    }

    public static void main(String[] args) 
    {

        Scanner sobj = new Scanner(System.in);       
        LinkedList<Student> SLL = new LinkedList();
        
        while(true)
        {
            System.out.print("\nCustimized DBMS ::>  ");
            String query = sobj.nextLine();
                        
            String[] qCheck = query.split(" ");

           
            if((qCheck[0].equals("Quit")) || (qCheck[0].equals("QUIT")) || (qCheck[0].equals("quit")))
            {
                System.out.println("Quit Successfully !!");
                break;
            }
            else if((qCheck[0].equals("Help")) || (qCheck[0].equals("HELP")) || (qCheck[0].equals("help")))
            {
                DisplayMenu();
            }
            else
            {

                if( (qCheck[3].equals("Students")) || (qCheck[2].equals("Students")) ||   (qCheck[3].equals("students")) || (qCheck[2].equals("students"))  ||  (qCheck[3].equals("STUDENTS")) || (qCheck[2].equals("STUDENTS")))
                {    
                    if((qCheck[0].equals("insert")) || (qCheck[0].equals("Insert")) || (qCheck[0].equals("INSERT")) )
                    { 
                        int Roll = Integer.parseInt(qCheck[4]);
                        int Age = Integer.parseInt(qCheck[6]);

                        SLL.add(new Student(Roll,qCheck[5],Age));

                        System.out.println("Student added successfully !!!");
                    }
                    else if((qCheck[0].equals("select")) || (qCheck[0].equals("Select")) || (qCheck[0].equals("SELECT")) )
                    {
                        System.out.println("Output :");
                        for(Student element : SLL)
                        {
                            System.out.println(element + "\n");
                        } 
                    }
                    else if((qCheck[0].equals("delete")) || (qCheck[0].equals("Delete")) || (qCheck[0].equals("DELETE")) )
                    {
                        System.out.println("No delete fun");
                    }
                    else
                    {
                        System.out.println("ERROR : Wrong query !!");
                    }
                }
                else
                {
                    System.out.println("ERROR : Wrong table name !!");
                    System.out.println("Hint : Table name could be Students !");
                }
            }
        }
    }
}

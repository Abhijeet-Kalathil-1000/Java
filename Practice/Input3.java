import java.io.*;

class Input3
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        
        System.out.println("Enter sting :");
        String str = bobj.readLine();

        System.out.println("Enter integer :");
        int no = Integer.parseInt(bobj.readLine());

        System.out.println("Enter float :");
        float f = Float.parseFloat(bobj.readLine());

        System.out.println("Enter double :");
        double d = Double.parseDouble(bobj.readLine());

        System.out.println("String is : "+str);
        System.out.println("Integer is : "+no);
        System.out.println("Float is : "+f);
        System.out.println("Double is : "+d);
    }
}
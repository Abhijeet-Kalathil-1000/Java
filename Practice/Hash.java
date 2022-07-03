import java.lang.*;

class Demo
{
    
}
class Hash
{
    public static void main(String arg[]) throws Exception
    {
        String str1 = "Marvellous";
        String str2 = "Marvellous";
        String str3 = "Infosystems";

        Demo dobj = new Demo();

        System.out.println("Hash code of str1 : "+str1.hashCode());
        System.out.println("Hash code of str1 : "+str2.hashCode());
        System.out.println("Hash code of str1 : "+str3.hashCode());
        System.out.println("Hash code of dobj : "+dobj.hashCode());
    }
}
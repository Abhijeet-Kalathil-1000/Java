import java.lang.*;

class Arithematic <T>
    {   
        public T No1;
        public T No2;
    
        Arithematic(T a, T b)
        {
            No1 = a;
            No2 = b;
        }
    
        public T Addition()
        {
            if((No1 instanceof Integer) && (No2 instanceof Integer))
            {
                return (T)(Integer)((Integer)No1 + (Integer)No2);
            }
            else if ((No1 instanceof Float) && (No2 instanceof Float))
            {
                return (T)(Float)((Float)No1 + (Float)No2);
            }
            else if ((No1 instanceof Double) && (No2 instanceof Double))
            {
                return (T)(Double)((Double)No1 + (Double)No2);
            }
            else
            {
                return null;
            }  
        }
    }
   
class GenericOOP
{
    public static void main(String[] args) 
    {
     Arithematic <Integer>obj = new Arithematic<Integer>(10,11);
     Integer ret = 0;
     ret = obj.Addition();
     System.out.println("Additon : "+ret);

     Arithematic <Float>obj2 = new Arithematic<Float>(10.23f,11.53f);
     Float fret = 0.0f;
     fret = obj2.Addition();
     System.out.println("Additon : "+fret);
    }
}
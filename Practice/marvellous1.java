import java.lang.*;

class Marvellous1
{
    public static void main(String arg[])
    {
        System.out.println("Value of PI is :"+Circle.PI);
        Circle.PT = 6.14f;

        Area obj = new Area();
        float fRet = 0.0f;
        fRet = obj.CalculateArea(10.5f);
        System.out.println("Area is : "+fRet);
        
        fRet = obj.CalculateCuircumfrance(10.5f);
        System.out.println("Cuircumfrance is : "+fRet);
        
    }
}
interface Circle
{
    float PI = 3.14f;

    float CalculateArea(float Radius);
    float CalculateCuircumfrance(float Radius);
}

class Area implements Circle
{
    public float CalculateArea(float Radius)
    {
        return (PI * Radius * Radius);
    }
    public float CalculateCuircumfrance(float Radius)
    {
        return (2 * PI * Radius);
    }
}



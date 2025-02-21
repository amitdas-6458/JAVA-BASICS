import java.util.Scanner;


public class area_of_traingle
{
    public static void main(String[] args)
    {

       int a,b,c,s;
       double area;
       System.out.println("enter the side of the triangle:");
       Scanner obj=new Scanner(System.in);

       a=obj.nextInt();
       b=obj.nextInt();
       c=obj.nextInt();

       s=(a+b+c)/2;

       area=Math.sqrt(s*(s-a)*(s-b)*(s-c)); //sqrt() it is math library method which is comes under java.lang.math package which is a default package of java that we dont need to declare that package
       System.out.println("area of traingle is " +area);

       obj.close();

    }
}

import java.util.Scanner;

public class power_of_no 
{
   public static void main(String[] args)
   {
    
    int number,power,result=1;
    System.out.println("enter a number:\n");
   
    Scanner obj=new Scanner(System.in);

    number=obj.nextInt();

    System.out.println("enter the power of that number:\n");

    power=obj.nextInt();

    for(int i=1;i<=power;i++)
    {
        result=number*result; //logic of power
    }

    System.out.println("power of "+ number + " is " + result);

    obj.close();
   } 
}

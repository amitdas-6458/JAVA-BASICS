import java.util.Scanner;

public class factorial
{
 
    public static void main(String[] args)
    {
        int number,fact=1;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);

        number=obj.nextInt();

        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }

        System.out.println("factorial of given number: " +fact );

        obj.close();
    }
}

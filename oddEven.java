import java.util.Scanner;

public class oddEven
{

    public static void main(String[] args)
    {
        int a;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();

        if(a%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }

        obj.close();

    }

    
}

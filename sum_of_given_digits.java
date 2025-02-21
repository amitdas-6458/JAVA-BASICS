import java.util.Scanner;

public class sum_of_given_digits
{

    public static void main(String[] args)
    {

        int n,rem,sum=0;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        while (n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }

        System.out.println("sum of this number is:" + sum);

        obj.close();
    }
    
}

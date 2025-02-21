import java.util.Scanner;

public class prime_between_2_no
{

    public static void main(String[] args)
    {

        int number1,number2,i,j;
        System.out.println("enter 2numbers: ");
        Scanner obj=new Scanner(System.in);
        number1=obj.nextInt();
        number2=obj.nextInt();

        System.out.println("prime numbers betwen " + number1 + "to " + number2 + "are: " );

        for(i=number1;i<=number2;i++)
        {

            for(j=2;j<=i;j++) //j=2 because our smaalest prime no. is 2
            {

                if (i%j==0)
                break;
                
            }

            if (i==j)

            System.out.println(j);

        }

        obj.close();
    }
    
}

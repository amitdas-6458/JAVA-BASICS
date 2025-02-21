import java.util.Scanner;

public class count_digits_in_number
{

    public static void main(String[] args)
    {


        int number,count=0;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);

        number=obj.nextInt();

        while(number>0)
        {
            number=number/10;
            count++;
        }

        System.out.println("no. of digits in this no. is: " + count);

        obj.close();
    }
    
}

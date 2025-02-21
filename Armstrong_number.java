import java.util.Scanner;

public class Armstrong_number /*number is equal to sum of its own digits each raised to the power of the number of digits
                                suppose a no.153
                                it have 3 digits 1,5 and 3 ,so tatal digit is 3
                                (1*1*1)+(5*5*5)+(3*3*3)=153
                                */
{

    public static void main(String[] args)
    {

        int number,rem,armstrong_number=0,compare_with_armstrong_no;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);
        number=obj.nextInt();

        compare_with_armstrong_no=number;

        while (number>0)
        {
            rem=number%10;
            armstrong_number=(armstrong_number*armstrong_number*armstrong_number)+armstrong_number;
            number=number/10;
        }

        if (compare_with_armstrong_no==armstrong_number)
        {

            System.out.println("this no. is armstrong number");
        }
        else
        {
            System.out.println("this no. is not armstrong number");
        }

        obj.close();
    }
    
}

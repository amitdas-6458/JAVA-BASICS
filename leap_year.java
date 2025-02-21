import java.util.Scanner;

public class leap_year
{
    public static void main(String[] args)
    {

        int year;
        System.out.println("enter a year:");
        Scanner obj=new Scanner(System.in);
        year=obj.nextInt();

        if(year%4==0)
        {
            System.out.print("this year is a leap year");
        }
        else
        {
            System.out.println("this year is not a leap year");
        }

        obj.close();

    }
    
}

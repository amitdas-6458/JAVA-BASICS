import java.util.Scanner;

public class reverse_a_number
{
    public static void main(String[] args)
    {
        int number,rem;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);
        number=obj.nextInt();

        while (number >0)
        {

             rem=number%10;
             System.out.print(rem); /*there is print statement in java one is 
                                               "System.out.println()" which print the data by creating a new line
                                    and another one is
                                               "System.out.print()" which print the data without creating new line*/
             number/=10;
            
        }

        obj.close();

        
    }
}

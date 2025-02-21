import java.util.Scanner;

public class multiplication_table
{
    public static void main(String[] args)
    {

        int number;
        System.out.println("enter the table value:");
        Scanner obj=new Scanner(System.in);

        number=obj.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(number + "*" + i + "=" + number*i);
        }

        obj.close();
    }
}

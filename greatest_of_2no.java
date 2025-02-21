import java.util.Scanner;

public class greatest_of_2no 
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("enter two numbers:\n");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();

        if(a>b)
        {
            System.out.println(a+" is greater number");
        }
        else{
            System.out.println(b+" is greater");
        }

        obj.close();
    }
}

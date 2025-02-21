import java.util.Scanner;

public class copy_array_elements_to_another_array
{
    
    public static void main(String[] args)
    {

        int a[]=new int[5];
        int b[]=new int[5];
        System.out.println("enter the elementd of an array: ");
        Scanner obj=new Scanner(System.in);

        for(int i=0;i<=4;i++)
        {

            a[i]=obj.nextInt();

        }

        System.out.println("array elements are:");

        for(int i=0;i<5;i++)
        {

            System.out.println(a[i]);
        }

        System.out.println("Second array elements are after copy: ");

        for(int i=0;i<5;i++)
        {

            b[i]=a[i];
            System.out.println(b[i]);
        }

        obj.close();
    }
}

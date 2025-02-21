import java.util.Scanner;

public class reverse_order_of_array
{

    public static void main(String[] args)
    {
        
        int arr[]=new int[5];
        Scanner obj=new Scanner(System.in);
       
        System.out.print("enter array elements: ");

        for(int i=0;i<=4;i++)
        {

            arr[i]=obj.nextInt();

        }

        System.out.println("array elements: ");

        for(int i=0;i<arr.length;i++) //or we can write for(int=0;i<=4;i++)
                                      //arr.length means length of an array
        {

            System.out.println(arr[i] + " ");

        }

        System.out.println("reverse order of array elements: ");

        for(int i= arr.length-1;i>=0;i--) // or we can write for(int i=5;i>=0;i--)
        {

            System.out.println(arr[i] + " ");

        }
        

        obj.close();
    }
    
}

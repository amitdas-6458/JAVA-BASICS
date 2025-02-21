//print all no. in a given range
import java.util.Scanner;
public class odd_no_given_range
{

    public static void main(String[] args)
    {
        int n,i,sum=0;
        System.out.println("enter the range of the number that u want to find odd no:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        if(n%2==0)
        {
            for(i=0;i<=n;i=i+2) /*Increment by 2 to get only odd numbers*/
            {
                sum=sum+i;
            }
            System.out.println(sum);

        }
        else
        {
            for(i=1;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println(sum);


        }

        
       
        obj.close();
    }

    
}
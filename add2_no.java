import java.util.Scanner;
public class add2_no
{

    public static void main(String[] args)
    {

        int no1,no2;
        System.out.println("enter 2 numbers: \n " + " ");
        Scanner obj=new Scanner(System.in);
        

        no1=obj.nextInt();
        no2=obj.nextInt();
      

        int sum= no1+no2;
        System.out.println("sum of 2 number is" + sum);

        obj.close();
        


    }
    
}

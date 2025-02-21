import java.util.Scanner;

public class input_output
{
   public static void main(String[] args)
   {
    
    int a;

    System.out.println("enter data:");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    System.out.println("get data:" +a);
    obj.close();

   }

    
}

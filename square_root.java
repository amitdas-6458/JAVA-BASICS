import java.util.Scanner;

public class square_root
{

   public static void main(String[] args)
   {

    int number;
    System.out.println("enter a number:");
    Scanner obj=new Scanner(System.in);
    number=obj.nextInt();

    double Square_root_No=Math.sqrt(number);
    System.out.println("square root of this number is " + Square_root_No);

    obj.close();
} 
}

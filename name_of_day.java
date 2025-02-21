import java.util.Scanner;

public class name_of_day
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("enter code of day:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        switch (n) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
            System.out.println("monday");
                break;
            case 2:
            System.out.println("tuesday");
                break;
            case 3:
            System.out.println("wednesday");
                break;
            case 4:
            System.out.println("thursday");
                break;
            case 5:
            System.out.println("friday");
                break;
            case 6:
            System.out.println("saturday");
                break;
            case 7:
            System.out.println("saturday");
                break;
            default:
            System.out.println("nothing");
                break;
        }

        obj.close();


    }
    
}

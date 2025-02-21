import java.util.Scanner;
public class natural_no
{
    public static void main(String[] args)
    {
        int term;
        System.out.println("enter the number of term:" + " ");
        Scanner obj=new Scanner(System.in);
        term=obj.nextInt();

        for(int i=1;i<=term;i++)
        {
            System.out.println(i+" ");
        }

        obj.close();
    }

}

import java.util.Scanner;

public class character_converter
{

    public static void main(String[] args)
    {
        char ch,ch2;
        System.out.println("enter a character:");
        Scanner obj=new Scanner(System.in);

        ch=obj.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            ch2=Character.toLowerCase(ch);
            System.out.println("lowercase of "+ ch + " is "+ ch2);
        }
        else
        {
            ch2=Character.toUpperCase(ch);
            System.out.println("uppercase of "+ ch + " is "+ ch2);
        }

        obj.close();
    }


    
}

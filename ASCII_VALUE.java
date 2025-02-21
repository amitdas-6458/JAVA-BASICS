//print ASCII value of a character...

import java.util.Scanner;

public class ASCII_VALUE
{
    
    public static void main(String[] args)
    {
        char ch;
        System.out.println("enter a character:");
        Scanner obj=new Scanner(System.in);
        ch=obj.next().charAt(0);

        int a=ch;

        System.out.println("ASCII value of" +ch+ "is" + a);

        obj.close();
    }
}

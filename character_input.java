// input character
import java.util.Scanner;
public class character_input
{
    public static void main(String[] args)
    {
        char ch;
        System.out.println("enter a character:");
        Scanner obj=new Scanner(System.in);
        ch=obj.next().charAt(0); //next() store string value or next() reads the next token (word) entered by the user as a String.
        System.out.println(ch);
        obj.close();
    }

    
}

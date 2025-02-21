import java.util.Scanner;

public class vowel_consonant
{
    public static void main(String[] args)
    {
        char ch;
        System.out.println("enter a character:");
        Scanner obj=new Scanner(System.in);
        ch=obj.next().charAt(0); //syntax to input character

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }

        obj.close();


    }
    
}

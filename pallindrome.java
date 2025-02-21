import java.util.Scanner;

public class pallindrome //if a number is same after reverse then its pallindrome eg. 121
{
    public static void main(String[] args)
    {
        int number,rem,reverse=0,compare_with_reverse;
        System.out.println("enter a number:");//suppose 121
        Scanner obj=new Scanner(System.in);
        number=obj.nextInt();

        compare_with_reverse=number;

        while (number>0) /* 121>0 (true)
                            12>o (true)
                            1>0(true)
                            0>0(false)*/ 

        {
            rem=number%10; /*rem=121%10=1 
                             rem=12%10=2
                             rem=1%10=1*/

            reverse=(reverse*10)+rem; /*reverse=(0*10)+1=1
                                        reverse=(1*10)+2=12 
                                        reverse=(12*10)+1=121*/

            number=number/10; /*number=121/10=12 
                                number=12/10=1
                                number=1/10=0*/

        }

        if (compare_with_reverse==reverse) // 121==121(true)
        {
            System.out.println("number is pallindrome"); //print this
        }
        else
        {
            System.out.println("number is not pallindrome");
        }

        obj.close();
    }

}


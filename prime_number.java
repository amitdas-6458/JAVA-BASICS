import java.util.Scanner;

public class prime_number //the which is divisible by 1 and itself called prime no.
{

    public static void main(String[] args)
    {

        int number,count=0;
        System.out.println("enter a number:"); // number=7
        Scanner obj=new Scanner(System.in);
        number=obj.nextInt();

        for(int i=1;i<=number;i++) /* i=1 , 1<=3  , i++
                                      i=2 , 2<=3  , i++
                                      i=3 , 3<=3  , i++ 
                                      i=4 , 4<=3 (false)*/
        {

            if (number%i==0) /* 3%1==0 (true) 
                                3%*2==0 (false)
                                3%3==0(true) */
            {

                count++; /* count=1 
                            count=2*/
                
            }
        }

        if (count==2) //2==2 (true)
        {

            System.out.println("number is prime number"); //print this
            
        }
        else
        {

            System.out.println("number is not prime number");
        }

        obj.close();
        
    }
    
}

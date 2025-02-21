import java.util.Scanner;

public class perfect_no /* sum of the divisible number which are less than our input number called perfect no.
                           eg.- suppose a no- 6
                           no that are less than 6 = 1,2,3,4,5
                           from those number which are divisible by 6 are = 1,2,3
                           addition of those 3 numbers 1+2+3=6 .
                           so our original no is 6 which is eauals to addition of those 3 numbers so 6 is a perfect number */
{

    public static void main(String[] args)
    {

        int number,sum=0;
        System.out.println("enter a number:"); //number=4
        Scanner obj=new Scanner(System.in);
        number=obj.nextInt();

        for(int i=1;i<number;i++) /* i=1 , 1<=4  
                                      i=2 , 2<=4
                                      i=3 , 3<=4
                                      i=4 , 4<=4 (false)*/
        {

            if (number%i==0) /* 4%1==0 (true) 
                                4%2==0 (true)
                                4%3==0 (true)*/
            {

                sum=sum+i; /* sum =0+1=1
                           sum =1+2=3
                           sum =3+3=6 */
                
            }
        }

        if (sum==number) //6==4 (false)
        {

            System.out.println("number is a perfect number");
            
        }
        else
        {

            System.out.println("it is not a perfect nmber"); //print this
        }

        obj.close();
    }
    
}

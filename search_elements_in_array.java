/* in this program we search an elements in array and see how many times it occur */




import java.util.Scanner;

public class search_elements_in_array
{

    public static void main(String[] args)
    {

        int a[]=new int[5] , search , count=0;
        System.out.println("enter the elements in array: ");
        Scanner obj=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {

            a[i]=obj.nextInt();

        }

        System.out.println("array elemnts array: ");

        for(int i=0;i<a.length;i++)
        {

            System.out.println(a[i]);

        }

        System.out.println("enter search elements: ");
        search=obj.nextInt();

        for(int i=0;i<a.length;i++)
        {

            if(search==a[i])
            {
                count++;
            }

        }

        if (count>0)
            System.out.println("item found " + count + "times");
        else
            System.out.println("item not found "  + count + " times");

            
        

        obj.close();

    }

    
}

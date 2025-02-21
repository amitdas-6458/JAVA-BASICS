import java.util.Scanner;

public class import_elements_in_array
{

    public static void main(String[] args)
    {

        int size_of_array,i;
        System.out.println("enter size of an array:");
        Scanner obj = new Scanner(System.in);
        size_of_array=obj.nextInt();

        int a[]=new int[size_of_array]; /*declaration of an array
                                              size_of_array variable declare inside int[] because to input array size at run time */

        System.out.println("enter the elements of an array:");
                                              
            for(i=0;i<size_of_array;i++)
            {
                a[i]=obj.nextInt(); /* here all the values that user declare is input in array */
            }

            System.out.println("printed array elements:");

            for(i=0;i<size_of_array;i++)
            {
                System.out.println(a[i]);
            }

            obj.close();
        

    }

    
}
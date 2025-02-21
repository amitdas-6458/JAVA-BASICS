import java.util.Arrays;

public class array_class_methods
{
    public static void main(String[] args)
    {

        int a[]={10,20,30,40,50};
        String b[]={"AMIT","ASIT"};
        int c[][]={{10,20},{30,40}};

        System.out.println("toString()" + Arrays.toString(a)); /* it print the integer and string type arrays */

        System.out.println("toString()" + Arrays.toString(b));  

        System.out.println("asList()" + Arrays.asList(a)); /* it only convert the arrays to list then print */

        System.out.println("asList()" + Arrays.asList(b));

        System.out.println("deepToString" + Arrays.deepToString(c)); /* it print the multi dimensional array */


    }

    
    
}

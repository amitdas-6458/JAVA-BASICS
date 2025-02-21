public class non_static_function
{
    void show()
    {
        System.out.println("hello world");
    }

    public static void main(String[] args)
    {
        non_static_function ref = new non_static_function();
        ref.show();
        System.out.println("hey world how are u...??");
    }
    
}

package module4;
 
// Demonstrate the use of final keyword with variables, methods, and classes.

final class Test   
{
    final int x = 10; ;
    final void show()   
    {
        System.out.println("Final method");
    }
}

public class finalkey
{
    public static void main(String args[])
    {
        Test t = new Test();

        System.out.println(t.x);
        t.show();
    }
}


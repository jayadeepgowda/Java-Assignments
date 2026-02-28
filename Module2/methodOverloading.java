// Write a program to demonstrate method overloading by creating multiple methods with the same name but different parameters.

package Module2;

public class methodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        methodOverloading obj = new methodOverloading();
        int res1 = obj.add(5, 10);
        int res2 = obj.add(10, 20, 30);
        System.out.println("Sum of 2 integers: " + res1);
        System.out.println("Sum of 3 intes: " + res2);
    }
}

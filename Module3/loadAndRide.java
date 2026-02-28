//Write a program to demonstrate the difference between method overloading and method overriding.

package Module3;

class Calculator {

    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

class Calculator1 extends Calculator {

    @Override
    int calculate(int a, int b) {
        return a - b;
    }
}

public class loadAndRide {

    public static void main(String[] args) {

        Calculator1 obj = new Calculator1();

        System.out.println("METHOD OVERIDING " + obj.calculate(5, 5));
        System.out.println("METHOD OVERLOADING " + obj.calculate(1, 2, 3));
    }
}

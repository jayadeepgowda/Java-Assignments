package module5;
//Write a program using try-catch-finally to handle division by zero.

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
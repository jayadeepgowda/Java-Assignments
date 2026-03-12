package module4;

 // Write a program to reverse a string using StringBuilder.

public class reverseStr {
    public static void main(String[] args) {
        String str = "Hello";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed String: " + sb);
    }
}

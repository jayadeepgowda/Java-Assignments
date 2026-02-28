//Write a program to print the multiplication table of a given number using a for loop.

import java.util.*;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
        sc.close();
    }
}

//Write a program with a method that calculates the factorial of a number using recursion.

package Module2;

import java.util.*;

public class factorial {
    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N:");
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}

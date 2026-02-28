//Write a program to print a pyramid pattern using nested loops for a given number of rows.

import java.util.*;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
        sc.close();
    }
}

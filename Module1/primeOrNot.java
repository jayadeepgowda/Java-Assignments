// Write a program to check if a number is prime or not.
import java.util.Scanner;

public class primeOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n:");
    int n = sc.nextInt();
    int cnt = 0;
    if (n <= 1)
      System.out.println("is not a prime");
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        cnt++;
      }
    }
    if (cnt == 2)
      System.out.println(n + " is a prime number");
    else
      System.out.println(n + " is not a prime number");

    sc.close();
  }
}

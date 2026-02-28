//Write a program to find the sum of all even numbers between 1 and 100 using a whil 

public class sumOfEven {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (n <= 100) {
            if (n % 2 == 0) {
                sum = sum + n;
            }
            n++;
        }
        System.out.println("SUM OF ALL EVEN NO. BETWEEN 1 TO 100 :" + sum);
    }
}

//Write a program to find the largest of three numbers using if-else statements

public class largestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c)
            System.out.println(a + "is largest");
        else if (b > a && b > c)
            System.out.println(b + "is largest");
        else
            System.out.println(c + "is largest");
    }
}

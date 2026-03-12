package module5;
//Write a program to demonstrate checked and unchecked exceptions with examples

import java.io.*;

public class checkNuncheck {
    public static void main(String[] args) {
        // Checked Exception 
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: " + e);
        }

        // Unchecked Exception 
        try {
            int result = 10 / 0; 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }
    }
}


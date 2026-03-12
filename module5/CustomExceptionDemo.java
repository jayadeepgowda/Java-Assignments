package module5;
//Create a custom exception using throw and throws keywords.

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
       super(message);
    }}

public class CustomExceptionDemo {
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("not eligible to vote");
        } else {
            System.out.println("eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
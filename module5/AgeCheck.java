package module5;
//Write a program that throws an exception if age is less than 18

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeCheck {
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be at least 18");
        } else {
            System.out.println("Age validated: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

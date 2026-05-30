// Q21: Custom Exception
import java.util.Scanner;

public class CustomExceptionExample {

    // Custom exception class
    static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is invalid. Must be 18 or older.");
        }
        System.out.println("Age " + age + " is valid. Access granted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException caught: " + e.getMessage());
        }
        sc.close();
    }
}

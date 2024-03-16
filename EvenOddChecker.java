import java.util.Scanner;

public class EvenOddChecker {

    // Static method to check if a number is even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read user input

        checkEvenOdd(number); // Call the static method with the entered number

        scanner.close(); // Close the scanner
    }
}

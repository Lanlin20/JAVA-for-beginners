import java.util.*;

public class addnum {
    int num1;
    int num2;
    int ans;

    public static void sum(int a, int b) {
        // Remove redeclaration of local variables
        // Assign parameters directly to instance variables
        //ans = a + b;
    }

    public void result() {
        // Print instance variable ans
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello user, enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // Create an instance of addnum class
        //addnum obj = new addnum();
        // Call the static sum method using the instance
        sum(num1, num2);
        // Call the instance method result
        result(ans);
        scan.close();
    }
}

import java.util.*;

public class password {

    public static void passwordVerification(String name) {
        if (name.equals("Joy")) { 
            System.out.println("Access Granted!!");
        }
        else {
            System.out.println("Access Denied!!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello user, enter your password");
        String name = scan.nextLine(); 
        passwordVerification(name);
        scan.close();
    }
}

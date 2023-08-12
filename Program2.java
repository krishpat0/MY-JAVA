
// Check no is prime or not prime
import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number:");
        // int num = sc.nextInt();
        int num = 5;
        boolean checker = false;

        if (num == 2) {
            System.out.println("Prime No");
        }
        if (num > 2) {
            for (int i = 2; i < num - 1; i++) {
                if (num % 2 != 0) {
                    checker = true;
                } else {
                    System.out.println("Not Prime No");
                    break;

                }
            }
            if (checker) {
                System.out.println("Prime No");
            }

        }

    }
}

// Math.sqrt(num)
// n/2
// n-1
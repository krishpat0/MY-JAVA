
/**
 * Program1
 */
import java.util.*;

public class Program1 {

    // function swap
    public static void swapNo(int no1, int no2) {
        // Method 1 using temp variable means 3 variable
        // int temp = 0;
        // temp = no1;
        // no1 = no2;
        // no2 = temp;

        // Method 2 without using 3rd or temp variable
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;

        System.out.println("After Swap " + "No1:" + no1 + " No2:" + no2);

    }

    public static void main(String[] args) {
        System.out.println("Swap Two Number Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No1:");
        int no1 = sc.nextInt();
        System.out.print("Enter No2:");
        int no2 = sc.nextInt();
        swapNo(no1, no2);
    }
}
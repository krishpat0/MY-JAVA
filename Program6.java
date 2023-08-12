// import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        int num = 140;
        int temp = num;
        int sum = 0;

        // loop
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
}

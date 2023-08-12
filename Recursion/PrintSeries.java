package Recursion;

public class PrintSeries {
    // recursion
    static void printN(int num) {
        // base case condition when your loop stop

        if (num > 0) {
            // self calling
            printN(num - 1);
        }
        System.out.println(num);

    }

    public static void main(String[] args) {
        printN(5);

    }
}

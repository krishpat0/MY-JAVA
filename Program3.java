/**
 * Program3 Find Factorial No of X
 * 5! = 5*4*3*2*1=120
 * 0! =1
 */
public class Program3 {
    public static void main(String[] args) {
        // input
        int x = 5;
        int fact = 1;

        // loop
        for (int i = 1; i <= x; i++) {
            fact *= i; // fact=fact*i
        }
        // print answer
        System.out.println(x + "! = " + fact);

    }
}
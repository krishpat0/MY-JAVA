public class MethodOverloading {

    //
    static int largestNumber(int a, int b) {
        return (a > b) ? a : b;
    }

    static long largestNumber(long a, long b, long c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(3, 4));
        System.out.println(largestNumber(19, 5, 9));
    }
}

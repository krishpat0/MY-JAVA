public class Program5 {
    public static void main(String[] args) {
        int num = 45747;
        int rev = 0;
        System.out.println("Original Number:" + num);
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        num = rev;
        System.out.println("Reveres Number:" + num);
    }

}

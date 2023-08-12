public class Program4 {
    public static void main(String[] args) {
        int n = 123456;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            System.out.print(rem + " ");
            n /= 10;
        }
        System.out.println();
        System.out.println("Total No:" + count);
    } 
}

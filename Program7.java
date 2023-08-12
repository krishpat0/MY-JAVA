public class Program7 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int next;

        System.out.print(num1 + "," + num2);

        // loop
        for (int i = 1; i < 5; i++) {
            next = num1 + num2;
            System.out.print("," + next);

            // swap
            num1 = num2;
            num2 = next;
        }
    }
}

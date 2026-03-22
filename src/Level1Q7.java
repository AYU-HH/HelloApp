import java.util.Scanner;

public class Level1Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] factors = new int[100];
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count++] = i;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Factor: " + factors[i]);
        }
        scanner.close();
    }
}
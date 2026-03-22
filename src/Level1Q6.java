import java.util.Scanner;

public class Level1Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input");
        } else {
            int[] evenArray = new int[number / 2 + 1];
            int[] oddArray = new int[number / 2 + 1];
            int evenIdx = 0, oddIdx = 0;

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenArray[evenIdx++] = i;
                } else {
                    oddArray[oddIdx++] = i;
                }
            }

            for (int i = 0; i < evenIdx; i++) System.out.println("Even: " + evenArray[i]);
            for (int i = 0; i < oddIdx; i++) System.out.println("Odd: " + oddArray[i]);
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class Level1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }
            numbers[i] = input;
            total += input;
            count++;
        }

        System.out.println("Total sum: " + total);
        scanner.close();
    }
}
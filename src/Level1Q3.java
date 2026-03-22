import java.util.Scanner;

public class Level1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] table = new int[10];

        int num = scanner.nextInt();

        for (int i = 0; i < table.length; i++) {
            table[i] = num * (i + 1);
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + table[i]);
        }

        scanner.close();
    }
}
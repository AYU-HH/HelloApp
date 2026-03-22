import java.util.Scanner;

public class Level2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
            if (arr[i] > largest) largest = arr[i];
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        scanner.close();
    }
}
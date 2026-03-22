import java.util.Scanner;

public class Level3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int low = 0, high = size - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            }
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        if (result == -1) System.out.println("Element not found");
        else System.out.println("Element found at index: " + result);

        scanner.close();
    }
}
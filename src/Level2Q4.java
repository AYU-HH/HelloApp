import java.util.Scanner;

public class Level2Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] freq = new int[size];
        int visited = -1;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited) freq[i] = count;
        }

        for (int i = 0; i < size; i++) {
            if (freq[i] != visited) {
                System.out.println(arr[i] + " occurs " + freq[i] + " times");
            }
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class Level3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] m1 = new int[r1][c1];
        for(int i=0; i<r1; i++) for(int j=0; j<c1; j++) m1[i][j] = scanner.nextInt();

        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] m2 = new int[r2][c2];
        for(int i=0; i<r2; i++) for(int j=0; j<c2; j++) m2[i][j] = scanner.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication not possible");
        } else {
            int[][] product = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            for (int[] row : product) {
                for (int val : row) System.out.print(val + " ");
                System.out.println();
            }
        }
        scanner.close();
    }
}
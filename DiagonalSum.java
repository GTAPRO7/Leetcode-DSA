import java.util.Arrays;

public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        DiagonalSum solution = new DiagonalSum();

        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.deepToString(mat1));
        System.out.println("Output:   " + solution.diagonalSum(mat1));
        System.out.println("Expected: 25\n");

        int[][] mat2 = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.deepToString(mat2));
        System.out.println("Output:   " + solution.diagonalSum(mat2));
        System.out.println("Expected: 8\n");

        int[][] mat3 = {{5}};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.deepToString(mat3));
        System.out.println("Output:   " + solution.diagonalSum(mat3));
        System.out.println("Expected: 5");
    }
}
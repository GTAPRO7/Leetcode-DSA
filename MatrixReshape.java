import java.util.Arrays;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        for (int k = 0; k < m * n; k++) {
            result[k / c][k % c] = mat[k / n][k % n];
        }

        return result;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
            if (i < matrix.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MatrixReshape solution = new MatrixReshape();

        int[][] mat1 = {{1, 2}, {3, 4}};
        int r1 = 1, c1 = 4;
        System.out.println("Test Case 1 (Valid Reshape 2x2 -> 1x4):");
        System.out.print("Input:    ");
        printMatrix(mat1);
        int[][] res1 = solution.matrixReshape(mat1, r1, c1);
        System.out.print("Output:   ");
        printMatrix(res1);
        System.out.println("Expected: [[1, 2, 3, 4]]\n");

        int[][] mat2 = {{1, 2}, {3, 4}};
        int r2 = 2, c2 = 4;
        System.out.println("Test Case 2 (Invalid Reshape 2x2 -> 2x4):");
        System.out.print("Input:    ");
        printMatrix(mat2);
        int[][] res2 = solution.matrixReshape(mat2, r2, c2);
        System.out.print("Output:   ");
        printMatrix(res2);
        System.out.println("Expected: [[1, 2], [3, 4]]\n");

        int[][] mat3 = {{10, 20, 30, 40}};
        int r3 = 4, c3 = 1;
        System.out.println("Test Case 3 (1x4 -> 4x1 Vector Reshape):");
        System.out.print("Input:    ");
        printMatrix(mat3);
        int[][] res3 = solution.matrixReshape(mat3, r3, c3);
        System.out.print("Output:   ");
        printMatrix(res3);
        System.out.println("Expected: [[10], [20], [30], [40]]");
    }
}
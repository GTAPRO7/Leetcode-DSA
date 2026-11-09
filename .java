import java.util.Arrays;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                if (left == right) {
                    row[left] ^= 1;
                } else {
                    int temp = row[left] ^ 1;
                    row[left] = row[right] ^ 1;
                    row[right] = temp;
                }
                left++;
                right--;
            }
        }

        return image;
    }
}

public class Main {
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
        Solution solution = new Solution();

        int[][] image1 = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        System.out.println("Test Case 1 (3x3 Matrix):");
        System.out.print("Input:    ");
        printMatrix(image1);
        int[][] res1 = solution.flipAndInvertImage(image1);
        System.out.print("Output:   ");
        printMatrix(res1);
        System.out.println("Expected: [[1, 0, 0], [0, 1, 0], [1, 1, 1]]\n");

        int[][] image2 = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 1, 1, 1},
            {1, 0, 1, 0}
        };
        System.out.println("Test Case 2 (4x4 Matrix):");
        System.out.print("Input:    ");
        printMatrix(image2);
        int[][] res2 = solution.flipAndInvertImage(image2);
        System.out.print("Output:   ");
        printMatrix(res2);
        System.out.println("Expected: [[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 0, 1], [1, 0, 1, 0]]");
    }
}
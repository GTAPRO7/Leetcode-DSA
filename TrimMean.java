import java.util.Arrays;

public class TrimMean {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int trim = n / 20;
        double sum = 0;
        int count = 0;

        for (int i = trim; i < n - trim; i++) {
            sum += arr[i];
            count++;
        }

        return sum / count;
    }
    public static void main(String[] args) {
        TrimMean solution = new TrimMean();

        int[] arr1 = {
            1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
            2, 2, 2, 2, 2, 2, 2, 2, 2, 3
        };
        System.out.println("Test Case 1:");
        System.out.println("Input size: " + arr1.length);
        System.out.printf("Output:   %.5f\n", solution.trimMean(arr1));
        System.out.println("Expected: 2.00000\n");

        int[] arr2 = {
            6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 
            5, 0, 5, 5, 0, 8, 7, 6, 8, 0
        };
        System.out.println("Test Case 2:");
        System.out.println("Input size: " + arr2.length);
        System.out.printf("Output:   %.5f\n", solution.trimMean(arr2));
        System.out.println("Expected: 4.00000");
    }
}
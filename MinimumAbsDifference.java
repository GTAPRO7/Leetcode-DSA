import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == minDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return result;
    }
    public static void main(String[] args) {
        MinimumAbsDifference solution = new MinimumAbsDifference();

        int[] arr1 = {4, 2, 1, 3};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(arr1));
        System.out.println("Output:   " + solution.minimumAbsDifference(arr1));
        System.out.println("Expected: [[1, 2], [2, 3], [3, 4]]\n");

        int[] arr2 = {1, 3, 6, 10, 15};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(arr2));
        System.out.println("Output:   " + solution.minimumAbsDifference(arr2));
        System.out.println("Expected: [[1, 3]]\n");

        int[] arr3 = {3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(arr3));
        System.out.println("Output:   " + solution.minimumAbsDifference(arr3));
        System.out.println("Expected: [[-14, -10], [19, 23], [23, 27]]");
    }
}
import java.util.Arrays;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxSoFar = -1;

        for (int i = n - 1; i >= 0; i--) {
            int currentVal = arr[i];
            arr[i] = maxSoFar;
            if (currentVal > maxSoFar) {
                maxSoFar = currentVal;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ReplaceElements solution = new ReplaceElements();

        int[] arr1 = {17, 18, 5, 4, 6, 1};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(arr1));
        int[] res1 = solution.replaceElements(arr1);
        System.out.println("Output:   " + Arrays.toString(res1));
        System.out.println("Expected: [18, 6, 6, 6, 1, -1]\n");

        int[] arr2 = {400};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(arr2));
        int[] res2 = solution.replaceElements(arr2);
        System.out.println("Output:   " + Arrays.toString(res2));
        System.out.println("Expected: [-1]\n");

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 3 (Increasing):");
        System.out.println("Input:    " + Arrays.toString(arr3));
        int[] res3 = solution.replaceElements(arr3);
        System.out.println("Output:   " + Arrays.toString(res3));
        System.out.println("Expected: [5, 5, 5, 5, -1]");
    }
}
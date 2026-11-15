import java.util.Arrays;

public class FindTheDistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distanceValue = 0;

        for (int x : arr1) {
            boolean isFar = true;
            for (int y : arr2) {
                if (Math.abs(x - y) <= d) {
                    isFar = false;
                    break;
                }
            }
            if (isFar) {
                distanceValue++;
            }
        }

        return distanceValue;
    }
    public static void main(String[] args) {
        FindTheDistanceValue solution = new FindTheDistanceValue();

        int[] arr1_1 = {4, 5, 8};
        int[] arr2_1 = {10, 9, 1, 8};
        int d1 = 2;
        System.out.println("Test Case 1:");
        System.out.println("arr1 = " + Arrays.toString(arr1_1));
        System.out.println("arr2 = " + Arrays.toString(arr2_1));
        System.out.println("d = " + d1);
        System.out.println("Output:   " + solution.findTheDistanceValue(arr1_1, arr2_1, d1));
        System.out.println("Expected: 2\n");

        int[] arr1_2 = {1, 4, 2, 3};
        int[] arr2_2 = {-4, -3, 6, 10, 20, 30};
        int d2 = 3;
        System.out.println("Test Case 2:");
        System.out.println("arr1 = " + Arrays.toString(arr1_2));
        System.out.println("arr2 = " + Arrays.toString(arr2_2));
        System.out.println("d = " + d2);
        System.out.println("Output:   " + solution.findTheDistanceValue(arr1_2, arr2_2, d2));
        System.out.println("Expected: 2\n");

        int[] arr1_3 = {2, 1, 100, 3};
        int[] arr2_3 = {-5, -2, 10, -3, 7};
        int d3 = 6;
        System.out.println("Test Case 3:");
        System.out.println("arr1 = " + Arrays.toString(arr1_3));
        System.out.println("arr2 = " + Arrays.toString(arr2_3));
        System.out.println("d = " + d3);
        System.out.println("Output:   " + solution.findTheDistanceValue(arr1_3, arr2_3, d3));
        System.out.println("Expected: 1");
    }
}
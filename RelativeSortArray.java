import java.util.Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        for (int num = 0; num <= 1000; num++) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        return arr1;
    }
    public static void main(String[] args) {
        RelativeSortArray solution = new RelativeSortArray();

        int[] arr1_1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2_1 = {2, 1, 4, 3, 9, 6};
        System.out.println("Test Case 1:");
        System.out.println("arr1:     " + Arrays.toString(arr1_1));
        System.out.println("arr2:     " + Arrays.toString(arr2_1));
        int[] res1 = solution.relativeSortArray(arr1_1.clone(), arr2_1);
        System.out.println("Output:   " + Arrays.toString(res1));
        System.out.println("Expected: [2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19]\n");

        int[] arr1_2 = {28, 6, 22, 8, 44, 17};
        int[] arr2_2 = {22, 28, 8, 6};
        System.out.println("Test Case 2:");
        System.out.println("arr1:     " + Arrays.toString(arr1_2));
        System.out.println("arr2:     " + Arrays.toString(arr2_2));
        int[] res2 = solution.relativeSortArray(arr1_2.clone(), arr2_2);
        System.out.println("Output:   " + Arrays.toString(res2));
        System.out.println("Expected: [22, 28, 8, 6, 17, 44]");
    }
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        Set<Integer> seenCounts = new HashSet<>();
        for (int count : freqMap.values()) {
            if (!seenCounts.add(count)) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        UniqueOccurences solution = new UniqueOccurences();

        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(arr1));
        System.out.println("Output:   " + solution.uniqueOccurrences(arr1));
        System.out.println("Expected: true\n");

        int[] arr2 = {1, 2};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(arr2));
        System.out.println("Output:   " + solution.uniqueOccurrences(arr2));
        System.out.println("Expected: false\n");

        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(arr3));
        System.out.println("Output:   " + solution.uniqueOccurrences(arr3));
        System.out.println("Expected: true");
    }
}
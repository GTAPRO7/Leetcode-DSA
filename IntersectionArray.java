import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {

    Set<Integer> mySet = new HashSet<>();
    Set<Integer> resultSet = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            mySet.add(nums1[i]);
        } 
        for(int j=0; j<nums2.length; j++){
            if(mySet.contains(nums2[j])){
            resultSet.add(nums2[j]); 
            }
        }
        int[] result = new int[resultSet.size()];

        int k = 0;  
        for (int nums3 : resultSet) {
            result[k] = nums3;
            k++;
        }

        return result;
    }
    
    public static void main(String[] args) {

        int[] nums1_a = {1, 2, 2, 1};
        int[] nums2_a = {2, 2};
        int[] output1 = intersection(nums1_a, nums2_a);
        System.out.println("Test 1 Result: " + Arrays.toString(output1));

        int[] nums1_b = {4, 9, 5};
        int[] nums2_b = {9, 4, 9, 8, 4};
        int[] output2 = intersection(nums1_b, nums2_b);
        System.out.println("Test 2 Result: " + Arrays.toString(output2));
    }
}

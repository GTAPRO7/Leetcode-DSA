public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int cur_streak = 0;
        int max_streak = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cur_streak++;
                if (cur_streak > max_streak) {
                    max_streak = cur_streak;
                }
            } else {
                cur_streak = 0;
            }
        }

        return max_streak;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Test 1 Result: " + findMaxConsecutiveOnes(test1)); 

        int[] test2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Test 2 Result: " + findMaxConsecutiveOnes(test2)); 

        int[] test3 = {0, 0, 0};
        System.out.println("Test 3 Result: " + findMaxConsecutiveOnes(test3)); 
    }
}
public class CountLargestGroup {
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = getDigitSum(i);
            count[sum]++;
            if (count[sum] > maxSize) {
                maxSize = count[sum];
            }
        }

        int largestGroups = 0;
        for (int size : count) {
            if (size == maxSize) {
                largestGroups++;
            }
        }

        return largestGroups;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        CountLargestGroup solution = new CountLargestGroup();

        int n1 = 13;
        System.out.println("Test Case 1:");
        System.out.println("Input:    n = " + n1);
        System.out.println("Output:   " + solution.countLargestGroup(n1));
        System.out.println("Expected: 4\n");

        int n2 = 2;
        System.out.println("Test Case 2:");
        System.out.println("Input:    n = " + n2);
        System.out.println("Output:   " + solution.countLargestGroup(n2));
        System.out.println("Expected: 2\n");

        int n3 = 99;
        System.out.println("Test Case 3:");
        System.out.println("Input:    n = " + n3);
        System.out.println("Output:   " + solution.countLargestGroup(n3));
        System.out.println("Expected: 1\n"); 

        int n4 = 10000;
        System.out.println("Test Case 4:");
        System.out.println("Input:    n = " + n4);
        System.out.println("Output:   " + solution.countLargestGroup(n4));
        System.out.println("Expected: 1"); 
    }
}
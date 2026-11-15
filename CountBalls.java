public class CountBalls {
    public int countBalls(int lowLimit, int highLimit) {
        int[] boxCount = new int[47];
        int maxBalls = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = getDigitSum(i);
            boxCount[sum]++;
            if (boxCount[sum] > maxBalls) {
                maxBalls = boxCount[sum];
            }
        }

        return maxBalls;
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
        CountBalls solution = new CountBalls();

        int low1 = 1, high1 = 10;
        System.out.println("Test Case 1:");
        System.out.println("lowLimit = " + low1 + ", highLimit = " + high1);
        System.out.println("Output:   " + solution.countBalls(low1, high1));
        System.out.println("Expected: 2\n");

        int low2 = 5, high2 = 15;
        System.out.println("Test Case 2:");
        System.out.println("lowLimit = " + low2 + ", highLimit = " + high2);
        System.out.println("Output:   " + solution.countBalls(low2, high2));
        System.out.println("Expected: 2\n");

        int low3 = 19, high3 = 28;
        System.out.println("Test Case 3:");
        System.out.println("lowLimit = " + low3 + ", highLimit = " + high3);
        System.out.println("Output:   " + solution.countBalls(low3, high3));
        System.out.println("Expected: 2");
    }
}

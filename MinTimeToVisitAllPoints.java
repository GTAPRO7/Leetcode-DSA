import java.util.Arrays;

public class MinTimeToVisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]);
            int dy = Math.abs(points[i][1] - points[i - 1][1]);
            totalTime += Math.max(dx, dy);
        }

        return totalTime;
    }

    public static void main(String[] args) {
        MinTimeToVisitAllPoints solution = new MinTimeToVisitAllPoints();

        int[][] points1 = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.deepToString(points1));
        System.out.println("Output:   " + solution.minTimeToVisitAllPoints(points1));
        System.out.println("Expected: 7\n");

        int[][] points2 = {{3, 2}, {-2, 2}};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.deepToString(points2));
        System.out.println("Output:   " + solution.minTimeToVisitAllPoints(points2));
        System.out.println("Expected: 5\n");

        int[][] points3 = {{0, 0}};
        System.out.println("Test Case 3 (Single point):");
        System.out.println("Input:    " + Arrays.deepToString(points3));
        System.out.println("Output:   " + solution.minTimeToVisitAllPoints(points3));
        System.out.println("Expected: 0");
    }
}
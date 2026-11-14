import java.util.Arrays;

public class ShortestToChar {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];

        int prev = -n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = i - prev;
        }

        prev = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.min(answer[i], prev - i);
        }

        return answer;
    }
    public static void main(String[] args) {
        ShortestToChar solution = new ShortestToChar();

        String s1 = "loveleetcode";
        char c1 = 'e';
        System.out.println("Test Case 1:");
        System.out.println("Input:    s = \"" + s1 + "\", c = '" + c1 + "'");
        System.out.println("Output:   " + Arrays.toString(solution.shortestToChar(s1, c1)));
        System.out.println("Expected: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]\n");

        String s2 = "aaab";
        char c2 = 'b';
        System.out.println("Test Case 2:");
        System.out.println("Input:    s = \"" + s2 + "\", c = '" + c2 + "'");
        System.out.println("Output:   " + Arrays.toString(solution.shortestToChar(s2, c2)));
        System.out.println("Expected: [3, 2, 1, 0]\n");

        String s3 = "baaa";
        char c3 = 'b';
        System.out.println("Test Case 3:");
        System.out.println("Input:    s = \"" + s3 + "\", c = '" + c3 + "'");
        System.out.println("Output:   " + Arrays.toString(solution.shortestToChar(s3, c3)));
        System.out.println("Expected: [0, 1, 2, 3]");
    }
}
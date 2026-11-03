import java.util.Arrays;

public class NoOfLines {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentWidth = 0;

        for (int i = 0; i < s.length(); i++) {
            int w = widths[s.charAt(i) - 'a'];
            if (currentWidth + w > 100) {
                lines++;
                currentWidth = w;
            } else {
                currentWidth += w;
            }
        }

        return new int[]{lines, currentWidth};
    }
    public static void main(String[] args) {
        NoOfLines solution = new NoOfLines();

        int[] widths1 = new int[26];
        Arrays.fill(widths1, 10);
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int[] res1 = solution.numberOfLines(widths1, s1);
        System.out.println("Test Case 1:");
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output:   " + Arrays.toString(res1));
        System.out.println("Expected: [3, 60]\n");

        int[] widths2 = new int[26];
        Arrays.fill(widths2, 10);
        widths2[0] = 4;
        String s2 = "bbbcccdddaaa";
        int[] res2 = solution.numberOfLines(widths2, s2);
        System.out.println("Test Case 2:");
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output:   " + Arrays.toString(res2));
        System.out.println("Expected: [2, 4]");
    }
}
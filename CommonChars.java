import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {
            int[] charFreq = new int[26];
            for (int i = 0; i < word.length(); i++) {
                charFreq[word.charAt(i) - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) ('a' + i)));
                minFreq[i]--;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        CommonChars solution = new CommonChars();

        String[] words1 = {"bella", "label", "roller"};
        List<String> res1 = solution.commonChars(words1);
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(words1));
        System.out.println("Output:   " + res1);
        System.out.println("Expected: [e, l, l]\n");

        String[] words2 = {"cool", "lock", "cook"};
        List<String> res2 = solution.commonChars(words2);
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(words2));
        System.out.println("Output:   " + res2);
        System.out.println("Expected: [c, o]");
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {
    public String[] findWords(String[] words) {
        int[] rowMap = new int[26];
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        for (int r = 0; r < rows.length; r++) {
            for (int i = 0; i < rows[r].length(); i++) {
                rowMap[rows[r].charAt(i) - 'a'] = r + 1;
            }
        }

        List<String> result = new ArrayList<>();

        for (String word : words) {
            int expectedRow = rowMap[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean sameRow = true;

            for (int i = 1; i < word.length(); i++) {
                int currentRow = rowMap[Character.toLowerCase(word.charAt(i)) - 'a'];
                if (currentRow != expectedRow) {
                    sameRow = false;
                    break;
                }
            }

            if (sameRow) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        FindWords solution = new FindWords();

        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(words1));
        System.out.println("Output:   " + Arrays.toString(solution.findWords(words1)));
        System.out.println("Expected: [Alaska, Dad]\n");

        String[] words2 = {"omk"};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(words2));
        System.out.println("Output:   " + Arrays.toString(solution.findWords(words2)));
        System.out.println("Expected: []\n");

        String[] words3 = {"adsdf", "sfd"};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(words3));
        System.out.println("Output:   " + Arrays.toString(solution.findWords(words3)));
        System.out.println("Expected: [adsdf, sfd]");
    }
}
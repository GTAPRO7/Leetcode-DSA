import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        StringMatching solution = new StringMatching();

        String[] words1 = {"mass", "as", "hero", "superhero"};
        List<String> res1 = solution.stringMatching(words1);
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(words1));
        System.out.println("Output:   " + res1);
        System.out.println("Expected: [as, hero]\n");

        String[] words2 = {"leetcode", "et", "code"};
        List<String> res2 = solution.stringMatching(words2);
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(words2));
        System.out.println("Output:   " + res2);
        System.out.println("Expected: [et, code]\n");

        String[] words3 = {"blue", "green", "bu"};
        List<String> res3 = solution.stringMatching(words3);
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(words3));
        System.out.println("Output:   " + res3);
        System.out.println("Expected: []");
    }
}
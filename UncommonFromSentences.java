import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : s1.split(" ")) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : s2.split(" ")) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        List<String> uncommonWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        return uncommonWords.toArray(new String[0]);
    }
    public static void main(String[] args) {
        UncommonFromSentences solution = new UncommonFromSentences();

        String s1_1 = "this apple is sweet";
        String s2_1 = "this apple is sour";
        System.out.println("Test Case 1:");
        System.out.println("s1: \"" + s1_1 + "\"");
        System.out.println("s2: \"" + s2_1 + "\"");
        System.out.println("Output:   " + Arrays.toString(solution.uncommonFromSentences(s1_1, s2_1)));
        System.out.println("Expected: [sweet, sour] (or any order)\n");

        String s1_2 = "apple apple";
        String s2_2 = "banana";
        System.out.println("Test Case 2:");
        System.out.println("s1: \"" + s1_2 + "\"");
        System.out.println("s2: \"" + s2_2 + "\"");
        System.out.println("Output:   " + Arrays.toString(solution.uncommonFromSentences(s1_2, s2_2)));
        System.out.println("Expected: [banana]\n");

        String s1_3 = "apple banana";
        String s2_3 = "banana apple";
        System.out.println("Test Case 3 (No uncommon words):");
        System.out.println("s1: \"" + s1_3 + "\"");
        System.out.println("s2: \"" + s2_3 + "\"");
        System.out.println("Output:   " + Arrays.toString(solution.uncommonFromSentences(s1_3, s2_3)));
        System.out.println("Expected: []");
    }
}
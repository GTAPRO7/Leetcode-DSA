import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        String sNorm = Normalizer.normalize(s, Normalizer.Form.NFC);
        String tNorm = Normalizer.normalize(t, Normalizer.Form.NFC);

        if (sNorm.length() != tNorm.length()) {
            return false;
        }

        Map<Integer, Integer> counts = new HashMap<>();

        sNorm.codePoints().forEach(cp -> counts.put(cp, counts.getOrDefault(cp, 0) + 1));

        int[] tPoints = tNorm.codePoints().toArray();
        for (int cp : tPoints) {
            int current = counts.getOrDefault(cp, 0);
            if (current == 0) {
                return false; 
            }
            counts.put(cp, current - 1);
        }

        return true;
    }
    public static void main(String[] args) {
        Anagram solution = new Anagram();

        System.out.println("=== Unicode Anagram Test Suite ===\n");

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Test 1 (Standard ASCII):");
        System.out.println("s: \"" + s1 + "\", t: \"" + t1 + "\"");
        System.out.println("Result:   " + solution.isAnagram(s1, t1));
        System.out.println("Expected: true\n");

        String s2 = "caf\u00E9";
        String t2 = "cafe\u0301";
        System.out.println("Test 2 (NFC Normalization - Precomposed vs Combining Accent):");
        System.out.println("s: \"" + s2 + "\" (\\u00E9)");
        System.out.println("t: \"" + t2 + "\" (e + \\u0301)");
        System.out.println("Result:   " + solution.isAnagram(s2, t2));
        System.out.println("Expected: true\n");

        String s3 = "🚀🌟🪐";
        String t3 = "🪐🚀🌟";
        System.out.println("Test 3 (32-bit Code Points / Emojis):");
        System.out.println("s: \"" + s3 + "\", t: \"" + t3 + "\"");
        System.out.println("Result:   " + solution.isAnagram(s3, t3));
        System.out.println("Expected: true\n");

        String s4 = "你好世界";
        String t4 = "你好世界界";
        System.out.println("Test 4 (CJK Characters - Unequal Frequencies):");
        System.out.println("s: \"" + s4 + "\", t: \"" + t4 + "\"");
        System.out.println("Result:   " + solution.isAnagram(s4, t4));
        System.out.println("Expected: false");
    }
}
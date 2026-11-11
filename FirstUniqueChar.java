public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String test1 = "leetcode";
        System.out.println("Test 1 Result: " + firstUniqChar(test1));

        String test2 = "loveleetcode";
        System.out.println("Test 2 Result: " + firstUniqChar(test2));

        String test3 = "aabb";
        System.out.println("Test 3 Result: " + firstUniqChar(test3));
    }
}
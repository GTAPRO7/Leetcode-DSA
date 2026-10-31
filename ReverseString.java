import java.util.Arrays;

public class ReverseString {

    // Your solution method
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Before Test 1: " + Arrays.toString(test1));

        reverseString(test1);

        System.out.println("After Test 1:  " + Arrays.toString(test1));
        System.out.println();

        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("Before Test 2: " + Arrays.toString(test2));

        reverseString(test2);

        System.out.println("After Test 2:  " + Arrays.toString(test2));
    }
} 

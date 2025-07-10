package Strings;

public class c07ReverseWords {
    // Naive -> Push each word in stack, then pop and append to a new string
    // Efficient -> Reverse each word first, then reverse the whole string
    static String reverseWords(String s) {
        int start = 0, end = 0, n = s.length();
        char[] str = s.toCharArray();   //String is converted to character array because strings are immutable, and character array can be modified which is required for reversing the strings
        for (end = 0; end < n; end++) {
            if (str[end] == ' ' || end == n) { //end == n condition is here to check for the last word as there will be no space after that
                reverse(str, start, end-1);
                start = end + 1;
            }
        }
        // reverse(str, start, n - 1); // reversing last word as for loop ends at reaching end of the string

        // Above statement is not required now because if condition checks for the last word as well

        reverse(str, 0, n - 1); // reversing the whole string
        return new String(str);
    }
    static void reverse(char[] arr, int low, int high) {
        while (low < high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        String str = "Welcome to the world";
        System.out.println(reverseWords(str));
    }
}
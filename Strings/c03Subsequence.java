// There are two strings
// Check if one is the subsequence of other
// Subsequence is when the characters of the string are present in the same order
// They do not need to be consecutive
// When they are consecutive, it becomes a substring

package Strings;

public class c03Subsequence {
    // Efficient -> Start with a pointer at start of each string
    // If they match, move both ahead
    // Otherwise move the smaller string's pointer ahead
    // For loop used as one pointer always moves
    // Condition to not go ahead than smaller string in for loop
    // In return, if j == m, that means we covered the whole s2 and it is a subsequence
    // Otherwise, string was not covered, so no subsequence
    static boolean efficient(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int i, j = 0; // pointers for the string
        for(i = 0; i<n && j<m; i++){
            if(s1.charAt(i)==s2.charAt(j))
            j++;
        }
        return (j == m);
    }
}

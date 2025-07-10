package Strings;

import java.util.Arrays;

public class c04Anagram {
    // Naive -> Sort both string and check if they are equal
    static boolean naive(String s1, String s2){
        if(s1.length() == s2.length())
        return false;
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);
        return s1.equals(s2);
    }
    // Efficient -> Use count frequency method (using array)
    // Add one if character is present in s1, subtract 1 if present in s2
    // if there is any value in array with value not equal to 0, return false
    static final int CHAR = 256;
    static boolean efficient(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int count[] = new int[CHAR];
        for(int i = 0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i = 0; i<CHAR; i++){
            if(count[i]!=0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        System.out.println(efficient(s1, s2));
    }
}

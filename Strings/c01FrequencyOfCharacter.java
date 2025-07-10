// Find frequnecy of characters (in a sorted order) in a string of lower case alphabets
package Strings;

public class c01FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int []count = new int[26];
        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(count[i]>0)
            System.out.println("Char: " + (char)(i+'a') + " Count: " + count[i]);
        }
    }
}
// notes in string 01 intro on apple notes
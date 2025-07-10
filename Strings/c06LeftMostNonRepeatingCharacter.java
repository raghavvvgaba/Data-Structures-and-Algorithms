package Strings;
import java.util.*;
public class c06LeftMostNonRepeatingCharacter {
    // Naive -> Two loops, flag variable
    // Compare one character with all, if doesn't repeat, return
    // Better -> Two traversals, using count frequency

    // Efficient -> Initialise an array of size CHAR (named fi)
    // States in array :-
    // -1 -> Element didn't appear
    // i -> Element appeared for the first time (i is index)
    // -2 -> Element appeared again 
    // Run a loop to find minimum index in the array (res = Math.min(res, FI[i]))
    static final int CHAR = 256;
    static int efficient(String str){
        int fi[] = new int[CHAR];
        Arrays.fill(fi, -1);
        for(int i = 0; i<str.length(); i++){
            if(fi[str.charAt(i)] == -1)
            fi[str.charAt(i)] = i;
            else
            fi[str.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<CHAR; i++){
            if(fi[i]>0)
            res = Math.min(res, fi[i]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

package Strings;

public class c05LeftMostRepeatingCharacter {
    // Naive -> Two loops
    // Better -> Count frequency, traverse string from left & return if frequency exceeds 1

    // Efficient -> Create boolean array "visited" with all values false
    // Traverse string from right and update the value if it is visited for the first time for that character
    // If already visited, store the index in result
    // Return result after complete traversal
    static final int CHAR = 256;
    static int efficient(String str){
        boolean visited[] = new boolean[CHAR];
        int res = -1;
        for(int i = str.length()-1; i>=0; i--){
            if(visited[str.charAt(i)])
            res = i;
            else
            visited[str.charAt(i)] = true;
        }
        return res;
    }
}
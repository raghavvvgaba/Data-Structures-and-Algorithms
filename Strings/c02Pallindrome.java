package Strings;

public class c02Pallindrome {
    // Naive -> Reverse the string and compare it
    static boolean naive(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return (str.equals(rev.toString()));
    }

    // Efficient -> Two pointer approach
    // One pointer at start, one at end. 
    // If they are same, keep incrementing and decrementing respectively, otherwise return false. 
    // while finishes, return true. 
    static boolean efficient(String str){
        int start = 0, end = str.length() - 1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "naman", str2 = "nitin", str3 = "structure";
        System.out.println(naive(str1));
        System.out.println(efficient(str2));
        System.out.println(efficient(str3));
    }
}

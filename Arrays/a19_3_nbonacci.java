import java.util.*;

public class a19_3_nbonacci {
    static void printSeries(int n, int m) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i, curr_sum = 0;
        for (i = 1; i < n; i++) {
            arr.add(0);
            curr_sum += arr.get(i - 1);
        }
        arr.add(1);
        curr_sum += arr.get(i - 1);
        for (i = n; i < m; i++) {
            arr.add(curr_sum);
            curr_sum = curr_sum + arr.get(i) - arr.get(i - n);
        }
        System.out.print(arr + " ");
    }
    public static void main(String[] args) {
        printSeries(4,10);
    }
}

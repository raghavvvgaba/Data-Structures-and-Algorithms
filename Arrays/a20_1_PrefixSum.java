// To perform a query (getSum here) in O(1) time, we need to preprocess the array
// This preprocessing is called Prefix Sum
import java.util.*;
public class a20_1_PrefixSum {
    static ArrayList<Integer> Prefix(int arr[]){
        ArrayList<Integer> PrefixSum = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            PrefixSum.add(sum);
        }
        return PrefixSum;
    }
    static int getSum(int arr[], int left, int right){
        ArrayList<Integer> Prefix_Sum = new ArrayList<Integer>();
        int sum = 0;
        Prefix_Sum = Prefix(arr);
        if(left!=0)
            sum = Prefix_Sum.get(right) - Prefix_Sum.get(left - 1);
        else 
            sum = Prefix_Sum.get(right);
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {2,8,3,9,6,5,4};
        ArrayList<Integer> Prefix_sum = new ArrayList<Integer>();
        Prefix_sum = Prefix(arr);
        System.out.println(Prefix_sum);     //print to see the prefix sum 
        System.out.println(getSum(arr, 0, 2));  //getSum results
        System.out.println(getSum(arr, 1, 3));
        System.out.println(getSum(arr, 2, 6));
    }
}

// Find if there is a subarray with a given sum
public class a19_2WindowSlidingSubArray {
    // this solution is for the case where the array elements are non-negative
    // for array elements with negative nos, we use hashing which occupies n space
    static boolean isSubSum(int arr[], int sum) {
    int curr_sum = 0;
    int start = 0;
    for (int end = 0; end < arr.length; end++) {
        curr_sum += arr[end]; 
        //cleaning the window
        while (curr_sum > sum && start <= end) {
            curr_sum -= arr[start];
            start++;
        }
        if (curr_sum == sum) {
            return true;
        }
    }
    return false;
}


    public static void main(String[] args) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        System.out.println(isSubSum(arr, 33));
    }
}

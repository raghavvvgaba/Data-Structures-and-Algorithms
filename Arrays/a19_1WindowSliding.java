public class a19_1WindowSliding {
    // Naive is pretty simple, just use two loops and count till k elements to add
    // the sum

    // Effective solution
    static int maxSum(int arr[], int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max_sum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = (sum + arr[i]) - arr[i - k];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, -5, 20, 7 };
        int k = 3;
        System.out.println(maxSum(arr, k));
    }
}

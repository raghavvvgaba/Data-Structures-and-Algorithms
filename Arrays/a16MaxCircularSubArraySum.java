public class a16MaxCircularSubArraySum {
    static int Kadane(int arr[]){
        int res = arr[0], prevSum = arr[0], sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], arr[i]+prevSum);
            res = Math.max(sum, res);
            prevSum = sum;
        }
        return res;
    }
    static int CircularMax(int arr[]){
        int max_normal = Kadane(arr);
        if(max_normal>0)
        return max_normal;
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum+=arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + Kadane(arr);
        return Math.max(max_normal, max_circular);
    }
    public static void main(String[] args) {
        int arr[] = {10,5,-5};
        System.out.println(CircularMax(arr));
    }
}

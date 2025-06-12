public class a20_2_EquilibriumPoint {
    static boolean isEqPoint(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int left_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(left_sum == sum-arr[i])
                return true;
            left_sum = left_sum + arr[i];
            sum = sum - arr[i];
        }
        return false;
    }
}

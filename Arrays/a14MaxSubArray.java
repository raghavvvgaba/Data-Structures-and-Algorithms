public class a14MaxSubArray {
    // Naive solution 
    static int maxNaive(int arr[]){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr += arr[j];
                res = Math.max(curr, res);
            }
        }
        return res;
    }
    
    //Effective solution
    static int max(int arr[]){
        int res = arr[0], prevSum, sum = 0;
        prevSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(prevSum + arr[i], arr[i]);
            res = Math.max(sum, res);
            prevSum = sum;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-5,1,-2,3,-1,2,-2};
        int arr2[] = {2,3,-8,7,-1,2,3};
        int arr3[] = {5,8,3};
        int arr4[] = {-6,-1,-8};
        System.out.println(max(arr));
        System.out.println(max(arr2));
        System.out.println(max(arr3));
        System.out.println(max(arr4));
    }
}

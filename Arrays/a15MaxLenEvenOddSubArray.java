public class a15MaxLenEvenOddSubArray {
    static int max(int arr[]){
        int curr = 1, res = 1;
        for (int i = 1; i < arr.length; i++) {
            if((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0 && arr[i-1]%2==0)){
                curr +=1;
                res = Math.max(res, curr);
            }
            else 
            curr = 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,14,7,8};
        int arr2[] = {10,12,8};
        System.out.println(max(arr));
        System.out.println(max(arr2));
    }
}

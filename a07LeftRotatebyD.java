public class a07LeftRotatebyD {

    //Naive solution -> Rotate array by 1, d times

    // Second Better solution
    // static void rotate(int []arr, int d){
    //     int []temp = new int[d];
    //     int c = 0;
    //     for (int i = 0; i < d; i++) {
    //         temp[i] = arr[i];
    //     }
    //     for (int i = d; i < arr.length; i++) {
    //         arr[i-d] = arr[i];
    //     }
    //     for (int i = arr.length - d; i < arr.length; i++) {
    //         arr[i] = temp[c++];
    //     }
    // }

    //Reversal Algorithm (best solution)
    static void reverse(int []arr, int low,int high){
        int temp;
        while(low<=high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp; 
        }
    }
    static void leftRotate(int arr[], int d){
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    } 
    public static void main(String[] args) {
        int []arr = {10,5,30,15};
        leftRotate(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

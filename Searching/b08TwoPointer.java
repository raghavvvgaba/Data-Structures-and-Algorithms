// Find pair in array with sum = x
// [3,5,9,2,8,10,11]
// x = 17
// Output -> Yes (as pair is 9,8)
package Searching;

public class b08TwoPointer {
    static boolean pair(int arr[], int x) {
        int n = arr.length;
        int low = 0, high = n - 1, sum = 0;
        while (low <= high) {
            sum = arr[low] + arr[high];
            if (sum == x)
                return true;
            else {
                if (sum > x)
                    --high;
                else
                    ++low;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,9,2,8,10,11};
        int arr2[] = {8,4,6};
        System.out.println(pair(arr, 17));
        System.out.println(pair(arr2, 11));
    }
}

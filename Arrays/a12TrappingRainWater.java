public class a12TrappingRainWater {
    // Naive O(n^2)
    static int getWater(int arr[]) {
        int n = arr.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) { // 1 to n-1 because no water can be stored in corner
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }
            res = Math.min(lmax, rmax) - arr[i];
        }
        return res;
    }

    // Efficient tc = O(n), sc = O(n)
    static int getWater2(int arr[], int n) {
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++)
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        for (int i = n - 2; i >= 0; i--)
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        for (int i = 1; i < n - 1; i++)
            res = Math.min(lmax[i], rmax[i]) - arr[i];
        return res;
    }

    // More efficient (from GPT) tc = O(n), sc = O(1)
    static int getWater3(int[] arr, int n) {
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax)
                    leftMax = arr[left];
                else
                    res += leftMax - arr[left];
                left++;
            } else {
                if (arr[right] >= rightMax)
                    rightMax = arr[right];
                else
                    res += rightMax - arr[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 2, 5 };
        int n = arr.length;
        System.out.println(getWater3(arr, n));
    }

}

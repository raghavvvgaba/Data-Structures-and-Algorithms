package Searching;

public class b05SearchinInfiniteArray {
    static int binarySearch(int arr[], int x, int low, int high) {
        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int searchNaive(int arr[], int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x)
                return i;
            if (arr[i] > x)
                return -1;
        }
    }

    static int searchEfficient(int arr[], int x) {
        if (arr[0] == x)
            return 0;
        int i = 1;
        int n = arr.length;

        // Expand range with bounds check
        while (i < n && arr[i] < x)   // <----
            i = i * 2;

        int high = Math.min(i, n - 1);  // <---- Doing this here because we don't have unlimited array
        return binarySearch(arr, x, i / 2 + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = {
                32, 39, 45, 49, 51, 58, 71, 71, 87, 111, 112, 114, 117, 130, 133, 145, 155, 187, 191, 191,
                194, 196, 205, 206, 212, 219, 230, 243, 247, 255, 261, 273, 295, 299, 303, 311, 314, 325, 353, 381,
                403, 408, 421, 430, 440, 447, 464, 466, 466, 468, 469, 496, 497, 524, 541, 552, 559, 570, 570, 581,
                582, 593, 603, 623, 632, 644, 645, 652, 660, 673, 679, 696, 705, 709, 716, 722, 730, 750, 753, 758,
                791, 798, 799, 800, 802, 806, 812, 814, 836, 851, 863, 892, 899, 914, 918, 932, 954, 990, 996, 1000
        };
        System.out.println(searchEfficient(arr, 709));
    }
}

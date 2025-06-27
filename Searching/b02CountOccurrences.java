package Searching;

public class b02CountOccurrences {
    static int firstOccurrence(int arr[], int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] > x)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid] != arr[mid - 1])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    static int lastOccurrence(int arr[], int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    static int countOccurrences(int arr[], int x) {
        int first = firstOccurrence(arr, x);
        if (first == -1)
            return 0;
        else
            return lastOccurrence(arr, x) - first + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 40, 40 };
        int x = 20;
        System.out.println(countOccurrences(arr, x));
    }
}

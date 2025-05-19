class Insertion {
    static void insert(int arr[], int n, int element, int pos) {
        for (int i = n - 1; i > pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = element;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = 5;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int element = 99;
        int pos = 3;

        System.out.println("Before insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
        insert(arr, n, element, pos);
        n++; 

        System.out.println("\nAfter insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
class Deletion {
    static void delete(int arr[], int element, int n){
        int i;
        for(i = 0; i<n; i++){
            if(arr[i] == element)
            break;
        }
        if(i==n){
            System.out.println("Element not found");
            return;
        }
        for(int j = i; j<n-1;j++){
            arr[j] = arr[j+1];
        }
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Before deletion");
        for(int i = 0; i<n; i++ ){
            System.out.print(arr[i]+",");
        }
        delete(arr, 30, n);
        --n;
        System.out.println("\nAfter deletion");
        for(int i = 0; i<n; i++ ){
            System.out.print(arr[i]+",");
        }

    }
}

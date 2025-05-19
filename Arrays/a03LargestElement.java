class a03LargestElement {
    static int largest(int arr[]){
        int i, lar = 0, n=arr.length;
        for(i=0; i<n; i++){ 
            if(arr[i]>lar)
            lar = arr[i];
        }
        return lar;
    }
    public static void main(String[] args) {
        int []arr = {12,234,6254,7564,24,673};
        System.out.println(largest(arr)); 
    }

}

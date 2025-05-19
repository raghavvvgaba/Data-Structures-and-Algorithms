public class a04SecondLargest {
    static int secondLargest(int arr[]){
        int largest = 0, res = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i]<arr[largest]){
                if(arr[i]>arr[res] || res==-1)
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {12,234,6254,7564,24,673};
        System.out.println(arr[secondLargest(arr)]); 
    }
}

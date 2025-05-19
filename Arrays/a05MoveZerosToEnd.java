public class a05MoveZerosToEnd {
    static void movezeros(int arr[]){
        int count = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
            else {
                
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 0, 0, 0, 5, 6, 0, 10, 9, 0 };
        movezeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
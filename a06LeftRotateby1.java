public class a06LeftRotateby1 {
    static void rotate(int []arr){
        int temp;
        temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class a17MajorityElement {
    static int majority(int arr[]){
        int res = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[res] == arr[i])
            count++;
            else
            count--;
            if(count == 0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[res])
            count++;
        }
        if(count > (arr.length/2))
        return res;
        else 
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,4,8,8};
        System.out.println(majority(arr));
    }
}

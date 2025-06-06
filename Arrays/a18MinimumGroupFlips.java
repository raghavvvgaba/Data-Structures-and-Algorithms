public class a18MinimumGroupFlips {
    static void printGroups(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0])
                System.out.print("From " + i + "to ");
                else
                System.out.println(i-1);
            }
        }
        if(arr[n-1]!=arr[0])
        System.out.println(n-1);
    }
}

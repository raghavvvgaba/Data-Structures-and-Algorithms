class a08Leaders {  
    //Naive Solution
    // void leader(int []arr){
    //     int n = arr.length;
    //     for(int i=0;i<n; i++){
    //         boolean flag = false;
    //         for(int j=i+1;j<n;i++){
    //             if(arr[i]<=arr[j]){
    //                 flag = true;
    //                 break;
    //             }
    //         }
    //         if(flag = false){
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }
    static void leader(int []arr){
        int n = arr.length;
        int current_leader = arr[n-1];
        System.out.print(current_leader);
        for(int i = n-2; i>0;i--){
            if(arr[i]>current_leader){
                current_leader = arr[i];
                System.out.print("," + current_leader);
            }
        }
    }
    public static void main(String[] args){
        int []arr = {7,10,4,10,6,5,2};
        leader(arr);
    }
}
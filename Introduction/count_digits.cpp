//geeksforgeeks Count digits
#include <iostream>
#include <algorithm>
using namespace std;
int evenlyDivides(int N){
        int num = N, r, c=0, digits = 0, i=0;
        while(num!=0){
            r=num%10;
            ++digits;
            num = num / 10;
        }
        int arr[digits+1];
        num = N;
        while(num!=0){
            r=num%10;
            arr[i++] = r;
            num = num / 10;
        }
        sort(arr, arr+digits);
        arr[digits+1] = arr[digits];
        for(i=0;i<digits;i++){
            if(arr[i]==arr[i+1]||arr[i] == 0)
                continue;
            else{
            if(N % arr[i] == 0)
                ++c;
                }
        }
        return c;
}
int main(){
    cout << evenlyDivides(123);
}
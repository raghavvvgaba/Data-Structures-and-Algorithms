//swap two alternate numbers in an array

#include <iostream>
#include <array>
using namespace std;
int main(){
    int size,temp;
    array<int,6> arr = {1,2,3,4,5,6};
    size = arr.size();
    for(int i=0;i<size;i=i+2){
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    for(int i=0;i<size;i++){
        cout << arr[i] << " ";
    }
    return 0;
}
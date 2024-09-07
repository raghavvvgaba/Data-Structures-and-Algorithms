// Online C++ compiler to run C++ program online
#include <iostream>
#include <vector>
using namespace std;
int deleteElement(vector<int>&a,int position){
    for(int i = position; i<a.size() - 1;i++){
        a[i] = a[i+1];
    }
    return 0;
}

int main() {
    vector<int>arr{10,20,20,30,30,30,30,40,50,50};
    int n = arr.size();
    for(int i = 0; i<n-1;i++){
        if(arr[i]==arr[i+1]){
            deleteElement(arr, i+1);
            --n;
        }
    }
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    return 0;
}
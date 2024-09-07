#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<int>arr{0,1,1,0,0,1,1,0};
    int i = 0, j = arr.size() - 1;
    while(i<=j){
        if(arr[i]==0)
        ++i;
        if(arr[j]==1)
        --j;
        if(arr[i] == 1 && arr[j] == 0 && i<=j){
            swap(arr[i], arr[j]);
            ++i;
            --j;
        }
    }
    for(int x=0; x<arr.size(); x++){
        cout << arr[x] <<" ";
    }
    return 0;
}
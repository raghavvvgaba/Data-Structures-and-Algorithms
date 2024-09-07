#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<int>arr{10,5,7,30};
    int i = 0, j = arr.size()-1;
    while(i<=j){
        swap(arr[i],arr[j]);
        i++;
        j--;
    }
    for(int a = 0; a<arr.size();a++){
        cout << arr[a] << " ";
    }
    return 0;
}
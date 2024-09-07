#include <iostream>
#include <vector>
using namespace std;
int main(){
    int arr[5] = {10,5,5,5,2};
    vector<int>ans;
    int size = 5, a = 0, K = 12, c = 0;
    for (int i = 0; i < size; i++) { if(c!=0) break;
    for (int j = i + 1; j < size; j++) { if(c!=0) break;
      for (int k = j + 1; k < size; k++) {
        if (arr[i] + arr[j] + arr[k] == K && arr[i] != arr[j] != arr[k]) {
          ans.push_back(arr[i]);
          ans.push_back(arr[j]);
          ans.push_back(arr[k]);
          ++c;
        }
      }
    }
  }
    for (int i = 0; i < ans.size(); i++){
        cout << ans[i] <<" ";
    }
}
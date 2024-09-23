#include <iostream>
#include <vector>
using namespace std;
int removeDuplicates(vector<int>& nums) {
        vector<int>a;
         a.push_back(nums[0]);
        int k=0;
        for(int i = 0; i<nums.size();i++){
            if(a[k]!=nums[i]){
                a.push_back(nums[i]);
                ++k;
            }
        }
        cout << k+1 << endl;
        for(int i =0; i<nums.size();i++){
            cout << a[i] << " ";
        }
        return 0;
    }

int main() {
    vector<int>arr{10,20,20,30,30,30,30,40,50,50,60,60,70,80};
    removeDuplicates(arr);
    return 0;
}
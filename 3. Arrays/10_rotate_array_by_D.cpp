// https://leetcode.com/problems/rotate-array/description/
#include <vector>
#include <iostream>
using namespace std;
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k = k % nums.size(); //normalising k so it stays in   range
        //reversing the whole array
        int i = 0,j = nums.size()-1;
        while(i<=j){
            swap(nums[i],nums[j]);
            i++;
            j--;
        }
        i = 0;
        j = k-1;
        while(i<=j){
            swap(nums[i],nums[j]);
            i++;
            j--;
        }
        i = k;
        j = nums.size()-1;
        while(i<=j){
            swap(nums[i],nums[j]);
            i++;
            j--;
        }
    }
};
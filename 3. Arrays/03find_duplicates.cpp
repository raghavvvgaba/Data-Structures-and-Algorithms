//https://www.naukri.com/code360/problems/duplicate-in-array_893397?source=youtube&campaign=love_babbar_codestudio1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio1&leftPanelTabValue=SUBMISSION
#include <iostream>
using namespace std;
int findDuplicate(vector<int> &arr) 
{
    int ans = 0, i;
    for(i = 0; i<arr.size(); i ++){
        ans = ans^arr[i];
    }
	for(i = 1; i<arr.size(); i ++){
        ans = ans^i;
    }
    return ans;
}

int main(){
    
    return 0;
}
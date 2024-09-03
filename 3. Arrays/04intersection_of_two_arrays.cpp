//https://www.naukri.com/code360/problems/intersection-of-2-arrays_1082149?source=youtube&campaign=love_babbar_codestudio1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio1&leftPanelTabValue=SUBMISSION
#include <bits/stdc++.h> 
vector<int> findArrayIntersection(vector<int> &arr1, int n, vector<int> &arr2, int m)
{
//  Brute force
// 	vector<int>ans;
// 	int min = 0;
// 	for(int i=0;i<n;i++){
		
// 		for(int j = min; j<m; j++){
// 			if(arr1[i]==arr2[j])
// 			{
// 				min = j+1;
// 				ans.push_back(arr2[j]);
// 				break;
// 			}
// 		}
		
// 	}
// 	return ans;
// }

// Optimised
	vector<int>ans;
	int i = 0, j = 0;
        while (i < n && j < m) {
          if (arr1[i] == arr2[j]){
            ans.push_back(arr2[j]);
            i++;
            j++;
          }
          else if (arr1[i] < arr2[j])
            i++;
          else
            j++;
        }
        return ans;
}
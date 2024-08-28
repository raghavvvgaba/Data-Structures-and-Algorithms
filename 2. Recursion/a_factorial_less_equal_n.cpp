//Geeksforgeeks 
//Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

// Examples:
// Input: n = 3
// Output: 1 2
// Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.

// https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1

#include <iostream>
#include <vector>

using namespace std;

vector<long long> factorialNumbers(long long n) {
        vector<long long> ans;
        long long int fact = 1;
        int x = 2;

        // Iterating until factorial is less than or equal to N.
        while (fact <= n) {
            // Adding factorial to the answer list.
            ans.push_back(fact);

            // Calculating next factorial by multiplying with next number.
            fact = fact * x;
            x++;
        }
        // Returning the list of factorial numbers.
        return ans;
    }
int main(){
    vector<long long> a = factorialNumbers(6);
    for(int num: a){
        cout << num << " ";
    }
    return 0;
}
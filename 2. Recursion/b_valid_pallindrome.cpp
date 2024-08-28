//Leetcode
//https://leetcode.com/problems/valid-palindrome/

#include <iostream>

using namespace std;

 bool isPalindrome(string s) { 
        int len, i = 0;; 
        char ch;
        string str;
        len = s.length();
        while(s!=" "){
            ch = s[i];
            str[--len] = ch;
            i++;
        }
        cout << str << endl;
        return true;
    }

int main(){
    string s;

    s = isPalindrome("Raghav");

    return 0;
}
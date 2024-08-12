//LeetCode -> 7 Reverse Integer
#include <iostream>
using namespace std;
    int reverse(int x) {
        int r, rev = 0;
        if(x<0){
            rev = rev * -1; 
        }
        while(x!=0){
            r=x%10;
            rev = rev + r;
        }
        if(x<0){
            rev = rev * -1; 
        }
    return rev;   
    }
int main(){
    cout << "I am running";
    cout << reverse(123) << endl;
}
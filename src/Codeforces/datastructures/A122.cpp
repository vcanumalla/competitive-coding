#include<bits/stdc++.h>
using namespace std;
int main() {
    vector<int> arr{4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774};
    int a; cin >>a;
    bool k = false;
    for (int i = 0; i < arr.size(); i++) {
        if (a % arr[i] == 0) {
            cout << "YES" << endl;
            k = true;
            break;
        }
        
    }
    if (!k) {
        cout << "NO" << endl;
    }
}
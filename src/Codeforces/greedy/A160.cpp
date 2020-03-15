#include<bits/stdc++.h>
using namespace std;
int main() {
    int n; cin >> n;
    vector<int> coins;
    for (int i = 0; i < n; i++) {
        int a; cin >>a;
        coins.push_back(a);
    }
    int min = 0;
    int count = 0;
    sort(coins.begin(), coins.end());
    bool k = false;
    while (!k) {
        int b = accumulate(coins.begin(), coins.end(), 0);
        if (min <= b) {
            int max = coins[coins.size() - 1];
            min += max;
            coins.pop_back();
            count++;
        }
        else {
            
            k = true;
        }


    }
    cout << count;
}
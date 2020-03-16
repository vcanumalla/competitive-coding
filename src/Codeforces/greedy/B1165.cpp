#include<bits/stdc++.h>
using namespace std;

int main() {
    int n; cin >> n;
    vector<int> nums(n);
    for (int i = 0; i < n; i++) {
        int b; cin >> b;
        nums[i] =b;
    }
    sort(nums.begin(), nums.end());
    int count = 1;
    for (long long num: nums) {
        if (num >= count) ++count;
    }
    cout << count - 1 << endl;
}
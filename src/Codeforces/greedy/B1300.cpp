#include <bits/stdc++.h>
using namespace std;
int main() {
    int t; cin >> t;
    for (int i = 0; i < t; i++) {
        int n; cin>> n;
        vector<int> first;
        vector<int> second;
        vector<int> nums;
        for (int k = 0; k < 2 *n; k++) {
            int a; cin >>a;
            nums.push_back(a);
        }
        sort(nums.begin(), nums.end());
        if (n %2 == 1) {
            for (int j = 0; j < 2 *n ; j+=2) {
                int a, b; 
                a = nums[j];
                b = nums[j+1];
                first.push_back(a);
                second.push_back(b);

            }
            sort(first.begin(), first.end());
            sort(second.begin(), second.end());
            int med1 = first[n/2];
            int med2 = second[n/2];
            cout << abs(med2 - med1) << "\n";
        }
        else {
            for (int j = 0; j < nums.size(); j+=2) {
                first.push_back(nums[j]);
            }
            first.push_back(nums[nums.size() - 1]);
            for (int j = 1; j < nums.size() - 1; j+=2) {
                second.push_back(nums[j]);
            }
            int med1 = first[first.size()/2];
            int med2 = second[second.size()/2];
            cout << abs(med2 - med1) << "\n";
            
        }
    }
}
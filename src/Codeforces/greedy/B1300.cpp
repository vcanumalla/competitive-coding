#include <bits/stdc++.h>
using namespace std;
int main() {
    int t; cin >> t;
    for (int i = 0; i < t; i++) {
        int n; cin>> n;
        set<int> first;
        set<int> second;
        vector<int> nums;
        for (int k = 0; k < 2 *n; k++) {
            int a; cin >>a;
            nums.push_back(a);
        }
        sort(nums.begin(), nums.end());
        if (n %2 == 1) {
            sort(nums.begin(), nums.end());    
            for (int j = 0; j < n; j++) {
                int a, b; 

                first.insert(a);
                second.insert(b);

            }
            sort(first.begin(), first.end());
            sort(second.begin(), second.end());
            for (int k = 0; k < n; k++) {
                cout << first[k] << " ";
            }
            cout << "\n";
            for (int k = 0; k < n; k++) {
                cout << second[k] << " ";
            }
            cout << "\n";
            int med1 = first[n/2];
            int med2 = second[n/2];
            cout << "MED: " << med1 << " " << med2 << "\n";
            cout << abs(med2 - med1) << "\n";
        }
        else {
            for (int j = 0; j < n -1; j++) {
                int a, b; cin >> a >> b;

                first.push_back(a);
                second.push_back(b);
            }
            int a,b; cin >> a >> b;
            first.push_back(a);
            first.push_back(b);
            int med1 = first[n/2];
            int med2 = second[n/2];
            cout << abs(med2 - med1);
        }
    }
}
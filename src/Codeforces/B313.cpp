#include<string>
#include<iostream>
using namespace std;
int main() {
    string s; cin >> s;
    int t; cin >> t;
    for (int i = 0; i  < t; i++ ) {
        int a, b; cin >> a >> b;
        int count = 0; 
        for (int j = a-1; j < b-1; j++) {
            char c1 = s.at(j);
            char c2 = s.at(j);
            if (c1 == c2) {
                count++;
            }
        }
        cout << count << endl;
    }
}
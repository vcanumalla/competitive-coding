#include<bits/stdc++.h>
using namespace std;
void setIO(string s) {
    freopen((s + ".in").c_str(), "r", stdin);
    freopen((s + ".out").c_str(), "w", stdout);
}

int main() {
    setIO("lostcow");
    ios::sync_with_stdio(0); cin.tie(0);
    int x, y; cin >> x >> y;

    int n = 1;
    bool sign = true;
    bool found = false;
    int sum = 0;
    int c = x;
    while (!found) {
       int p;

       if (sign) {
           p = x + n;
           sign = false;
       }
       else {
           sign = true;
           p = x - n;
       }
    //    cout << "position:" << p << endl;
       if (p >= y && y > x) {
           sum += abs(y - c);
           break;
       }
       else if (p <= y && y < x) {
           sum+= abs(y - c);
           break;
       }
       else {
           if (!sign) {
            //    cout << "case 3 " << c << " " << p << "    ";
               sum += abs (p - c);
               c =p; 
           }
           else {
                // cout << "case 4 ";

               sum += abs(p - c);
               c = p;

           }
       }
       n *= 2;
    //    cout << "sum: " << sum << endl;
    }
    cout << sum << endl;
    return 0;
}
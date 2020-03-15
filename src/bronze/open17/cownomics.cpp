#include<bits/stdc++.h>
#include<string>
#include<set>
#include<iostream>
using namespace std;
void setIO(string s) {
    freopen((s + ".in").c_str(), "r", stdin);
    freopen((s + ".out").c_str(), "w", stdout);
}

int main() {
    setIO("cownomics");
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<set<char> > spotted(m);
    vector<set<char> > plain(m);
    for (int i = 0; i <n; i++) {
        string s; cin >> s;
        for (int j = 0; j < m; j++) {
            spotted[j].insert(s.at(j));
        }
    }
    for (int i = 0; i <n; i++) {
        string s; cin >> s;
        for (int j = 0; j < m; j++) {
            plain[j].insert(s.at(j));
        }
    }
    int count = 0;
    for (int j = 0; j < m; j++) {
        bool bah = true;
        set<char> letters = {'A', 'C', 'G', 'T'};
        for (char c: letters) {
            if (spotted[j].count(c)) {
                if (plain[j].count(c) ==1) {
                    bah = false;
                    break;
                }

                
            }

        }
        if (bah)  {
            count++;
        }
    }
    cout << count << endl;
    return 0;
}














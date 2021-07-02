#include <bits/stdc++.h>
using namespace std;
 
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  int t;
  long long x, k;

  cin >> t;
  while (t--) {
    cin >> x >> k;
    set<int> set;
    while (x > 0) {
      int exp = 0;
      while (pow(k, exp) <= x) exp ++;
      if (pow(k, exp) > x) exp --;
      if (set.count(exp)) break;
      set.insert(exp);
      long long val = 1;
      for (int i = 0; i < exp; i ++) val *= k;
      x -= val;
    }
    cout << (x == 0 ? "YES\n" : "NO\n");
  }
  return 0;
}

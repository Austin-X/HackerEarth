#include <bits/stdc++.h>
using namespace std;
 
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  int t, prev;
  long long x, k;

  cin >> t;
  while (t--) {
    prev = -1;
    cin >> x >> k;
    while (x) {
      int exp = 0;
      while (pow(k, exp) <= x) exp ++;
      if (pow(k, exp) > x) exp --;
      if (exp == prev) break;
      prev = exp;
      long long val = 1;
      for (int i = 0; i < exp; i ++) val *= k;
      x -= val;
    }
    cout << (x == 0 ? "YES\n" : "NO\n");
  }
  return 0;
}

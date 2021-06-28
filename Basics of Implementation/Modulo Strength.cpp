#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int n, k, x;
  long long ans = 0;
  cin >> n >> k;
  int mod[k];
  fill(mod, mod + k, 0);
  for (int i = 0; i < n; i ++) {
    cin >> x;
    mod[x % k] ++;
  }
  
  for (int i = 0; i < k; i ++) ans += (long long) mod[i] * (mod[i] - 1);
  cout << ans;
  return 0;
}

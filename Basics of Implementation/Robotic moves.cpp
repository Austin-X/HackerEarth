#include <bits/stdc++.h>
using namespace std;
 
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  int t, n;
  cin >> t;
  while (t--) {
    cin >> n;
    cout << (long long)n * (n + 1) << "\n";
  }
  return 0;
}

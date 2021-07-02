#include <bits/stdc++.h>
using namespace std;
 
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  long long t, n, k;
  cin >> t;

  while (t--) {
    cin >> n >> k;
    unordered_map <long long, int> map; unordered_map <long long, int> map2;
    while (map.count(n) != 1 && k != 0) {
      map.emplace(n, map.size());
      map2.emplace(map2.size(), n);
      int temp = 0;
      while (n > 0) { temp += n % 10; n /= 10; }
      n = temp * temp * temp;
      k--;
    }

    if (k == 0) cout << n << "\n";
    else {
      int idx = map[n], pos = idx + k % (map.size() - idx);
      cout << map2[pos] << "\n";
    }
  }
  return 0;
}

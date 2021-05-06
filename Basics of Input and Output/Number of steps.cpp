#include <iostream>
 
using namespace std;
 
int main() {
  int n;
  cin >> n;
  int a[n], b[n];
  for (int i = 0; i < n; i ++) cin >> a[i];
  for (int i = 0; i < n; i ++) cin >> b[i];

  int sum[5001] = {0}, freq[5001] = {0};
  
  for (int i = 0; i < n; i ++) {
    int cnt = 0;
      for (int j = a[i]; j >= 0; j -= b[i]) { 
      freq[j] ++;
      sum[j] += cnt;
      cnt ++;
      if (b[i] == 0) break;
    }
  }

  int ans = -1;
  for (int i = 0; i <= 5000; i ++) {
    if (freq[i] == n) if (sum[i] < ans || ans == -1) ans = sum[i];
  }
 
  cout << ans;
  return 0;
}

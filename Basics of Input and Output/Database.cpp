#include <iostream>
#include <algorithm>
using namespace std;

void print(int m, int maxLen[]) {
  cout << "+";
  for (int i = 0; i < m; i ++) {
    for (int j = 0; j < maxLen[i] + 2; j ++) cout << "-";
    cout << "+";
  }
  cout << "\n";
}

void print2(int m, int maxLen[], string arr[]) {
  for (int i = 0; i < m; i ++) {
			std::string::const_iterator it = arr[i].begin();
      while (it != arr[i].end() && std::isdigit(*it)) ++it;
      

			if (it == arr[i].end()) {
			  cout << "|";
				for (int j = 0; j < maxLen[i] - arr[i].length() + 1; j ++) cout << " ";
				cout << (arr[i] + " ");
			} else {
				cout << "| " + arr[i];
				for (int j = 0; j < maxLen[i] - arr[i].length() + 1; j ++) cout << " ";
			}
		}
		cout << "|\n";
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  
  int T;
  cin >> T;

  for (int t = 0; t < T; t ++) {
    int m, n;
    cin >> m >> n;
    int maxLen[m];
    string attributes[m];
    for (int i = 0; i < m; i ++) {
      cin >> attributes[i];
      maxLen[i] = attributes[i].size();
    }

    string arr[n][m];
    for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
        cin >> arr[i][j];
        int val = arr[i][j].size();
        maxLen[j] = std::max(maxLen[j], val);
			}
		}
    print(m, maxLen);
    print2(m, maxLen, attributes);
    print(m, maxLen);
    for (int i = 0; i < n; i ++) print2(m, maxLen, arr[i]);
    print(m, maxLen);
  }
  
  return 0;
}

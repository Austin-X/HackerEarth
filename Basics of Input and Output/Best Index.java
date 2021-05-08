import java.io.*;
import java.util.*;

public class BestIndex {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt();
		int[] a = new int[n];
	
		for (int i = 0; i < n; i ++) a[i] = readInt();
		long ans = 0;
		int cnt = 0, idx = 0;
		for (int i = 0; i < n; i += cnt) {
			cnt ++;
			if (i + cnt > n) { cnt --; break; }
			for (int j = i; j < i + cnt; j ++) ans += a[j];
			idx = i + cnt - 1;
		}
		long temp = ans;

		for (int i = 1; i < n; i ++) {
			temp -= a[i - 1];
			if (idx == n - 1) {
				for (int j = n - cnt + 1; j <= n - 1; j ++) temp -= a[j];
				idx = n - cnt;
				cnt --;
			} else {
				idx ++;
				temp += a[idx];
			}
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter() throws IOException {
		return next().charAt(0);
	}
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}

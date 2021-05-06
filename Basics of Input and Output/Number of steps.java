import java.io.*;
import java.util.*;

public class NumberOfSteps {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt();
		int[] a = new int[n], b = new int[n];
		for (int i = 0; i < n; i ++) a[i] = readInt();
		for (int i = 0; i < n; i ++) b[i] = readInt();
		
		int[] sum = new int[5001], freq = new int[5001];
		
		for (int i = 0; i < n; i ++) {
			int cnt = 0;
			for (int j = a[i]; j >= 0; j -= b[i]) { 
				freq[j] ++;
				sum[j] += cnt;
				cnt ++;
				if (b[i] == 0) break;
			} 
		}
		
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= 5000; i ++) if (freq[i] == n) ans = Math.min(ans, sum[i]);
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
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

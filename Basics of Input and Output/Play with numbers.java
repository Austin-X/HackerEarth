import java.io.*;
import java.util.*;

public class PlayWithNumbers {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt(), q = readInt();
		long[] pfs = new long[n + 1];
		for (int i = 1; i <= n; i ++) pfs[i] = pfs[i - 1] + readInt();
		for (int i = 0; i < q; i ++) {
			int l = readInt(), r = readInt();
			System.out.println((pfs[r] - pfs[l - 1]) / (r - l + 1));
		}
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

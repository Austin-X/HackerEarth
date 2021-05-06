import java.io.*;
import java.util.*;

public class ItsMagic {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt();
		int[] a = new int[n];
		long sum = 0;
		int best = Integer.MAX_VALUE, idx = -1;
		for (int i = 0; i < n; i ++) {
			a[i] = readInt();
			sum += a[i];
		}
		for (int i = 0; i < n; i ++) {
			if ((sum - a[i]) % 7 == 0 && a[i] < best) { best = a[i]; idx = i; }
		}
		System.out.println(idx);
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

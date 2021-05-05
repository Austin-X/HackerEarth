import java.io.*;
import java.util.*;

public class ArithmeticProgression {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		for (int t = 0; t < T; t ++) {
			int a = readInt(), b = readInt(), c = readInt();
			int ans = Integer.MAX_VALUE;
			int diff = b - a;
			ans = Math.min(ans, Math.abs(b + diff - c));
			diff = c - b;
			ans = Math.min(ans, Math.abs(b - diff - a));
			diff = c - a;
			if (diff % 2 != 0) {
				int val1 = (diff - 1) / 2, val2 = (diff + 1) / 2;
				ans = Math.min(ans, Math.min(1 + Math.abs(a + 1 + val1 - b), 1 + Math.abs(a - 1 + val2 - b)));
			} else ans = Math.min(ans, Math.abs(a + diff / 2 - b));
			
			System.out.println(ans);
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

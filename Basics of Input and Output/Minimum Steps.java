import java.io.*;
import java.util.*;

public class MinimumSteps {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		for (int t = 0; t < T; t ++) {
			int k = readInt(), m = readInt(), n = readInt();
			int degree = 0, ans = 0;
			while (true) {
				if (k * Math.pow(n, degree) >= m) break;
				degree ++;
			}
			ans += degree;
			
			int mult = (int) (Math.ceil(m / Math.pow(n, degree)));
			if ((k - mult) % 2 == 0) ans += (k - mult) / 2;
			else ans += (k - mult) / 2 + 1;
			k = mult;
			
			int val = (int) (k * Math.pow(n, degree));
			for (int i = degree - 1; i >= 0; i --) {
				if (val == m) break;
				int pow = (int) Math.pow(n, i), quotient = (int) ((val - m) / pow);

				if (quotient % 2 == 1) ans += quotient / 2 + 1;
				else ans += quotient / 2;
				val -= quotient * pow;
			}
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

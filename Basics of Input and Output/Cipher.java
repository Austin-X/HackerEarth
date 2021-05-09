import java.io.*;
import java.util.*;

public class Cipher {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		char[] ch = readLine().toCharArray();
		int k = readInt();
		for (int i = 0; i < ch.length; i ++) {
			int x = ch[i], y;
			if (x >= 65 && x <= 90) {
				y = x + k;
				while (y > 90) y -= 26;
			} else if (x >= 97 && x <= 122) {
				y = x + k;
				while (y > 122) y -= 26;
			} else if (x >= 48 && x <= 57) {
				y = x + k;
				while (y > 57) y -= 10;
			} else y = ch[i];
			System.out.print((char)y);
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

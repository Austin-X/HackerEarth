import java.io.*;
import java.util.*;

public class Anagrams {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		for (int t = 0; t < T; t ++) {
			char[] a = readLine().toCharArray(), b = readLine().toCharArray();
			int[] freqA = new int[26], freqB = new int[26];
			int ans = 0;
			for (char x: a) freqA[x - 97] ++;
			for (char x: b) freqB[x - 97] ++;
			for (int i = 0; i < 26; i ++) ans += Math.abs(freqA[i] - freqB[i]);
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

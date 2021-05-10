import java.io.*;
import java.util.*;

public class MagicalWord {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 65; i <= 90; i ++) {
			boolean prime = true;
			for (int j = 2; j < i; j ++) {
				if (i % j == 0) { prime = false; break; }
			}
			if (prime) set.add(i);
		}
		for (int i = 97; i <= 122; i ++) {
			boolean prime = true;
			for (int j = 2; j < i; j ++) {
				if (i % j == 0) { prime = false; break; }
			}
			if (prime) set.add(i);
		}
		
		for (int t = 0; t < T; t ++) {
			int n = readInt();
			char[] ch = readLine().toCharArray();
			for (int i = 0; i < n; i ++) {
				if (set.contains((int)ch[i])) System.out.print(ch[i]);
				else if (set.lower((int) ch[i]) == null) {
					int x = set.higher((int) ch[i]);
					System.out.print((char)x);
				} else if (set.higher((int)ch[i]) == null) {
					int x = set.lower((int) ch[i]);
					System.out.print((char)x);
				} else if (set.higher((int)ch[i]) - (int)ch[i] < (int)ch[i] - set.lower((int) ch[i])) {
					int x = set.higher((int) ch[i]);
					System.out.print((char)x);
				} else {
					int x = set.lower((int) ch[i]);
					System.out.print((char)x);
				}
			}
			System.out.println();
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

import java.io.*;
import java.util.*;

public class Zoos {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		String str = readLine();
		int zCnt = 0, oCnt = 0;
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == 'z') zCnt ++;
			else oCnt ++;
		}
		System.out.println(zCnt * 2 == oCnt ? "Yes" : "No");
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

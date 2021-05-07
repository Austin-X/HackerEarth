import java.io.*;
import java.util.*;

public class SevenSegmentDisplay {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		for (int t = 0; t < T; t ++) {
			char[] ch = readLine().toCharArray();
			int length = 0;
			for (char c: ch) {
				if (c == '1') length += 2;
				else if (c == '2' || c == '3' || c == '5') length += 5;
				else if (c == '4') length += 4;
				else if (c == '6' || c == '0'  || c == '9') length += 6;
				else if (c == '7') length += 3;
				else if (c == '8') length += 7;
			}
			if (length % 2 == 0) 
				for (int i = 0; i < length / 2; i ++) System.out.print(1);
			else {
				System.out.print(7);
				for (int i = 0; i < (length - 3) / 2; i ++) System.out.print(1);
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

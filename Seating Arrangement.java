import java.io.*;
import java.util.*;

public class SeatingArrangement {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		int[] ans = new int[109], seat = new int[109];
		boolean flag = true;
		
		for (int i = 1; i <= 108; i += 6) {
			int temp = 0, idx = 0;
			if (flag) temp = i + 11;
			else temp = i - 1;
			
			for (int j = i; j < i + 6; j ++) {
				ans[j] = temp;
				temp --;
				seat[j] = idx;
				idx ++;
			}
			flag = !flag;
		}
		
		for (int t = 0; t < T; t ++) {
			int n = readInt();
			System.out.print(ans[n] + " ");
			if (seat[n] == 0 || seat[n] == 5) System.out.println("WS");
			else if (seat[n] == 1 || seat[n] == 4) System.out.println("MS");
			else System.out.println("AS");
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

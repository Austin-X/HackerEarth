import java.io.*;
import java.util.*;

public class MaximumBorders {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		for (int t = 0; t < T; t ++) {
			int n = readInt(), m = readInt();
			char[][] grid = new char[n][m];
			for (int i = 0; i < n; i ++) grid[i] = readLine().toCharArray();
			int max = 0;
			for (int i = 0; i < n; i ++) {
				int tempUpper = 0, tempLower = 0;
				for (int j = 0; j < m; j ++) {
					if (i < n - 1 && grid[i][j] == '#' && grid[i + 1][j] == '#' || grid[i][j] == '.') {
						max = Math.max(max, tempLower);
						tempLower = 0;
					} else tempLower ++;
					if (i > 0 && grid[i][j] == '#' && grid[i - 1][j] == '#' || grid[i][j] == '.') {
						max = Math.max(max, tempUpper);
						tempUpper = 0;
					} else tempUpper ++;
				}
				max = Math.max(max, tempLower);
				max = Math.max(max, tempUpper);
			}

			for (int i = 0; i < m; i ++) {
				int tempRight = 0, tempLeft = 0;
				for (int j = 0; j < n; j ++) {
					if (i < m - 1 && grid[j][i] == '#' && grid[j][i + 1] == '#' || grid[j][i] == '.') {
						max = Math.max(max, tempRight);
						tempRight = 0;
					} else tempRight ++;
					
					if (i > 0 && grid[j][i] == '#' && grid[j][i - 1] == '#' || grid[j][i] == '.') {
						max = Math.max(max, tempLeft);
						tempLeft = 0;
					} else tempLeft ++;
				}
			}
			
			System.out.println(max);
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

import java.io.*;
import java.util.*;

public class MinimizeCost {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt(), k = readInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i ++) a[i] = readInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i <= k && i < n; i ++) if (a[i] < 0) q.add(i);

		for (int i = 0; i < n; i ++) {
			if (a[i] > 0) {
				while (!q.isEmpty()) {
					if (a[i] >= -a[q.peek()]) {
						a[i] += a[q.peek()];
						a[q.peek()] = 0;
						q.poll();
					} else {
						a[q.peek()] += a[i];
						a[i] = 0;
						break;
					}
				}
			}
			if (!q.isEmpty() && q.peek() == i - k) q.poll();
			if (i + k + 1 < n && a[i + k + 1] < 0) q.add(i + k + 1);
		}
		long ans = 0;
		for (int i = 0; i < n; i ++) ans += Math.abs(a[i]);
		System.out.println(ans);	
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

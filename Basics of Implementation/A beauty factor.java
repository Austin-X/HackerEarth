import java.io.*;
import java.util.*;

public class ABeautyFactor {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int b = readInt(), k = readInt(), ans = Integer.MAX_VALUE;
		int[] sum = new int[46];
		
		for (int i = 0; i <= 45; i ++) {
			String s = String.valueOf(i);
			int cur = i;
			while (s.length() != 1) {
				cur = 0;
				for (int j = 0; j < s.length(); j ++) cur += Character.getNumericValue(s.charAt(j));
				s = String.valueOf(cur);
			}
			sum[i] = cur;
		}
		
		int min = k * (k + 1) / 2, max = k * (9 + (9 - k + 1)) / 2;
		for (int i = 0; i <= 45; i ++) {
			String s = String.valueOf(i);
			if (k <= 2) {
				if (s.length() == k && check(s) && sum[i] == b) {
					ans = i;
					break;
				}
			} else {
				if (sum[i] == b && i >= min && i <= max) {
					String res = "";
					int temp = i, cur = 1;
					while (temp > 0) {
						int diff = k - res.length() - 1;
						while ((temp - cur) > diff * (9 + (9 - diff + 1)) / 2) cur ++;
						res += cur;
						temp -= cur;
						cur ++;
					}
					ans = Math.min(ans, Integer.parseInt(res));
				}
			}
		}
		
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}
	
	static boolean check (String s) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i ++) {
			if (set.contains(s.charAt(i)) || s.charAt(i) == '0') return false;
			set.add(s.charAt(i));
		}
		return true;
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

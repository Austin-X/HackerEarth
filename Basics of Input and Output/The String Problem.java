import java.io.*;
import java.util.*;

public class TheStringProblem {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int T = readInt();
		for (int t = 0; t < T; t ++) {
			String s = readLine();
			ArrayList<Character> vowels = new ArrayList<Character>(), ans = new ArrayList<Character>();
			char[] temp = {'a', 'e', 'i', 'o', 'u'};
			for (char x: temp) vowels.add(x);
			for (int i = 0; i < s.length(); i ++) if (vowels.contains(Character.toLowerCase(s.charAt(i)))) ans.add(s.charAt(i));
			
			boolean flag = true;
			for (char x: vowels) if (!ans.contains(x)) { flag = false; break; }	
			if (flag) { System.out.println("lovely string"); continue; }
			flag = true;
			for (char x: temp) if (!ans.contains(Character.toUpperCase(x))) { flag = false; break; }
			if (flag) { System.out.println("lovely string"); continue; }
			System.out.println("ugly string");
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

import java.io.*;
import java.util.*;

public class SimonCannotSleep {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		String str = readLine();
		int hr = Integer.parseInt(str.substring(0, 2)), mm = Integer.parseInt(str.substring(3, 5));
		
		if (hr == 0) System.out.println(1); 
		else if (hr == 12) System.out.println(12);
		else if (mm >= 5 * (hr % 12) + mm / 12d) {
			if (hr > 12) System.out.println(hr);
			else System.out.println(hr + 1);
		}
		else {
			if (hr > 12) System.out.println(hr - 1);
			else System.out.println(hr);
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

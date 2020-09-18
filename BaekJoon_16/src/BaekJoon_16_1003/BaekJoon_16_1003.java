package BaekJoon_16_1003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_16_1003 {
//	private static BufferedWriter writer;
//	private static int[] dp;
//	private static int c0;
//	private static int c1;
//
//	public static int fibonacci(int n) throws IOException {
//
//		if (n == 0) {
//			c0++;
//			return 0;
//		} else if (n == 1) {
//			c1++;
//			return 1;
//		} else {
//			return fibonacci(n - 1) + fibonacci(n - 2);
//
//		}
//	}
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		int n = Integer.parseInt(reader.readLine());
//
//		for (int i = 0; i < n; i++) {
//			int f = Integer.parseInt(reader.readLine());
//			dp = new int[41];
//			fibonacci(f);
//			writer.write(c0 + " " + c1);
//			c0 = 0;
//			c1 = 0;
//			writer.newLine();
//		}
//
//		reader.close();
//		writer.flush();
//		writer.close();
//	}

	private static int[][] dp;

	private static void fibonacci(int n) {
		for (int i = 2; i <= n; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
			dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		dp = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;

		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			int f = Integer.parseInt(reader.readLine());
			fibonacci(f);
			writer.write(dp[f][0] + " " + dp[f][1]);
			writer.newLine();
		}

		reader.close();
		writer.flush();
		writer.close();
	}

}

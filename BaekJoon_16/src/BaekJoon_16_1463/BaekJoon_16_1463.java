package BaekJoon_16_1463;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_16_1463 {

	private static BufferedWriter writer;
	private static int[] dp;

	private static int recur(int n) {
		if (n == 1)
			return 0;
		if (dp[n] > 0)
			return dp[n];
		dp[n] = recur(n - 1) + 1;
		if (n % 2 == 0)
			dp[n] = Math.min(dp[n], recur(n / 2) + 1);
		if (n % 3 == 0)
			dp[n] = Math.min(dp[n], recur(n / 3) + 1);
		return dp[n];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
		dp = new int[1000001];

		int n = Integer.parseInt(reader.readLine());

		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0)
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			if (i % 3 == 0)
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
		}

		writer.write(dp[n] + "\n");
		writer.write(recur(n) + "\n");

		writer.flush();
		reader.close();
		writer.close();
	}
}
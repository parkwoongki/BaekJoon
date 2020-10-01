package BaekJoon_16_9461;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_16_9461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(reader.readLine());

		long[] dp = new long[101];

		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 2;
		dp[4] = 2;

		/* Bottom-Up ¹æ½Ä */
		for (int i = 5; i <= 100; i++) {
			dp[i] = dp[i - 5] + dp[i - 1];
		}

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(reader.readLine());
			writer.write(dp[n - 1] + "\n");
		}

		writer.flush();
		reader.close();
		writer.close();
	}

}
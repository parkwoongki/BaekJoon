package BaekJoon_16_1912;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_1912 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];

		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = 0;
		dp[1] = arr[1];
		for (int i = 2; i <= n; i++) {
			dp[i] = arr[i];
			if (dp[i] + dp[i - 1] > dp[i])
				dp[i] += dp[i - 1];
		}

		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, dp[i]);
		}

		writer.write(max + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

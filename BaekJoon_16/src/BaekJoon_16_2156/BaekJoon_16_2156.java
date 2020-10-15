package BaekJoon_16_2156;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_16_2156 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] arr = new int[10001];
		int[] dp = new int[10001];

		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		for (int i = 3; i <= n; i++) {
			int stepTwo = dp[i - 2];
			int stepOne = dp[i - 3] + arr[i - 1];

			dp[i] = Math.max(dp[i - 1], arr[i] + Math.max(stepTwo, stepOne));
		}

		writer.write(dp[n] + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}
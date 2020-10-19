package BaekJoon_16_11053;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_16_11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] A = new int[1001];
		int[] dp = new int[1001];

		A[0] = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = 1;
			for (int j = 1; j < i; j++) {
				if (A[i] > A[j])
					dp[i] = Math.max(dp[j] + 1, dp[i]);
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (max < dp[i])
				max = dp[i];
		}
		writer.write(max + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

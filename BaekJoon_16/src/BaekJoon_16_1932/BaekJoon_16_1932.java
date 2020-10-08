package BaekJoon_16_1932;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_1932 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[][] tree = new int[501][501];
		int[][] dp = new int[501][501];

		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 1; j <= i; j++) {
				tree[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = tree[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
			}
		}

//		dp[1][1] = tree[1][1];
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				dp[i][j] = tree[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
//			}
//		}

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}

		int max = dp[n][1];
		for (int i = 2; i <= n; i++) {
			if (max < dp[n][i])
				max = dp[n][i];
		}

		System.out.println(max + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

//for (int i = 0; i < n; i++) {
//	for (int j = 0; j <= i; j++) {
//		System.out.print(tree[i][j]+" ");
//	}
//	System.out.println();
//}

package BaekJoon_16_1149;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_1149 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		long[][] rgb = new long[1000][3];
		long[][] dp = new long[1000][3];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < 3; j++) {
				rgb[i][j] = Long.parseLong(st.nextToken());
				dp[i][j] = Long.MAX_VALUE;
			}
		}

		dp[0][0] = rgb[0][0];
		dp[0][1] = rgb[0][1];
		dp[0][2] = rgb[0][2];

		/* 郴 规过 */
//		for (int i = 1; i < n; i++) {
//			for (int j = 0; j < 3; j++) { // r g b 牢瘤 眉农
//				if (j == 0) {
//					long tmp1 = dp[i - 1][j] + rgb[i][1];
//					long tmp2 = dp[i - 1][j] + rgb[i][2];
//					if (dp[i][1] > tmp1)
//						dp[i][1] = tmp1;
//					if (dp[i][2] > tmp2)
//						dp[i][2] = tmp2;
//				} else if (j == 1) {
//					long tmp1 = dp[i - 1][j] + rgb[i][0];
//					long tmp2 = dp[i - 1][j] + rgb[i][2];
//					if (dp[i][0] > tmp1)
//						dp[i][0] = tmp1;
//					if (dp[i][2] > tmp2)
//						dp[i][2] = tmp2;
//				} else if (j == 2) {
//					long tmp1 = dp[i - 1][j] + rgb[i][0];
//					long tmp2 = dp[i - 1][j] + rgb[i][1];
//					if (dp[i][0] > tmp1)
//						dp[i][0] = tmp1;
//					if (dp[i][1] > tmp2)
//						dp[i][1] = tmp2;
//				}
//			}
//		}

		/* 度度茄 规过 */
		for (int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + rgb[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + rgb[i][1];
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + rgb[i][2];
		}
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}

		/* 郴 规过 */
//		long min = dp[n - 1][0];
//		for (int i = 1; i < 3; i++) {
//			if (min > dp[n - 1][i])
//				min = dp[n - 1][i];
//		}
//		writer.write(min + "");

		/* 度度茄 规过 */
		writer.write(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])) + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

//for (int i = 0; i < n; i++) {
//	for (int j = 0; j < 3; j++) {
//		System.out.print(rgb[i][j] + " ");
//	}
//	System.out.println();
//}
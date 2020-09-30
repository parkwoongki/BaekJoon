package BaekJoon_16_1904;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//==개수를 구하는 문제==//
public class BaekJoon_16_1904 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		long[] dp = new long[1000001];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		/* Bottom-Up 방식 */
		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
		}

		writer.write(dp[n] + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

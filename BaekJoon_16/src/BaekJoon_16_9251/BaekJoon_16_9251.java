package BaekJoon_16_9251;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_16_9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] s1 = (0 + reader.readLine()).toCharArray();
		char[] s2 = (0 + reader.readLine()).toCharArray();

		int l1 = s1.length;
		int l2 = s2.length;
		int[][] dp = new int[l1][l2];

		for (int i = 1; i < l1; i++) {
			for (int j = 1; j < l2; j++) {
				if (s1[i] == s2[j])
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}

		writer.write(dp[l1 - 1][l2 - 1] + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

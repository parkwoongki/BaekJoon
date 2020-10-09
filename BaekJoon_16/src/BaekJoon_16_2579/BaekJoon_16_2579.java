package BaekJoon_16_2579;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_16_2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] stairs = new int[301]; 
		int[] dp = new int[301];

		for (int i = 1; i <= n; i++) {
			stairs[i] = Integer.parseInt(reader.readLine());
		}

		dp[1] = stairs[1];
		dp[2] = stairs[1] + stairs[2];
		dp[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);
		for (int i = 4; i <= n; i++) {
			int stepbystep = dp[i - 3] + stairs[i - 1];
			int doublestep = dp[i - 2];

			dp[i] = stairs[i] + Math.max(stepbystep, doublestep);
		}

		writer.write(dp[n] + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}
//for (int i = 1; i <= n; i++) {
//	System.out.println(stairs[i]);
//}
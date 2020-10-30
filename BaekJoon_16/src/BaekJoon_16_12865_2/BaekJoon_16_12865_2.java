package BaekJoon_16_12865_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_12865_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken()); // 1 ~ 100
		int K = Integer.parseInt(st.nextToken()); // 1 ~ 100,000

		int[][] dp = new int[N + 1][K + 1]; // 0:W(����), 1:V(��ġ)
		int[] W = new int[N + 1];
		int[] V = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(reader.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				dp[i][j] = dp[i - 1][j]; // �⺻������ ���� �������� ��ġ�� �����Ѵ�.
				if (j - W[i] >= 0) { // ���Կ��� �ڽ��� ���Ը� ���� �� ���� ���԰� �����ϸ�,
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]); // ���� �����ۿ��� ���� ��ġ�� ���� ������ ��ġ + �ڽ��� ��ġ
																					// �� ū ���� ���Ѵ�.
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				System.out.print(dp[i][j] + "\t");
			}
			System.out.println();
		}

		writer.write(dp[N][K] + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

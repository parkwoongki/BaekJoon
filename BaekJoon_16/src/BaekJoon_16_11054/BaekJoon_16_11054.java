package BaekJoon_16_11054;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_11054 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] A = new int[1001];
		int[][] dp = new int[2][1001]; // 0 : ���� �� �����ϴ� �κ� ����, 1: ���� �� �����ϴ� �κ� ����

		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		dp[0][1] = 1; // ���� ����
		for (int i = 2; i <= n; i++) {
			dp[0][i] = 1;
			for (int j = 1; j < i; j++) {
				if (A[i] > A[j])
					dp[0][i] = Math.max(dp[0][i], dp[0][j] + 1);
			}
		}

		dp[1][n] = 1; // ������ ����
		for (int i = n - 1; i > 0; i--) {
			dp[1][i] = 1;
			for (int j = n; j > i; j--) {
				if (A[i] > A[j]) // �������� �ٸ� ���̶� ������ ���°� �ƴϰ� ���ʿ��� �����ϴ°Ͱ� ���������� ū���� ��� üũ���ָ� �ȴ�.
					dp[1][i] = Math.max(dp[1][i], dp[1][j] + 1);
			}
		}

		// �� ī��Ʈ�� ���� ���ؼ� ù��°�� �־��ش�.
		for (int i = 1; i <= n; i++) {
			dp[0][i] += dp[1][i];
		}

		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (max < dp[0][i])
				max = dp[0][i];
		}

		writer.write(max - 1 + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}

package BaekJoon_13_1018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_13_1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] ch = new char[n][m];
		for (int i = 0; i < n; i++) {
			String s = reader.readLine();
			for (int j = 0; j < m; j++) {
				ch[i][j] = s.charAt(j);
			}
		}

		int count = Integer.MAX_VALUE;
		int tmp1 = 0;
		int tmp2 = 0;
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				tmp1 = 0;
				tmp2 = 0;
				// 시작점이 흰색인 경우
				for (int j2 = i; j2 < i + 8; j2++) {
					for (int k = j; k < j + 8; k++) {
						if (j2 % 2 == 0) {
							if (k % 2 == 0) {
								if (ch[j2][k] != 'W')
									tmp1++;
							} else {
								if (ch[j2][k] != 'B')
									tmp1++;
							}
						} else {
							if (k % 2 == 0) {
								if (ch[j2][k] != 'B')
									tmp1++;
							} else {
								if (ch[j2][k] != 'W')
									tmp1++;
							}
						}
					}
				}
				
				// 시작점이 검정색인 경우
				for (int j2 = i; j2 < i + 8; j2++) {
					for (int k = j; k < j + 8; k++) {
						if (j2 % 2 == 0) {
							if (k % 2 == 0) {
								if (ch[j2][k] != 'B')
									tmp2++;
							} else {
								if (ch[j2][k] != 'W')
									tmp2++;
							}
						} else {
							if (k % 2 == 0) {
								if (ch[j2][k] != 'W')
									tmp2++;
							} else {
								if (ch[j2][k] != 'B')
									tmp2++;
							}
						}
					}
				}

				// 둘 중 나은 것
				int dif = (tmp1 < tmp2) ? tmp1 : tmp2;
				if (dif < count)
					count = dif;
			}
		}

		writer.write(count + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

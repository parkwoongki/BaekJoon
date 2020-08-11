package BaekJoon_10_9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_10_9020 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] prime = new boolean[2 * 10000 + 1];

		prime[0] = prime[1] = false;
		int sqrt = (int) Math.ceil(Math.sqrt(2 * 10000 + 1));

		for (int i = 2; i <= sqrt; i++) {
			if (prime[i])
				continue;

			for (int j = i * i; j < 2 * 10000 + 1; j += i) {
				prime[j] = true;
			}
		}

		int t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(reader.readLine()); // 4 ~ 10000

			int a, b;
			int t1 = 0, t2 = 0;
			if (n == 4) {
				writer.write(2 + " " + 2 + "\n");
				continue;
			}

			for (int j = 3; j <= n / 2; j++) {
				a = j;
				b = n - j;

				if (prime[a] == false && prime[b] == false) {
					t1 = a;
					t2 = b;
				}
			}
			writer.write(t1 + " " + t2 + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}

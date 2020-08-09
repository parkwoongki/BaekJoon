package BaekJoon_10_prime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_10_prime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(reader.readLine());

		boolean[] b = new boolean[t + 1]; // 1

		b[0] = b[1] = false; // 2
		for (int i = 2; i <= t; i++) { // 3
			b[i] = true;
		}

		int sq = (int) Math.ceil(Math.sqrt(t)); // 4

		for (int i = 2; i <= sq; i++) { // 5
			if (!b[i]) // 6
				continue;
			for (int j = i * i; j <= t; j += i) { // 7
				b[j] = false;
			}
		}

		for (int i = 2; i <= t; i++) { // 8
			if (b[i])
				writer.write(i + " ");
		}

		writer.flush();
		writer.close();
		reader.close();

	}

}

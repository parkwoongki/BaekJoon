package BaekJoon_16_2748;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_16_2748 {

	private static long[] f;

	private static long fibonacci(long n) {
		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i < f.length; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[(int) n];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Integer.parseInt(reader.readLine());
		f = new long[(int) (n + 1)];

		writer.write(fibonacci(n) + "");

		reader.close();
		writer.flush();
		writer.close();
	}

}

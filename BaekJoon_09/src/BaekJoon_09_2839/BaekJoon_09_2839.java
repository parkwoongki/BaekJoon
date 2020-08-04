package BaekJoon_09_2839;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_09_2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

//		/* 1. */
//		int total = -1;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if ((5 * i + 3 * j) == n) {
//					if (total == -1)
//						total = i + j;
//					else if (total > i + j)
//						total = i + j;
//					break;
//				}
//			}
//		}

		/* 2. */
		int total = 0;
		while (true) {
			if (n % 5 == 0) {
				writer.write(n / 5 + total + "");
				break;
			} else if (n <= 0) {
				writer.write("-1");
				break;
			}
			n -= 3;
			total++;
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}

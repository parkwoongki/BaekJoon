package BaekJoon_10_4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_10_4948 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] b = new boolean[2 * 123456 + 1];

		b[0] = b[1] = false;
		int sqrt = (int) Math.ceil(Math.sqrt(2 * 123456 + 1));

		for (int i = 2; i <= sqrt; i++) {
			if (b[i])
				continue;

			for (int j = i * i; j < 2 * 123456 + 1; j += i) {
				b[j] = true;
			}
		}

		while (true) {
			int t = Integer.parseInt(reader.readLine());
			if (t == 0)
				break;

			int count = 0;
			for (int i = t + 1; i < 2 * t + 1; i++) {
				if (!b[i])
					count++;
			}
			writer.write(count + " ");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	/* 과거의 나의 풀이 */
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		while (true) {
//			int t = Integer.parseInt(reader.readLine());
//			if (t == 0)
//				break;
//
//			boolean[] b = new boolean[2 * t + 1];
//
//			b[0] = b[1] = true;
//			int sqrt = (int) Math.ceil(Math.sqrt(2 * t + 1));
//			for (int i = 0; i <= sqrt; i++) {
//				if (b[i])
//					continue;
//
//				for (int j = i * i; j < 2 * t + 1; j += i) {
//					b[j] = true;
//				}
//			}
//
//			int count = 0;
//			for (int i = t + 1; i < b.length; i++) {
//				if (!b[i])
//					count++;
//			}
//			writer.write(count + " ");
//		}
//
//		writer.flush();
//		writer.close();
//		reader.close();
//	}

}

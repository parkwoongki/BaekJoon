package BaekJoon_07_1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_07_1065 {

	private static boolean isH(int n) {

		if (n / 100 == 0)
			return true;
		else if (n / 1000 >= 1)
			return false;
		else {
			int a = n % 10;
			n /= 10;
			int b = n % 10;
			n /= 10;
			int c = n % 10;

			if ((a - b) == (b - c)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (isH(i))
				count++;
		}

		writer.write(count + "");

		writer.flush();
		writer.close();
	}

}

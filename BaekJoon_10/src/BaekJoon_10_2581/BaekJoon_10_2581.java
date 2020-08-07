package BaekJoon_10_2581;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_10_2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int n = b - a;

		int sum = 0;
		int min = -1;
		for (int i = a; i <= b; i++) {
			if (i == 1)
				continue;

			boolean c = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					c = false;
					break;
				}
			}

			if (c) {
				sum += i;
				if (min == -1)
					min = i;
			}
		}

		if (min != -1)
			writer.write(sum + "\n" + min);
		else
			writer.write(min + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

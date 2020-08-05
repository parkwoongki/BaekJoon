package BaekJoon_09_1193;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_09_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int count = 1;
		int std = 1;
		while (true) {
			if (n <= std)
				break;

			count++; // 2 3 4
			std += count; // 3 6 10

		}

		n = n - (std - count); // 8 - 6
		int i = 0, j = 0;
		if (count % 2 == 0) {
			i = n;
			j = (count + 1) - n;
		} else {
			j = n;
			i = (count + 1) - n;
		}

		writer.write(i + "/" + j);

		writer.flush();
		writer.close();
		reader.close();
	}

}

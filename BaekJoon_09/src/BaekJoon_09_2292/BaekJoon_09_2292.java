package BaekJoon_09_2292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_09_2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int count = 0;
		int std = 1;
		while (n != 1) {
			std += 6 * count;
			if (n <= std)
				break;
			count++;
		}

		writer.write(++count + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

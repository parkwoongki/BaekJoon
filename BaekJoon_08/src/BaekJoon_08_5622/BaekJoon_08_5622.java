package BaekJoon_08_5622;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_08_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = reader.readLine();

		int sum = s.length();
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);

			if (c >= 65 && c <= 67)
				sum += 2;
			else if (c >= 68 && c <= 70)
				sum += 3;
			else if (c >= 71 && c <= 73)
				sum += 4;
			else if (c >= 74 && c <= 76)
				sum += 5;
			else if (c >= 77 && c <= 79)
				sum += 6;
			else if (c >= 80 && c <= 83)
				sum += 7;
			else if (c >= 84 && c <= 86)
				sum += 8;
			else if (c >= 87 && c <= 90)
				sum += 9;
		}

		writer.write(sum + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

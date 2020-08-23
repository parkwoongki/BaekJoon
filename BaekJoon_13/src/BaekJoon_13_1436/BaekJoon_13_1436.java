package BaekJoon_13_1436;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_13_1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int k = Integer.parseInt(reader.readLine());

		int count = 0;
		int i = 666;
		while (true) {
			String s = String.valueOf(i);
			if (s.contains("666"))
				count++;
			if (count == k)
				break;
			i++;
		}

		writer.write(i + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

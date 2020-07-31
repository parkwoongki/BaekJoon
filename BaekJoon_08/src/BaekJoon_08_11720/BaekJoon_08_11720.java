package BaekJoon_08_11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_08_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		String a = reader.readLine();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(String.valueOf(a.charAt(i)));
		}

		writer.write(sum + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

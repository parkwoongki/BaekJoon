package BaekJoon_03_2439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_03_2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (j <= i)
					writer.write("*");
				else
					writer.write(" ");
			}
			writer.write("\n");
		}

		writer.flush();
		writer.close();
	}

}

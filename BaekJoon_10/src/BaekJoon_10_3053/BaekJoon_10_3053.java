package BaekJoon_10_3053;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_10_3053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		final double PI = 3.141593;

		int r = Integer.parseInt(reader.readLine());

		double u = Math.PI * r * r;
		writer.write(String.format("%.6f", u) + "\n");

		double t = r * r * 2;
		writer.write(String.format("%.6f", t) + "\n");

		writer.flush();
		writer.close();
		reader.close();
	}

}

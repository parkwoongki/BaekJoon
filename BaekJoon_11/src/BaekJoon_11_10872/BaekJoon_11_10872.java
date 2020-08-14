package BaekJoon_11_10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_11_10872 {

	public static int factorial(int n) {
		if (n < 2)
			return n;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		if (n == 0)
			writer.write(1 + "");
		else
			writer.write(factorial(n) + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

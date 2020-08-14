package BaekJoon_11_10870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_11_10870 {

	public static int factorial(int n) {
		if (n < 2)
			return n;
		else
			return factorial(n - 1) + factorial(n - 2);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		writer.write(factorial(n) + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

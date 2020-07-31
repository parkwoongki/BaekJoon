package BaekJoon_08_11654;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_08_11654 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		char c = reader.readLine().charAt(0);
		int n = (int) c;
		writer.write(n+"");

		writer.flush();
		writer.close();
	}

}

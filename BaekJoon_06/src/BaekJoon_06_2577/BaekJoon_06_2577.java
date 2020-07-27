package BaekJoon_06_2577;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_06_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());

		int n = a * b * c;
		String s = Integer.toString(n);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i == Integer.parseInt(String.valueOf(s.charAt(j))))
					arr[i]++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			writer.write(arr[i] + "\n");
		}

		reader.close();
		writer.flush();
		writer.close();
	}

}

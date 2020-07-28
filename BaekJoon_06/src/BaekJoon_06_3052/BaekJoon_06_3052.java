package BaekJoon_06_3052;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class BaekJoon_06_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//		int[] a = new int[42];
//		for (int i = 0; i < 10; i++) {
//			a[Integer.parseInt(reader.readLine()) % 42]++;
//		}
//
//		int count = 0;
//		for (int arr : a) {
//			if (arr != 0)
//				count++;
//		}
//
//		writer.write(count + "");

		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(reader.readLine()) % 42);
		}

		writer.flush();
		writer.close();
	}

}

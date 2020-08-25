package BaekJoon_14_CountingSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_14_CountingSort {

	public static void countingSort(int[] a, int[] b) {
		int[] c = new int[10001];

		for (int i = 0; i < a.length; i++) {
			c[a[i]]++;
		}
		for (int i = 1; i < c.length; i++) {
			c[i] = c[i] + c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			b[--c[a[i]]] = a[i];
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] input = new int[n];
		int[] output = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(reader.readLine());
		}

		countingSort(input, output);

		StringBuffer sb = new StringBuffer();
		for (int a : output) {
			sb.append(a).append("\n");
		}

		writer.write(sb.toString());
		writer.flush();
		writer.close();
		reader.close();
	}

}

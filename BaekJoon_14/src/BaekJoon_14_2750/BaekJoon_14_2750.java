package BaekJoon_14_2750;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_14_2750 {

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int loc = i - 1;
			int newItem = arr[i];

			while (loc >= 0 && newItem < arr[loc]) {
				arr[loc + 1] = arr[loc];
				loc--;
			}
			arr[loc + 1] = newItem;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		insertionSort(arr);

		for (int a : arr) {
			writer.write(a + " ");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
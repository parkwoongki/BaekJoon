package BaekJoon_14_2108_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon_14_2108_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] arr = new int[n];
		int[] check = new int[8001]; // -4000 ~ 0 ~ 4000
		int sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int max_count = 0;
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(reader.readLine());
			arr[i] = tmp;
			sum += tmp;
			if (tmp > max)
				max = tmp;
			if (tmp < min)
				min = tmp;
			check[tmp + 4000]++;
			if (check[tmp + 4000] > max_count)
				max_count = check[tmp + 4000];
		}
		Arrays.sort(arr);

		writer.write((int) Math.round((double) sum / n) + "\n");

		int mid = arr[n / 2];
		writer.write(mid + "\n");

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for (int i = 0; i < check.length; i++) {
			if (check[i] == max_count && max_count > 0)
				if (first == Integer.MIN_VALUE)
					first = i - 4000;
				else if (second == Integer.MIN_VALUE)
					second = i - 4000;
				else
					break;
		}

		if (second != Integer.MIN_VALUE)
			writer.write(second + "\n");
		else
			writer.write(first + "\n");

		int cnt = arr[n - 1] - arr[0];
		writer.write(Math.abs(cnt) + "\n");

		writer.close();
		reader.close();
	}

}

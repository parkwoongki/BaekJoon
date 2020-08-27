package BaekJoon_14_2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BaekJoon_14_2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] arr = new int[n];
		int[] check = new int[8001]; // -4000 ~ 0 ~ 4000
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
			sum += arr[i];
			check[arr[i] + 4000]++;
		}
		Arrays.sort(arr);

		writer.write((int) Math.round((double) sum / n) + "\n");

		int mid = arr[n / 2];
		writer.write(mid + "\n");

		// 최대 회수 찾기
		int max = 0;
		for (int i = 0; i < check.length; i++) {
			if (check[i] > max)
				max = check[i];
		}

		List<Integer> max_list = new ArrayList<Integer>();
		for (int i = 0; i < check.length; i++) {
			if (check[i] == max)
				max_list.add(i - 4000);
		}

		if (max_list.size() == 1)
			writer.write(max_list.get(0) + "\n");
		else {
			Collections.sort(max_list);
			writer.write(max_list.get(1) + "\n");
		}

		int cnt = arr[n - 1] - arr[0];
		writer.write(Math.abs(cnt) + "\n");

		writer.close();
		reader.close();
	}

}

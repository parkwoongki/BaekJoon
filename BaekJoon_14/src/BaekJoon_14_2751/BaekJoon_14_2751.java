package BaekJoon_14_2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaekJoon_14_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(reader.readLine()));
		}

		Collections.sort(list);

		StringBuffer sb = new StringBuffer();
		for (int a : list) {
			sb.append(a).append("\n");
		}

		writer.write(sb.toString());
		writer.flush();
		writer.close();
		reader.close();
	}
}

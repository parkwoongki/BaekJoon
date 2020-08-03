package BaekJoon_08_2941;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon_08_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

//		/* 1. */
//		String s = reader.readLine();
//		char[] c = s.toCharArray();
//
//		int count = 1;
//		for (int i = 1; i < c.length; i++) {
//			if (c[i] == '=') {
//				if (c[i - 1] == 'c' || c[i - 1] == 's')
//					continue;
//				else if (c[i - 1] == 'z') {
//					if (i > 1 && c[i - 2] == 'd') {
//						count--;
//						continue;
//					} else
//						continue;
//				} else
//					count++;
//			} else if (c[i] == '-') {
//				if (c[i - 1] == 'c' || c[i - 1] == 'd') {
//					continue;
//				} else
//					count++;
//			} else if (c[i] == 'j') {
//				if (c[i - 1] == 'l' || c[i - 1] == 'n')
//					continue;
//				else
//					count++;
//			} else
//				count++;
//		}
//
//		writer.write(count + "");

		/* 2. */
		List<String> words = new ArrayList<>();
		words.add("c=");
		words.add("c-");
		words.add("dz=");
		words.add("d-");
		words.add("lj");
		words.add("nj");
		words.add("s=");
		words.add("z=");

		String s = reader.readLine();

		for (String word : words) {
			if (s.contains(word)) {
				s = s.replace(word, "*");
			}
		}

		writer.write(s.length() + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

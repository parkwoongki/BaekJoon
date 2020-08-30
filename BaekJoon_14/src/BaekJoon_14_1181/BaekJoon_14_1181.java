package BaekJoon_14_1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon_14_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		Set<String> hs = new HashSet<String>();

		// 해쉬 셋을 이용한 중복 제거
		for (int i = 0; i < n; i++) {
			hs.add(reader.readLine());
		}

		String[] sarr = hs.toArray(new String[0]); // 리스트를 배열로
		Arrays.sort(sarr, (e1, e2) -> {
			if (e1.length() == e2.length()) {
				return e1.compareTo(e2);
			} else {
				return e1.length() - e2.length();
			}
		});

//		List<String> list = new ArrayList<String>(Arrays.asList(sarr)); // 배열을 리스트로
//		Collections.sort(list, (e1, e2) -> {
//			if (e1.length() == e2.length()) {
//				return e1.compareTo(e2);
//			} else {
//				return e1.length() - e2.length();
//			}
//		});

		for (String a : sarr) {
			writer.write(a + "\n");
		}

//		for (String a : list) {
//			writer.write(a + "\n");
//		}

		writer.close();
		reader.close();
	}

}

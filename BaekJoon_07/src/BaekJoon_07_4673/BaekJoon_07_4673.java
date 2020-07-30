package BaekJoon_07_4673;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon_07_4673 {

	private static int d(int a) {
		int ans = 0;

		ans = a + (a / 1000) + (a / 100 - (a / 1000) * 10) + (a / 10 - (a / 100) * 10) + (a % 10);

		return ans;

//		int dn = a;
//	        
//	    while(a > 0) {
//			dn += a % 10;
//			a /= 10;
//		}
//
//		return dn;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> l = new ArrayList<>();

		for (int i = 1; i < 10001; i++) {
			l.add(d(i));
		}

		for (int i = 1; i < l.size(); i++) {
			if (!l.contains(i)) {
				w.write(i + "\n");
			}
		}

		w.flush();
		w.close();
	}
}

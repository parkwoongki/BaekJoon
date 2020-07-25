package BaekJoon_05_5543;

import java.util.Scanner;

public class BaekJoon_05_5543 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t, l1, l2;

		l1 = s.nextInt();
		for (int i = 1; i < 3; i++) {
			t = s.nextInt();

			if (t < l1)
				l1 = t;
		}

		l2 = s.nextInt();
		t = s.nextInt();

		if (l2 > t)
			l2 = t;

		int r = l1 + l2 - 50;

		System.out.println(r);
	}

}

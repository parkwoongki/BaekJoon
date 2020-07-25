package BaekJoon_05_10817;

import java.util.Scanner;

public class BaekJoon_05_10817 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		// a b c
		if (a < b) {
			if (c < b) {
				if (a > c)
					System.out.println(a);
				else
					System.out.println(c);
			} else { // c>b
				System.out.println(b);
			}
		} else { // b < a
			if (b < c) {
				if (a < c)
					System.out.println(a);
				else
					System.out.println(c);
			} else {
				System.out.println(b);
			}
		}
	}

}

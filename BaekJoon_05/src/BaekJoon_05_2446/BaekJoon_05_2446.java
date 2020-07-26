package BaekJoon_05_2446;

import java.util.Scanner;

public class BaekJoon_05_2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 2 - 1; j++) {
				if (j < i)
					System.out.print(" ");
				else if (j >= n * 2 - 1 - i)
					break;
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < n * 2 - 1; j++) {
				if (j < i - 1)
					System.out.print(" ");
				else if (j > n * 2 - 1 - i)
					break;
				else
					System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}

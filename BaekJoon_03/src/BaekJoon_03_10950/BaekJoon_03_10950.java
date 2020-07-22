package BaekJoon_03_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_03_10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(t.nextToken());
		
		int a=0,b=0;
		for (int i = 0; i < n; i++) {
			t = new StringTokenizer(reader.readLine());
			a = Integer.parseInt(t.nextToken());
			b = Integer.parseInt(t.nextToken());
			System.out.println(a+b);
		}
	}

}

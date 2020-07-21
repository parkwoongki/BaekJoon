import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_02_2884 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(reader.readLine());

		int h = Integer.parseInt(t.nextToken());
		int m = Integer.parseInt(t.nextToken());

		if (h == 0)
			h = 24;

		int s = h * 60 + m - 45;

		if (s / 60 != 24)
			h = s / 60;
		else
			h = 0;
		
		m = s % 60;

		System.out.println(h + " " + m);
	}

}

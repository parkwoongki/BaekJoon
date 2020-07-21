import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_02_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(tokenizer.nextToken());

		if ((a % 4 == 0 && a % 100 != 0 ) || (a % 400 == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}

package BaekJoon_14_1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon_14_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = reader.readLine();

		char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}

		Arrays.sort(arr);

		StringBuffer sb = new StringBuffer();
		for (int i = arr.length - 1; i >= 0; i--) 
			sb.append((char) arr[i]);
		
		writer.write(sb.toString());
		writer.close();
		reader.close();
	}

}

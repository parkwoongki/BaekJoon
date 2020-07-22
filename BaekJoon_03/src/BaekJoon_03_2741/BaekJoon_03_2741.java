package BaekJoon_03_2741;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_03_2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= n; i++) {
			writer.write(i+"\n");
		}
		
		writer.flush();
		writer.close();
	}

}

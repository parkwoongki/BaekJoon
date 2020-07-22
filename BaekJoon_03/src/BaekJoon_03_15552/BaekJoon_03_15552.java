package BaekJoon_03_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_03_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(t.nextToken());
		
		int a=0,b=0;
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			t = new StringTokenizer(reader.readLine());
			a = Integer.parseInt(t.nextToken());
			b = Integer.parseInt(t.nextToken());
			writer.write(a+b+"\n");
		}
		writer.flush();
		writer.close();
	}

}

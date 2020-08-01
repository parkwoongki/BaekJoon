package BaekJoon_08_2908;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_08_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		StringBuffer sb1 = new StringBuffer(st.nextToken());
		StringBuffer sb2 = new StringBuffer(st.nextToken());
		
		int rn1 = Integer.parseInt(sb1.reverse().toString());
		int rn2 = Integer.parseInt(sb2.reverse().toString());

		if (rn1 > rn2)
			writer.write(rn1 + "");
		else
			writer.write(rn2 + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}

package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back11005 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int basePower = 1;
		int K = 0;

		do {
			int num = N % B;
			N = N / B;
			if(num >= 10) { 
				sb.insert(0, (char) (num+'A'-10));
			}else {
				sb.insert(0, num);
			}
			
		}while(N > 0);
		bw.write(sb.toString());
		bw.flush();
	}
}

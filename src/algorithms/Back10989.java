package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Back10989 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int len = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
		for (int i = 0; i < len; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i = 1; i < arr.length; i++) {
			while(arr[i]-- > 0) {
				bw.write(i+"\n");
			}
		}
		bw.flush();
	}
}

package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Back3273 {

	public static void main(String[] args)throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		boolean[] visited = new boolean[n];
		int[] arr = Arrays
				.stream(br.readLine().split(" "))
				.mapToInt(s->Integer.parseInt(s))
				.toArray();
		
		Arrays.sort(arr);
		
		int x = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			int num = x - arr[i];
			visited[i] = true;
			int idx = Arrays.binarySearch(arr, num);
			if(idx > 0 && !visited[idx]) {
				visited[idx] = true;
				answer++;
			}
		}
//		System.out.println(Arrays.toString(arr));

		bw.write(""+answer+"\n");
		bw.flush();
	}
}

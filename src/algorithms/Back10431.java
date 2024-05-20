package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Back10431 {
	
	
	public static int line(StringTokenizer st) {
		int answer = 0;
		int[] arr = new int[20];
		int cnt = 1;
		int student = Integer.parseInt(st.nextToken());
		arr[0] = student;
		
		while(st.hasMoreTokens()) {
			student = Integer.parseInt(st.nextToken());
			if(arr[cnt-1] > student) {
				int idx = cnt-1;
				while(arr[idx] > student) {
					arr[idx+1] = arr[idx];
					answer++;
					idx--;
					if(idx == -1)
						break;
				}
				arr[idx+1] = student;
			}else {
				arr[cnt] = student;
			}
			cnt++;
		}
		return answer;
	}
	
	public static void main(String[] args)throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		int i = 0;
		while(br.ready()) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			System.out.println(num+" "+line(st));
		}
	}

}

package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back1236 {

	public static void main(String[] args)throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //세로
		int m = Integer.parseInt(st.nextToken()); //가로
		System.out.println(n+""+m);
		String[][] castle = new String[n][m];
		boolean[] isM = new boolean[n];
		boolean[] isN = new boolean[m];
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				castle[i][j] = str[j];
			}
		}
		int[] cnt = checkGuard(castle, isM, isN);
		System.out.println(Math.max(cnt[1], cnt[0]));
	}
	public static int[] checkGuard(String[][] castle, boolean[] isM, boolean[] isN) {
		int[] cnt = new int[2];
		int j = 0;
		int i = 0;
		while(i <isM.length) {
			if(j == isN.length) {
				j = 0;
				i++;
				cnt[0]++;
				continue;
			}else if(castle[i][j].equals("X")) {
				isM[i] = true;
				i++;
				j = 0;
				continue;
			} 
			j++;
		}
		j = 0;
		i = 0;
		while(i <isN.length) {
			if(j == isM.length) {
				j = 0;
				i++;
				cnt[1]++;
				continue;
			}else if(castle[j][i].equals("X")) {
				isN[i] = true;
				i++;
				j = 0;
				continue;
			} 
			j++;
		}
		return cnt;
	}
	
}

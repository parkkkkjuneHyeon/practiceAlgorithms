package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;	

public class Back1919 {
	public static int[] getArr(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String strA = br.readLine();
		String strB = br.readLine();
		int[] arrA = getArr(strA);
		int[] arrB = getArr(strB);
		int cnt = 0;

		for (int i = 0; i < 26; i++) {
			cnt += Math.abs(arrA[i] - arrB[i]);
		}
		System.out.println(cnt);
	}
}

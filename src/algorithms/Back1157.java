package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStreamReader;
public class Back1157 {
	static int max = -1;
	
	public static int[] getAlpArr(String str) {
		int[] cntArr = new int[26];
		int len = str.length();
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			cntArr[ch - 'A']++;
			if(max < cntArr[ch-'A']) {
				max = cntArr[ch-'A'];
			}
		}
		return cntArr;
	}
	
	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String word = br.readLine().toUpperCase();

		int[] wordCnt = getAlpArr(word);
		StringBuffer str = new StringBuffer();
		
		for (int i = 0; i < 26; i++) {
			if(max == wordCnt[i]) {
				if(str.length() == 1) {
					str = new StringBuffer("?");
					break;
				}
				str.append((char)(i+'A'));
			}
		}
		System.out.println(str);
	}

}
//Mississipi
package algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Back1543 {
	
	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String content = br.readLine();
		String word = br.readLine();
		String replace = content.replace(word, "");
		int length = content.length() - replace.length();
		int cnt = length / word.length();
		System.out.println(cnt);
	}

}

//int wordLen = word.length();
//int cnt = 0;
//int i = 0;
//
//while(true) {
//	int idx = content.indexOf(word, i);
//	if(idx == -1) {
//		break;
//	}
//	i = idx + wordLen;
//	cnt++;
//}
//System.out.println(cnt);

//
//public static boolean checkWord(String content, String word) {
//	int conLen = content.length();
//	
//	for(int i=0; i<conLen; i++) {
//		char conCh = content.charAt(i);
//		char wordCh = word.charAt(i);
//		if(conCh != wordCh) {
//			return false;
//		}
//	}
//	return true;
//}
//
//public static void main(String[] args) throws IOException {
//	String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
//	BufferedReader br = new BufferedReader(new FileReader(path));
//	String content = br.readLine();
//	String word = br.readLine();
//	int conLen = content.length();
//	int wordLen = word.length();
//	int cnt = 0;
//	
//	for(int i=0; i+wordLen <= conLen && i < conLen;) {
//		String temp = content.substring(i, i+wordLen);
//		if(checkWord(temp, word)) {
//			cnt++;
//			i += wordLen;
//		}else {
//			i++;
//		}
//	}
//	System.out.println(cnt);
//}

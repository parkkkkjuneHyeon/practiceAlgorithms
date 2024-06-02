package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Back11068 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int digit = Integer.parseInt(br.readLine());
		
		while(digit-- > 0) {
			
			int num = Integer.parseInt(br.readLine());
			if(isPalindromes(num)) {
				bw.write("1\n");
			}else {
				bw.write("0\n");
			}	
		}
		bw.flush();
		
	}

	public static boolean isPalindromes(int num) {
		boolean flag = false;
		int B = 65;
		
		while(B-- > 2) {
			if(isCompareNumber(getBSystem(B, num))) {
				flag = true;
				return flag;
			}
		}
		
		return flag;
	}
	public static String getBSystem(int B, int num) {
		StringBuilder sb = new StringBuilder();
		
		do {
			int rest = (num % B);
			if(rest > 9)
				sb.insert(0, (char)(rest+'A'-10));
			else 
				sb.insert(0, (rest));
			
			num /= B;
			
		}while(num > 0);
		
		return sb.toString(); 
	}
	
	public static boolean isCompareNumber(String str) {
		boolean flag = true;
		int len = str.length();
		int end = len-1;
		
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(end--)) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}
}

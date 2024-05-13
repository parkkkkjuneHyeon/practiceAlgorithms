package algorithms;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Back11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		int len = Integer.parseInt(br.readLine());
		char[] nums = br.readLine().toCharArray();
		int sumNums = 0;
		for(int i=0; i<len; i++) {
			sumNums += (nums[i]-'0');
		}
		System.out.println(sumNums);
		
		
		
	}

}

//1
//1
//
//5
//54321
//
//25
//7000000000000000000000000
//
//11
//10987654321
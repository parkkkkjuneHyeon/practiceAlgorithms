package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Back1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		int len = Integer.parseInt(br.readLine());
		String[] scoreStr = br.readLine().split(" ");
//		int[] score = new int[len];
		int sum = 0;
		int max = 0;
		int num = 0;
		for(int i=0; i<len; i++) {
			num = Integer.parseInt(scoreStr[i]);
			sum += num;
			if(max < num) 
				max = num;
		}
		System.out.println((sum*100.0 / max)/len);
		
		
	}

}

 //
//3
//40 80 60
//
//3
//10 20 30
//
//4
//1 100 100 100
//
//5
//1 2 4 8 16
//
//2
//3 10
package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Back10448 {
	
	private static boolean[] isEureka = new boolean[1001];
	
	public static List<Integer> getTriangleNumbers() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; (i*(i+1)/2) < 1000; i++) {
			list.add((i*(i+1)/2));
		}
		return list;
	}
	
	public static boolean[] isTwoSumNum(List<Integer> list) {
		boolean[] isTwoSumNum = new boolean[1001];
		int len = list.size();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				int sum = list.get(i) + list.get(j);
				if(sum <= 1000)
					isTwoSumNum[sum] = true;
				else if(sum > 1000)
					break;
			}
		}
		
		return isTwoSumNum;
	}
	
	public static void preprocess() {
		List<Integer> list = getTriangleNumbers();
		boolean[] isTwoSum = isTwoSumNum(list);

		for (int i = 1; i < isTwoSum.length; i++) {
			if(isTwoSum[i]) {
				int len = list.size();
				for (int j = 0; j < len; j++) {
					int sum = list.get(j) + i;
					if(sum <= 1000)
						isEureka[sum] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		preprocess();
		
		while(T-- > 0 ) {
			int K = Integer.parseInt(br.readLine());		
			bw.write(isEureka[K] ? "1\n" :"0\n");
		}
		bw.flush();
	}
}

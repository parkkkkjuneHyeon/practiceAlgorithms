package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Back10158 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String[] str = br.readLine().split(" ");
		int w = Integer.parseInt(str[0]);
		int h = Integer.parseInt(str[1]);
		str = br.readLine().split(" ");
		int startW = Integer.parseInt(str[0]);
		int startH = Integer.parseInt(str[1]);
		int times = Integer.parseInt(br.readLine());
		
		int wt = startW+times;
		int ht = startH+times;
		int answerW = (wt/w)%2 != 0 ? w-wt%w : wt%w;
		int answerH = (ht/h)%2 != 0 ? h-ht%h : ht%h;

		System.out.println(answerW +" "+ answerH);

	}

}

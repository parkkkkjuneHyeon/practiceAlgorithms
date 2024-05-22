package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Back13223 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\javastudy\\javaspace\\algorithms\\backText.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String[] currentTime = br.readLine().replaceAll(":", ",").split(",");
		String[] needTime = br.readLine().replaceAll(":", ",").split(",");
		ArrayList<Integer> curInt = new ArrayList<>();
	    	ArrayList<Integer> needInt = new ArrayList<>();
		for(int i=0; i<currentTime.length; i++) {
            	curInt.add(Integer.parseInt(currentTime[i]));
            	needInt.add(Integer.parseInt(needTime[i]));
        }

		
		int needSeconds = needInt.get(0) * 3600 + needInt.get(1)*60 + needInt.get(2);
		int curSeconds = curInt.get(0) * 3600 + curInt.get(1)*60 + curInt.get(2);
		int dropSeconds = needSeconds - curSeconds;
		if(dropSeconds <= 0) {
			dropSeconds += 24 * 3600;
		}
		System.out.printf("%02d:%02d:%02d",dropSeconds / 3600,(dropSeconds % 3600) / 60,dropSeconds % 60);
	}
}

//
//20:00:00
//04:00:00
//
//12:34:56
//14:36:22

package project1fall;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;  

public class project1 {
	//public static String filename = "input.txt";

	//using TextFileInput
/*	public static void read_from_file(String file) {
		TextFileInput input = new TextFileInput(file);
		ArrayList<Candle>candles = new ArrayList<Candle>();
		String line = input.readLine();
		StringTokenizer st = new StringTokenizer(line,",");
		
		while(line != null) {
			int num1,num2;
			int n =3;
			float f;
			num1 = Integer.parseInt(st.nextToken(","));
			num2 = Integer.parseInt(st.nextToken(","));
			f    = Float.parseFloat(st.nextToken());
			
			candles.add(new Candle(num1,num2,f));
			line = input.readLine();
		}
		CandleGUI gui = new CandleGUI(candles);
	}
*/	
	//using bufferedReader
	public static void read_from_file_buffer(File file)throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<Candle>candles = new ArrayList<Candle>();
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line,",");
		
		while(line != null) {
			String l[] = new String[3];
			//int num1,num2;
			//float f;
			int comma = st.countTokens();
			for(int i = 0; i<comma; i++) {
				l[i] = st.nextToken(",");
			}
			//num1 = Integer.parseInt(st.nextToken(","));
			//num2 = Integer.parseInt(st.nextToken(","));
			//f    = Float.parseFloat(st.nextToken());
			
			//candles.add(new Candle(num1,num2,f));
			candles.add(new Candle(l[0],l[1],l[2]));
			line = br.readLine();
		}
		CandleGUI gui = new CandleGUI(candles);
		br.close();
	}
	
	public static void main(String[] args) throws Exception{
		File f = new File("C:\\Users\\kevin95822\\Desktop\\2019 cs212 fall\\project01\\input.txt");
		read_from_file_buffer(f);
	}
}

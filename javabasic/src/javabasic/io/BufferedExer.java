package javabasic.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedExer {
	public static void main(String[] args) {
		
		File flie = new File("D:\\embeded\\note\\text.txt");
		BufferedReader br = null;
		try {			
		br= new BufferedReader(new FileReader(flie));
		String lineStr = null;
		while((lineStr = br.readLine())!= null) {
			System.out.println(lineStr);
		}
		}catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}catch (IOException ex) {
				ex.printStackTrace();
		}
		
		
	}
}

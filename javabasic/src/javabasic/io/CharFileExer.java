package javabasic.io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFileExer {
public static void main(String[] args) {
		
		FileWriter fw= null;
		FileReader fr= null;
		FileWriter fw2= null;
		try {
			fw = new FileWriter("C:\\Users\\Administrator\\git\\Test\\javabasic\\src\\assets\\diary.txt");
			fr = new FileReader("C:\\Users\\Administrator\\git\\Test\\javabasic\\src\\assets\\diary.txt");
			fw2 = new FileWriter("C:\\Users\\Administrator\\git\\Test\\javabasic\\src\\assets\\diary_copy.txt");
	
			fw.write("5월 10일 일기\n\n오늘도 열심히 공부 했다\n내일도 온다");
			fw.flush();
			
			char[]readChars = new char[8];
			int readCount = 0;
			while((readCount = fr.read(readChars,0, readChars.length))>-1) {
				fw2.write(readChars, 0, readCount);
			}
			fw2.flush();
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();				
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}
			}
	}//main
}


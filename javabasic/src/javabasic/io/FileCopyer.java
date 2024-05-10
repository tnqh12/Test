/*IO 실습 1)
 * 
 * assets 폴더에 이미지파일 하나, 문자파일 하나를 준비
 * 
 * 1. 사용자에게 1또는 2를 입력받는다
 * 2. 사용자가 1을 입력하면 이미지파일을 복사해서 assets에 저장
 * 3. 사용자가 2를 입력하면 문자파일을 복사해서 assets에 저장
 * 파일명이 image.jpg > 복사한 파일명은 image_copy.jpg
 * 파일명이 text.txt > 복사한 파일명은 text_copy.txt
 * 
 * 
 */

package javabasic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyer {
	public static void main(String[] args) {
		FileInputStream fi=null;;
		FileOutputStream fo=null;
		FileWriter fw=null;
		FileWriter fw2=null;
		FileReader fr=null; 
	
		Scanner scanner= new Scanner(System.in);
		System.out.println("1이나 2를 입력해주세요");
		String inputValue = scanner.next();
		//이미지파일 복사
		if(inputValue.equals("1")) {
			try {
				fi = new FileInputStream("C:/Users/Administrator/git/Test/javabasic/src/assets/winter.jpg");
				fo = new FileOutputStream("C:/Users/Administrator/git/Test/javabasic/src/assets/winter_copy.jpg");
				
				byte[]copy = new byte[1024];
				while(true) {
					int readCount = fi.read(copy);
					fo.write(copy);
					int readBytesLeng = copy.length;
					if(readCount<readBytesLeng) {
						break;
					}
				}
			}catch (FileNotFoundException io) {
				io.printStackTrace();
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}finally {
				try {					
				fi.close();
				fo.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}	
		else if(inputValue.equals("2")) {
			//텍스트파일 복사
			try {				
			fw = new FileWriter("C:\\Users\\Administrator\\git\\Test\\javabasic\\src\\assets\\winter.txt");
			fr = new FileReader("C:\\Users\\Administrator\\git\\Test\\javabasic\\src\\assets\\winter.txt");
			fw2 = new FileWriter("C:\\Users\\Administrator\\git\\Test\\javabasic\\src\\assets\\winter_copy.txt");
			
			fw.write("여름이 온다\n\n더우니까 빨리 지나 갔으면 좋겠다\n겨울아 빨리 와라");
			fw.flush();
			char[]text =new char[8];
			int readCount = 0;
			while((readCount = fr.read(text,0, text.length))>-1) {
				fw2.write(text, 0, readCount);
			}
			fw2.flush();
			
			}catch (FileNotFoundException tt) {
				tt.printStackTrace();
			}catch (IOException tx) {
				tx.printStackTrace();
			}finally {
				try {	
				fw.close();
				fr.close();
				}catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			

		}
		

	}
}

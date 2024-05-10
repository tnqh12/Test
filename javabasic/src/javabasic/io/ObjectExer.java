package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectExer {
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 20, "123456-123456");
		Person kang = new Person("강감찬", 30, "987654-198765");
		
		File file = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			file = new File("D:\\embeded\\note\\text.txt");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(hong);
			oos.writeObject(kang);
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			Object hongObj = ois.readObject();
			Object kangObj = ois.readObject();
			
			Person readHong = (Person)hongObj;
			Person readKang = (Person)kangObj;	
			System.out.println(readHong);
			System.out.println(readKang);
			
		}catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}
}

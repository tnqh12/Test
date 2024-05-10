package javabasic.io;

import java.io.File;

public class FileExer {
	public static void main(String[] args) {
		
		File root = new File("C:\\Users");
		File[] subArr = root.listFiles();
		printList(subArr);
		
	}//main
	static void printList(File[]subArr) {
		for (File subFile: subArr) {
			if(subFile.isDirectory()) {
				System.out.println("[D]"+subFile.getName());
				printList(subFile.listFiles());
			}
			System.out.println(subFile.getName());
		}
	}
	
}

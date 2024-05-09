package javabasic;

import java.io.PrintStream;

import javabasic.oop.Printer;

public class LambdaExer {
	public static void main(String[] args) {
		
		//PrintStr("Helo");
		//str -> System.outprintln(str);
		
		System.out.println(add(10,20));
		//(x,y) -> x + y;
		
		printStr2("Hi", "There");
//		(str1, str2)-> {
//			System.out.println(str1);
//			System.out.println(str2);
//		}
		
		
		
	}//main
	static void printStr(String str) {
		System.out.println(str);
	}
	static int add(int x, int y) {
		return x + y;
	}
	static void printStr2(String str1,String str2) {
		System.out.println(str1);
		System.out.println(str2);
	}

}
package javabasic;

import java.util.Stack;

public class ExceptionTest {
	public static void main(String[] args) {
		int i = devide();
	}
		
	static int devide() {
		int result = 0;
		try {
			result = 100/0;
			int[] intArray = {1,2,3,4,5};
			intArray[5] = 6;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
//		catch(ArithmeticException ae) {
//			System.out.println(ae.getMessage());
//			ae.printStackTrace();
//		}catch(IndexOutOfBoundsException ioode) {
//		System.out.println(ioode.getMessage());
//		ioode.printStackTrace();
//		}
		finally {
			System.out.println("예외 발생여부와 상관없이 실행");
		}//main
		return result;
	
	
	}
}

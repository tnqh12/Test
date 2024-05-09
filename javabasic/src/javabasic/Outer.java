package javabasic;

public class Outer {
	
	static String outerSStr = "outer static String";
		   String outerNStr = "outer non-static String";
	
	
	//non-static inner class
	class NSInner{
		static String sninnerSStr = "sninner static String";
		   String sninnerNStr = "sninner non-static String";	
		   String getOuerS() {
			   return outerSStr;
		   }
		   String getOuerNS() {
			   return outerNStr;
		   }
		
	}

	//static inner class
	static class SInner{
		static String sninnerSStr = "sninner static String";
		String sninnerNStr = "sninner non-static String";	
		String getOuerS() {
			return outerSStr;
		}
		//non static 메서드는 static 클래스 안에 선언 할 수 없음 : 시점의 차이
//		String getOuerNS() {
//			return outerNStr;
//		}
		
	}
	
	public int add(int a, int b) {		
		//local inner class
		//add 메서드의 지역변수 위상
		class LInner{
			static String sninnerSStr = "sninner static String";
			String sninnerNStr = "sninner non-static String";	
		}
		return a+b;
	}
	
	
}

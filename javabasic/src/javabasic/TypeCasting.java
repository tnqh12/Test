package javabasic;

public class TypeCasting {
	public static void main(String[] args) {
		
		// 기본타입의 형변환에서 표현범위가 작은타입에서 큰타입으로의 형변환은 묵시적(자동)
		byte b = 100;
		int i = b;
		
		// 기본타입의 형변환에서 표현범위가 큰타입에서 작은타입으로의 형변환은 명시적(강제)
		int i2 = 2100000000;
		byte b2 = (byte)i2;
		
		System.out.println(i);	//데이터 무손실
		System.out.println(b2);	//데이터 손실
		
//		boolean 타입은 어떤 타입과도 변환이 안된다
//		boolean bool = true;
//		int i3 = bool;
	}

}

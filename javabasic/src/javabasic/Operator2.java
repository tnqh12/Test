package javabasic;

public class Operator2 {
	public static void main(String[] args) {
		
		int i = 5;
		int j = 5;
		
		//두 수를 합해서 출력
		System.out.println(i+j);
		
		//두 수 중에서 큰수를 출력 
		System.out.println(i > j ? i : j == i  ? "숫자가 같습니다" : j );
	}
}

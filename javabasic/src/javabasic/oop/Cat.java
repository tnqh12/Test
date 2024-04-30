package javabasic.oop;

public class Cat {
	
	static int objCount =0;

	String name; 	//""로 자동 초기화
	String color;	//""로 자동 초기화
	String species;	//""로 자동 초기화
	int	   age;		//0으로 자동 초기화
	
	static int getObjCount() {
		return objCount;
	}
	
	void moves() {
		System.out.println(this.name+"가 뛰어 다닌다");
	}
	
	void hunt() {
		System.out.println(this.name+"가 쥐를 잡는다");
	}
	void sleep() {
		System.out.println(this.name+"가 낮잠을 잔다");
	}
	
}

package javabasic.oop;

public class Car {
	
	//클래스의 데이터 = 객체들의 공유 = 정적 맴버변수 (static member variable)
	static int carCount = 0;
	
	
	//객체의 데이터 = 멤버변수(member variable)
	String mfName;		//제조사
	String carName; 	//이름
	String color;		//색상
	int tireCount;	//타이어 수
	
	//클래스의 메서드 = 객체 없이 호출해서 사용할수있는 메서드
	//정적 멤버 메서드 (static member method)
	static int getCarCount() {
		return carCount;
	}
	
	//객체의 기능 = 멤버 메서드(member method)
	//this : 메모리에서 참조되는 객체 자신을 가리키는 키워드
	void startCar() {
		System.out.println(this.carName+"자동차 출발");
	}
	void stopCar() {
		System.out.println(this.carName+"자동차 정지");
	}
	void accelCar(){
		System.out.println(this.carName+"자동차 가속");
	}
	void breakCar(){
		System.out.println(this.carName+"자동차 감속");
	}
	
	

}

package javabasic.oop;

public class CarMain {
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.mfName="현대";
		car1.carName="소나타";
		car1.color="빨간색";
		car1.tireCount= 4;
		
		car1.carCount =1;
		
		System.out.println(car1.mfName+"에서 만든 "+car1.carName
				+"는 "+car1.color+"색이며 타이어수는"+car1.tireCount+"개 이다");
		
		car1.carName="그랜져";
		
		car1.startCar();
		car1.stopCar();
		car1.accelCar();
		car1.breakCar();
		
		Car car2 = new Car();
		car2.mfName="기아";
		car2.carName="소렌토";
		car2.color="백";
		car2.tireCount= 4;
		
		car2.carCount =2;
		
		car2.startCar();
		car2.stopCar();
		car2.accelCar();
		car2.breakCar();

		//해쉬코드(참조) 값이 같다는건 같은 메모리에있다는 뜻이고
		//메모리에 같은 곳에 있다는 것은 같은 객체라는 뜻이다
		System.out.println("car1에 저장되어있는 참조값: "+car1.hashCode());
		System.out.println("car2에 저장되어있는 참조값: "+car2.hashCode());
		Car car3 = new Car();
		System.out.println("car3에 저장되어있는 참조값: "+car3.hashCode());
		
		car3.carCount =3;
		
		
		Car car4 =new Car();
		car4.carCount =4;
		
		System.out.println(car3.equals(car4));
		System.out.println(Car.carCount);
		
		
//		non static (static) o
//		static (non static) x
		
		System.out.println(Car.getCarCount());
		System.out.println(car1.getCarCount());
		System.out.println(car2.getCarCount());
		System.out.println(car3.getCarCount());
		System.out.println(car4.getCarCount());
		
	}//main
}//class

package javabasic.oop;

public class CatMain {
	public static void main(String[] args) {
		
		//Cat 타입의 객체 4개 설정
		Cat cat1 =new Cat(); 
		Cat cat2 =new Cat(); 
		Cat cat3 =new Cat();
		
		
		//객체 데이터 설정
		cat1.name="나비";
		cat1.color="삼색";
		cat1.species="칼리코";
		cat1.age= 4;
		
		cat2.name="검둥이";
		cat2.color="검정";
		cat2.species="봄베이";
		cat2.age= 3;
		
		cat3.name="춘식이";
		cat3.color="노란색";
		cat3.species="스코티쉬 폴드";
		cat3.age= 1;

		//객체 데이터 출력
		System.out.println(cat1.name+"의 나이는"+cat1.age+"살 이고 "
				+"털 색은 "+cat1.color+"이고 종은 "+cat1.species+"다");
		System.out.println(cat2.name+"의 나이는"+cat2.age+"살 이고 "
				+"털 색은 "+cat2.color+"이고 종은 "+cat2.species+"다");
		System.out.println(cat3.name+"의 나이는"+cat3.age+"살 이고 "
				+"털 색은 "+cat3.color+"이고 종은 "+cat3.species+"다");
		
		//객체 메서드 호출
		cat1.moves();
		cat1.moves();
		cat1.hunt();
		cat1.moves();
		cat1.hunt();
		cat1.sleep();
		
		
		//생성된 객체 수
		System.out.println("총"+Cat.objCount+"개의 객체 생성됨");
		System.out.println("총"+Cat.getObjCount()+"개의 객체 생성됨");

	
	
	
	
	
	}
}

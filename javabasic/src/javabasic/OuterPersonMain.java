package javabasic;

public class OuterPersonMain {

	public static void main(String[] args) {

		//익명 내부 클래스
		//일반적으로 이벤트핸들러 메서드를 오버라이딩할 목적으로 사용됨
		OuterPerson outerPerson =new OuterPerson() {
			@Override
			public String getName() {
				return "outerPerson의 getName오버라이딩";
				}
		};
		
		System.out.println(outerPerson.getName());
		
	}

}

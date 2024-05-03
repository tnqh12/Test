package javabasic.oop.animal;

import java.util.ArrayList;
import java.util.List;

public class LifeMain {

	public static void main(String[] args) {
		
		ILife dog=new Dog("말티즈");
		ILife cat=new Cat("러시안 고양이");
		ILife rose=new Rose("백장미");
		ILife lily=new Lily("홍장미");
		
		//개를 숨쉬게 만들자
		dog.breath();
		
		
		//장미를 광합성
		//방법1 : 형변환 이용 
		//((IPlant)rose).light();               
				
		//방법2 : 인터페이스 분리
		
		cat.breath();
		rose.light();
		lily.light();
		
		
	}

}

/*
예외처리 실습

보험사고 발생시에 사고별 대응 하는 프로그램
	
	1. 사고 유형 : 정면 충돌 사고, 후면 충돌 사고, 접촉 사고
	2. 정면 충돌시에는 경찰서와 199 구급대 연락
	3. 후면 충돌사고시에는 보험직원을 파견
	4. 접촉 사고시에는 보험자 가입자와 전화 상담
	5. 뺑소니 사고시에는 경찰서에 대리전화  : 11
	
	
	사용자 정의 예외를 생성하서 예외 처리를 통해서 구현
	
	정면 충돌사고 : 후면 충돌사고 : 접촉사고 비율은 1:3:6
	1:정면 2~4:후면 5~10:접촉
	

*/



package javabasic;

public class ExcrptionExer {
	
	public static final String FRONT_ACC ="정면충돌";
	public static final String BACK_ACC ="후면충돌";
	public static final String CONT_ACC ="접촉사고";
	
	public static void main(String[] args) {
		
	int acc = 0;
	for(int i=0; i<10;i++) {
		acc = (int)(Math.random()*11)+1;
//	if(acc==1) {
//		try {
//		throw new FrontException();
//		}catch(FrontException fe) {
//			System.out.println(fe.getMessage()+" 정면충돌 처리 완료");
//		}
//	}else if(acc>=2 && acc<=6) {
//		try {
//			throw new BackException();
//		}catch(BackException be) {
//			System.out.println(be.getMessage()+" 후면충돌 처리 완료");
//		}
//	}else if(acc==11){
//		try {
//			throw new HitException();
//		}catch(HitException he) {
//			System.out.println(he.getMessage()+" 뺑소니 처리 완료");
//		}
//	
//	}else {
//		try {
//			throw new ContException();
//		}catch(ContException ce) {
//			System.out.println(ce.getMessage()+" 접촉사고 처리 완료");
//		}
//	}
	try {
		if (acc == 1) {
			throw new FrontException();
		} else if (acc >= 2 && acc <= 6) {
			throw new BackException();
		} else if (acc == 11) {
			throw new HitException();
		} else {
			throw new ContException();
		}
	} catch (Exception ex) {
		String msg ="";
		if(ex instanceof FrontException) {
			msg= " 정면충돌 처리 완료";
		}
		if(ex instanceof BackException) {
			msg= " 후면충돌 처리 완료";
		}
		if(ex instanceof HitException) {
			msg=" 뺑소니 처리 완료";
		}
		if(ex instanceof FrontException) {
			msg= " 접촉사고 처리 완료";
		}
		System.out.println(ex.getMessage()+msg);
	}
	}
}
}

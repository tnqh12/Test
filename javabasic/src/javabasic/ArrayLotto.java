
/*개인과제
	과제명 : 배열로또
	마감 5/6
	과제: 배열이용 로또645프로그램작성
	
	프로세스
	1.프로그램 시작시 사용자에게 7개의 서로다른 1~45사이의 숫자를 입력 받는다
	
	2.프로그램에서 랜덤한 숫자를 순서대로 7개 추출
	3.등수산정
	-프로그램에서 추출한 앞숫자 6개와 사용자가 입력한 순서대로 6개가 일치하면 1등
	-프로그램에서 추출한 앞숫자 6개와 사용자가 입력한 순서대로 5개가 일치하고 보너스 숫자(맨마지막 입력)이 일치하면 2등
	-프로그램에서 추출한 숫자 5개와 사용자가 입력한 순서대로 5개가 일치하면 3등
	-프로그램에서 추출한 숫자 4개와 사용자가 입력한 순서대로 4개가 일치하면 4등
	-프로그램에서 추출한 숫자 3개와 사용자가 입력한 순서대로 3개가 일치하면 5등
	-나머지는 꽝 다음 기회에

	4.예시)
	-사용자가 1 1 2 3 4 5 6입력시 => 중복숫자가 있습니다 다시입력해 주세요!
	-사용자가 1 2 3 4 5 6 7입력하고 프로그램에서 랜덤 추출한 숫자가 1 2 3 4 5 6 8 1등
	-사용자가 1 2 3 4 5 6 7입력하고 프로그램에서 랜덤 추출한 숫자가 1 2 3 4 5 30 7 2등
	-사용자가 1 2 3 4 5 6 7입력하고 프로그램에서 랜덤 추출한 숫자가 1 2 3 4 5 32 33 3등
	-사용자가 1 2 3 4 5 6 7입력하고 프로그램에서 랜덤 추출한 숫자가 1 2 3 4 31 32 33 4등
	-사용자가 1 2 3 4 5 6 7입력하고 프로그램에서 랜덤 추출한 숫자가 1 2 3 30 31 32 33 5등
	-사용자가 1 2 3 4 5 6 7입력하고 프로그램에서 랜덤 추출한 숫자가 1 2 29 30 31 32 33 5등
	
	5.주요 고려상황
	-사용자가 입력한 7개의 숫자에 중복이 있는지 체크. 중복이 있다면 다시 입력 받도록 
	-프로그램에서 랜덤하게 생성한 7개의 숫자에 중복이 있어야한다.
	-사용자 입력 수와 랜덤 수와 비교해서 등수 연산후 출력
	
	6. 과제 제출방법
	-소스코드(java 파일)와 실행결과 캡쳐 이미지 압축해서 realchoky@naver.com으로 이름 써서 제출
	 

*/
package javabasic;

import java.util.Random;
import java.util.Scanner;

public class ArrayLotto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("-----로또-----");
		System.out.println("7개의 서로다른 1~45사이의 숫자를 입력하세요");
		int[] lotto = new int[7];

		String breakO = "X";
		// ArrayExer2의 실습 2를 활용
		for (int o = 0; o < 7; o++) {
			lotto[o] = scanner.nextInt();
			if (lotto[o] <= 45 && lotto[o] > 0) {
				for (int i = 0; i < o; i++) {
					if (lotto[o] == lotto[i]) {
						System.out.println("똑같은숫자를 입력 하였습니다.");
						breakO = "O";
						break;
					}
				}
				if (breakO == "O")
					break;
			} else {
				System.out.println("잘못 입력 하였습니다.");
				break;
			}
		}
		// StringExer의 33번째 코드를 활용
		for (int lottos : lotto) {
			System.out.print(lottos + " ");
		}
		System.out.println("\n");
		System.out.print("로또번호는 >>>");
		// 2.프로그램에서 랜덤한 숫자를 순서대로 7개 추출
		// Math.random():0.0<=랜덤실수<1.0
		//ArrayExer2 실습 1를 활용
		int[] lottoNumber = new int[7];
		for (int t = 0; t < 7; t++) {
			lottoNumber[t] = (int) (Math.random() * 45) + 1;
			for (int h = 0; h < t; h++) {
				if (lottoNumber[t] == lottoNumber[h]) {
					--t;
				}
			}
		}
		for (int lottoNumbers : lottoNumber) {
			System.out.print(lottoNumbers + " ");
		}
		System.out.println("\n");
		
		
		int nember = 0;
		int bonus = lotto[6];
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(lotto[i]==lottoNumber[j]) {
					nember++;
				}
			}
		}
			if(nember==6) {
				System.out.println("축하 합니다!! 1등 입니다!!");
			}else if(nember==5 && bonus==lottoNumber[6]) {
				System.out.println("축하합니다!! 2등입니다!!");
			}else if(nember==5) {
				System.out.println("축하합니다! 3등입니다!");
			}else if(nember==4) {
				System.out.println("아깝게도 4등입니다");
			}else if(nember==3) {
				System.out.println("아쉽네요 5등입니다");
			}else{
				System.out.println("*꽝* 다시 도전해보세요");
		}
		
	}//main
}//class

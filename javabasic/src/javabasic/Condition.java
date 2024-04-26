package javabasic;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 10;

		if (i > 10) {
			System.out.println("i가 10보다 큽니다");
		} else if (i == 10) {
			System.out.println("i가 10이랑 같습니다");
		} else {
			System.out.println("i가 10보다 작습니다");
		}

		int j = 1;

		switch (j) {

		case 1:
			System.out.println("남성입니다");
			break;
		case 2:
			System.out.println("여성입니다");
			break;
		default:
			System.out.println("남성도 여성도 아닙니다");
		}

		System.out.print("숫자 입력 >> ");
		int g = sc.nextInt();
		if (g != 1) {
			System.out.println("남성입니다");
		} else if (g == 2) {
			System.out.println("여성입니다");
		} else if (g >= 3) {
			System.out.println("중성입니다");
		} else {
			System.out.println("남성도 여성도 아닙니다");
		}

		// 실습1
		// 두개의 int변수를 만들어 각각 5와 10의 값을 대입하고
		// 두 변수의 합을 sum이라는 byte변수에 저장한 후
		// sum변수 값이 10보다 큰지 비교하여 출력

		int h = 5;
		int l = 10;

		byte sum = (byte) (h + l);
		System.out.printf("두합의크기가 10보다 %s\n", sum > 10 ? "크다" : sum == 10 ? "같다" : "작다");

		// 실습2
		// num3이라는 int변수에는 5를 대입하고
		// num4이라는 int변수에는 10를 대입하고
		// sum2에 두변수의 합을 대입
		// mul에는 두변의 곱을 대입
		// 두변수의 곱에서 두 변수의 합을 뺀 값을 result라는 short에 저장
		// result가 0~10사이에 있는지 , 11~ 20사이에 있는지
		// 21사이에서 30 사이에있는지 ,31~40사이에 있는지 출력

		int num3 = 5;
		int num4 = 10;
		int sum2 = num3 + num4;
		int mul = num3 * num4;

		short result = (short) (mul - sum2);

		if (result < 0) {
			System.out.println("음수 입니다");
		} else if (result <= 10) {
			System.out.println("0~10사이에 있습니다");
		} else if (result <= 20) {
			System.out.println("11~20사이에 있습니다");
		} else if (result <= 30) {
			System.out.println("21~30사이에 있습니다");
		} else if (result <= 40) {
			System.out.println("31~40사이에 있습니다");
		} else {
			System.out.println("범위 밖에 있습니다");
		}

		// 실습 3
		// 키보드에서 숫자 하나를 입력 받아서 입력받은 숫자를 5로 나눈 나머지를 출력
		System.out.print("숫자를 입력>> ");
		int num1 = sc.nextInt();

		System.out.printf("5로 나눈 값은 %d입니다\n", num1 % 5);

		// 실습4
		// 키보드에서 숫자 2개를 입력 받아서 입력받은 두 수의 합을 출력
		System.out.println("숫자1번째과 2번째입력 >> ");
		int numb1 = sc.nextInt();
		int numb2 = sc.nextInt();

		System.out.printf("두수의 값은%d입니다\n", numb1 + numb2);

		// 실습5
		// 키보드에서 0~6까지의 숫자를 입력 받아서 0이면 일요일 1이면 월요일 출력
		System.out.print("요일 숫자 입력 >>>");
		int n1 = sc.nextInt();

		switch (n1) {

		case 0:
			System.out.println("월요일");
			break;
		case 1:
			System.out.println("화요일");
			break;
		case 2:
			System.out.println("수요일");
			break;
		case 3:
			System.out.println("목요일");
			break;
		case 4:
			System.out.println("금요일");
			break;
		case 5:
			System.out.println("토요일");
			break;
		case 6:
			System.out.println("일요일");
			break;
		default:
			System.out.println("요일 숫자가 아닙니다");
		}

	}// main
}// class

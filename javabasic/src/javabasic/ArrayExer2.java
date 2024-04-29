package javabasic;

public class ArrayExer2 {
	public static void main(String[] args) {
		//실습 1) 1~100까지의 정수를 배열에 담아 출력
		int[] i= new int[100];
		int in= i.length;
		for(int o=0; o<in;o++) {
			i[o]= o+1;
			System.out.println(i[o]);
		}
		//실습 2) 1~100까지의 정수중에서 홀수만 배열에 담아 출력
		for(int o=0; o<in; o+=2) {	
			i[o]= o+1;
			System.out.println(i[o]);
		}
		System.out.printf("%10d%10.2f%10s\n",9999,3.143245,"hello"+"\n");
		//실습 3) 아래 데이터로 2차원 배열을 만들어서 출력
//					이름	국어	영어	수학
//					홍길동100	 90	 80
//					강감찬 90  80  70
//					이순신 80  70 60
		String[] nameArr= {"홍길동","강감찬","이순신"};
		int[][] scoreArr={
			{100,90,80},
			{90,80,70},
			{80,70,60}
		};
		System.out.printf("%10s%10s%9s%9s","이름","국어","영어","수학");
		int nameArrLeng = nameArr.length;
		int scoreArrLeng = scoreArr.length;
		for(int h=0;h<nameArrLeng;h++) {
			System.out.printf("\n%10s",nameArr[h]);
			for(int j=0; j<scoreArrLeng;j++) {
				System.out.printf("%10s",scoreArr[h][j]);
			}
		}
		System.out.println();
		System.out.println();
		//실습 4) 개인별 / 과목별 총점과 평균을 실습 3)에 추가해서 출력
		
		String[] nameArr2= {"홍길동","강감찬","이순신"};
		int[][] scoreArr2={
			{100,90,80},
			{90,80,70},
			{80,70,60}
		};
		int[][]pAgg= {
				{0,0},//개인별 총점/평균
				{0,0},
				{0,0}
		};
		int[][]sAgg= {
				{0,0},//과목 총점/평균
				{0,0},
				{0,0}
		};
		
		System.out.printf("%10s%9s%10s%9s%9s%9s","이름","국어","영어","수학","총점","평균");
		int nameArrLeng2 = nameArr2.length;
		int scoreArrLeng2 = scoreArr2.length;
		for(int h=0; h<nameArrLeng2; h++) {
			System.out.printf("\n%10s",nameArr2[h]);
			for(int j=0; j<scoreArrLeng2;j++) {
				pAgg[h][0]+=scoreArr2[h][j];
				sAgg[j][0]+=scoreArr2[h][j];
				System.out.printf("%10d",scoreArr2[h][j]);
			}
			pAgg[h][1]=pAgg[h][0]/scoreArrLeng2;
			sAgg[h][1]=sAgg[h][0]/scoreArrLeng2;
			System.out.printf("%10d%10d",pAgg[h][0],pAgg[h][1]);
		}
		for(int h=0;h<scoreArrLeng;h++) {
			sAgg[h][1]=sAgg[h][0]/scoreArrLeng2;
		}
		
		int sAggLeng = sAgg[0].length;
		for(int h=0; h<sAggLeng;h++) {
			System.out.printf( "\n%10s",h == 0 ? "총점":"평균");
			for(int j=0;j<scoreArrLeng2;j++) {
				System.out.printf("%10d",sAgg[j][h]);
			}
		}
			System.out.println();
			
//for1 t니까 System.out.printf("\n%10s",홍길동)출력 다음
//for2 t라서 pAgg[h][0]+=scoreArr2[h][j]; (h==[0]) 
//			pAgg[h][0]= 첫번째 배열 1번째 위치에 scoreArr2[0][0]= '100 +됨'
//			sAgg[j][0]+=scoreArr2[h][j]; 이것도 비슷함
//			System.out.printf("%10d",100); 출력
//중괄호 만나서 for2로 돌아가 다시실행 이때 j는 1늘어남

			
		}
	}


package javabasic.oop.score;

public class StudentScoreMain {
	public static void main(String[] args) {
		
		StudentScore ss1 = new StudentScore("홍길동",100,90,70);
		StudentScore ss2 = new StudentScore("강감찬",90,80,60);
		StudentScore ss3 = new StudentScore("이순신",80,70,50);
		
		int hongsum= sumOfStudentScore(ss1);
		int gansum= sumOfStudentScore(ss2);
		int leesum= sumOfStudentScore(ss3);
		
		
		StudentScore[] ssArray = new StudentScore[3];
		ssArray[0] = ss1;
		ssArray[1] = ss2;
		ssArray[2] = ss3;
		
		int[] subSumArray = sumOfSubject(ssArray);
		
		System.out.println(ss1+ "\t"+hongsum+"\t"+hongsum/3);
		System.out.println(ss2+"\t"+gansum+"\t"+gansum/3);
		System.out.println(ss3+"\t"+leesum+"\t"+leesum/3);
		System.out.println("총점\t"+subSumArray[0]+"\t"+subSumArray[1]+"\t"+subSumArray[2]);
		System.out.println("평균\t"+subSumArray[0]/3+"\t"+subSumArray[1]/3+"\t"+subSumArray[2]/3);
		
	}//main
	
//	1.학생별 총점메서드
	static int sumOfStudentScore(StudentScore ss) {
		return ss.kor +ss.eng+ss.math;
	}
	
	
//	2.과목별 총점메서드
	static int[] sumOfSubject(StudentScore[]ssArray) {
		int[] sumArray = new int[3];
		for(StudentScore ss : ssArray) {
			sumArray[0]+=ss.kor;
			sumArray[1]+=ss.eng;
			sumArray[2]+=ss.math;
		}
		return sumArray;
	}
}

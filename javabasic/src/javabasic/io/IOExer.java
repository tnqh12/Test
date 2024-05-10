/*실습2)
 * 
 * 
 * 
 * 1.StuddentScore 데이터베이스 생성 (int sno, String name, int kor, int eng, int math, int total)
 * 2.IOExer에서 5개의 StudentScore 객체 생성후 assets/studentscore.dat에 작렬화
 * 3.직렬화된 객체를 역직렬화하여 학생성적 데이터 출력
 * 4. 출력시 과목별 총점s
 */



package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOExer {
	public static void main(String[] args) {
		
		List<StudentScore> ssList =new ArrayList<StudentScore>();
		ssList.add(new StudentScore(1, "홍길동", 90, 90, 90, 0));
		ssList.add(new StudentScore(2, "깡", 80, 80, 80, 0));
		ssList.add(new StudentScore(3, "퐁", 70, 70, 70, 0));
		ssList.add(new StudentScore(4, "치", 60, 60, 60, 0));
		ssList.add(new StudentScore(5, "역만", 50, 50, 50, 0));
		
		File file = null;
		FileInputStream fin = null;
		FileOutputStream fio = null;
		ObjectInputStream obi = null;
		ObjectOutputStream obo =null;
		
		try {
		file =new File("C:\\Users\\Administrator\\git\\Test\\javabasic\\src\\assets\\studentscore.dat");
		fio = new FileOutputStream(file);
		obo = new ObjectOutputStream(fio);
		obo.writeObject(ssList);
		
		fin = new FileInputStream(file);
		obi = new ObjectInputStream(fin);
		List<StudentScore> readList = (ArrayList<StudentScore>)obi.readObject();
		int korT =0;
		int engT =0;
		int mathT =0;
		for(StudentScore ss : readList) {
			ss.setTotal(0);
			korT+= ss.getKor();
			engT+= ss.getEng();
			mathT+= ss.getMath();
			System.out.println(ss);
		}
		
		System.out.println("국어 총점:"+korT +", 영어 총점:"+ engT+ ", 수학 총점:"+mathT);
		
		}catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
		}catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				obo.close();
				obi.close();
			}catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}

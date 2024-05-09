package javabasic;

public class AgeRestrictMain {
	public static void main(String[] args) {
		
		int age = 15;
		if(age<19) {
			try {
			throw new AgeRestrictExcrption();
		}catch (AgeRestrictExcrption are) {
			are.printStackTrace();
		}
		}	
	}
}

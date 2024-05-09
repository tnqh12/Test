package javabasic;

public class AgeRestrictExcrption extends RuntimeException {

		@Override
		public String getMessage() {
			return "연령제한예외 발생";
		}
	
	
}

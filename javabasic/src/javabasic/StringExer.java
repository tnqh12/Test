package javabasic;

public class StringExer {

	public static void main(String[] args) {
		
		
		char[] charArray = {'안','녕','하','세','요'};
		String str2 =new String(charArray);
		
		System.out.println("안녕하세요");
		System.out.println(str2);
		
	//인덱스 = 0 ~ lenght-1
		String str3 = "Hello Java";//index 0~9, lenght10
		System.out.println(str3.charAt(0));//H
		System.out.println(str3.charAt(5));//공백
		System.out.println(str3.charAt(3));//l
		System.out.println(str3.length());//10
		
		//반복문을 사용해서 문자열의 문자 추출
		//성능이 좋은 코드를 위해서 동일한 결과를 내는 메소드(기능)은 한번만 수행해서 변수에
		//값을 담아두고 변수를 사용하는 것이 반복적으로 메소드를 호출하지 않는 좋은 코드
		int leng = str3.length();
		for (int i = 0; i < leng; i++) {
			System.out.print(str3.charAt(i));
		}
		
		
		//한번만 사용되는 변수는 생성하지 않는 것이 좋은 코드
		
		//for: 구문을 사용해서 배열의 요소(element)들을 출력
		for(char ch:charArray) {
			System.out.println(ch);
		}
		
		//문자열 조작
		String str5= "안";
		String str6= "녕";
		String str7= "하";
		String str8= "세";
		String str9= "요";
		System.out.println(str5+str6+str7+str8+str9);
		
		//문자열은 불변이므로 문자열에 접합연산(+)을 많이하면 불필요한
		//문자열들이 메모리에 생성됨
		//StringBuffer 또는 StringBuilder를 사용해서 문자열을 조작작업을
		//버퍼상에서 진행하고 최종적으로 문자열을 한번만 생성한다.
		StringBuilder sb = new StringBuilder();
		sb.append("안");
		sb.append("녕");
		sb.append("하");
		sb.append("세");
		sb.append("요");
		System.out.println(sb.toString());
		
		//String 주요 메소드
		String str10 ="동해물과 백두산이 마르고 닳도록";
		System.out.println(str10.charAt(5)); //백
		System.out.println(str10.contains("백두산")); //true
		System.out.println(str10.endsWith("하느님이"));//false
		byte[] byteArray = str10.getBytes();
		for(byte b : byteArray) {
			System.out.println((char)b);
		}
		System.out.println(str10.hashCode());
		System.out.println("동해물과 백두산이 마르고 닳도록".hashCode());
		System.out.println(str10.indexOf("산"));//7
		System.out.println(str10.indexOf("마르고")); //10
		System.out.println(str10.isEmpty());//false
		System.out.println(str10.lastIndexOf("도"));//15
		System.out.println(str10.length());//17
		System.out.println(str10.replace("백두산", "한라산"));
		System.out.println(str10.replace(" ", "-"));
		System.out.println(str10.replaceAll(" ", "-"));
		String[] strSplit = str10.split(" ");
		for(String str : strSplit) {
			System.out.print(str);
		}
		System.out.println();
		String str11= "         Hello          ";
		System.out.println(str11.trim());
		
		String exerStr= " Time is a kind friend, he will make us old 010/1234/5678 ";
		
		//실습 1> exerStr문자열 양쪽 공백 제거
		System.out.println(exerStr.trim());
		//실습 2> Time을 Gold로 변경해서 출력
		System.out.println(exerStr.replace("Time", "Gold"));
		//실습 3> 전화번호를 010-1234-5678로 변경해서 출력
		System.out.println("---------------------------------------");
		System.out.println(exerStr.replaceAll("/", "-"));
		System.out.println(exerStr.substring(exerStr.indexOf("0"), exerStr.indexOf("0")+13).replaceAll("/", "-"));
		System.out.println("---------------------------------------");
		
		//실습 4> exerStr문자열을 공백기준으로 분리해서 String[]로 출력
		String[] s = exerStr.split(" ");
		for(String n : s) {
			System.out.println(n);
		}
		//실습 5> exerStr문자열을 공백기준으로 분리해서 문자수가 3이상인 것들만 출력	
		String[] m = exerStr.split(" ");
		for(String n : m) {
			if(n.length()>=3)
			System.out.println(n);
		}
		System.out.println("---------------------------------------");
		//실습 6> i문자의 인덱스들을 출력
		int startIdx =0;
		for (int i =0; i<5; i++) {
			startIdx = exerStr.indexOf("i",startIdx+1);
			System.out.println(startIdx);
		}
		System.out.println("---------------------------------------");
		
		
		//실습 7> 전체 문자열을 소문자로 한번, 대문자로 한번 변경해서 출력
		System.out.println(exerStr.toLowerCase());
		System.out.println(exerStr.toUpperCase());
		
	}

}

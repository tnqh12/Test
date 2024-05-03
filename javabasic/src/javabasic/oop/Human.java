package javabasic.oop;

class Human {
	
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name =name;
		this.age = age;
	}

	//getter (get + 변수명 대문자 시작)
	public String getName() {
		return name;
	}//private을 사용할수 있게 해줌

	
	//setter (set + 대문자 시작 변수명)
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age + 15;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	



	
}

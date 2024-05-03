package javabasic.oop;

public class Child extends Parent{
	
	String name;
	int age;
	String jod;
	
	Child() {
	}
	
	Child(String name, int age, String jod){
		super(name, age, jod);
		this.name = name;
		this.age = age;
		this.jod = jod;
		
	}
	@Override
	void say() {
		System.out.println("자식이 말했다");
	}

}

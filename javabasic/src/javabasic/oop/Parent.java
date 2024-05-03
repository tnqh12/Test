package javabasic.oop;
					//extends(확장)
public class Parent extends GrandParent{
	
	String name;
	int age;
	String jod;

	Parent(){
	}
	
	
	Parent(String name, int age, String jod){
		this.name = name;
		this.age = age;
		this.jod = jod;
		
	}
	@Override
	void say() {
		System.out.println("아버님이 말씀하셨다");
	}
	
}

package javabasic.oop.art;

public abstract class AbstractArt implements IArt {

	String name;
	@Override
	public void making() {
		System.out.println(name+"를 만들고 있다");
	}
	@Override
	public void evaluating() {
		System.out.println(name+"를 평가하고 있다");
	}

	@Override
	public void watching() {
		System.out.println(name+"를 보고 있다");

	}
}

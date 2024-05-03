package javabasic.oop.animal;

public abstract class AbstactAnimal implements IAnimal {

	String name;

	@Override
	public void growht() {
		System.out.println(name + "가 성장한다");
	}

	@Override
	public void breath() {
		System.out.println(name + "가 숨을 쉰다");

	}

	@Override
	public void eat() {
		System.out.println(name + "가 먹는다");
	}

	@Override
	public void move() {
		System.out.println(name + "가 움직인다");

	}

	@Override
	public void light() {
	}

}

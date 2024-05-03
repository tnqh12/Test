package javabasic.oop.animal;

public abstract class AbstactPlant implements ILife {

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
	public void light() {
		System.out.println(name + "가 광합성을 한다");
	}

}

package javabasic.oop.art;

public class Drowing extends AbstractArt {

	Drowing(String name) {
		this.name = name;
	}

	public void draw() {
		System.out.println(name + "를 그리고있다");
	}

	@Override
	public void play() {
	};

	@Override
	public void listen() {
	};
}

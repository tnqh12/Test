package javabasic.oop.art;

public class Music extends AbstractArt {

	Music(String name) {
		this.name = name;
	}

	public void listen() {
		System.out.println(name + "를 듣고있다");
	}

	@Override
	public void play() {
	};

	@Override
	public void draw() {
	};
}

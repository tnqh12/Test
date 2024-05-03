package javabasic.oop.art;

public class Movie extends AbstractArt {

	Movie(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println(name + " 영화가 재생하고 있다");
	}

	@Override
	public void listen() {
	};

	@Override
	public void draw() {
	};

}

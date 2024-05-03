package javabasic.oop.art;

public class ArtMain {
	public static void main(String[] args) {
			
		IArt drowing=new Drowing("모나리자");
		IArt music=new Music("베텔기우스");
		IArt movie=new Movie("범죄도시");
		
		movie.making();
		music.evaluating();
		drowing.watching();
		
		System.out.println();
		
		movie.play();
		music.listen();
		drowing.draw();
		
	}//main

}

package javabasic;

public class OuterMain {
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		Outer.NSInner nsinner = outer.new NSInner ();
		System.out.println(nsinner.sninnerSStr);
		System.out.println(nsinner.sninnerNStr);
		
		Outer.SInner sinner =new Outer.SInner();
		System.out.println(sinner.sninnerSStr);
		System.out.println(sinner.sninnerNStr);
	}
}

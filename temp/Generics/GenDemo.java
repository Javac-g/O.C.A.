package Generics;
public class GenDemo{

	public static void main(String...args){
		Gen<String> one = new Gen("Hello");
		Gen<Integer> two = new Gen(1934);

		System.out.println("A: " + one.getT() );
		System.out.println("B: " + two.getT());
	}
}
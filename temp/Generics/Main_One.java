package Generics;
public class Main_One{

	public static void main(String...args){

		Generic<Integer> one = new Generic<>(1432);
		//Generics working only with Refference typy
		//Cant be Generic<int> one
		Generic<String> two = new Generic<>("Hello");

		one.show();
		two.show();
		//Type security dont allow next
		// one = two , Both belong to Generic<T>
		//but have different <T>
		int first = one.getT();
		String second = two.getT();

		System.out.println("First value: " + first);
		System.out.println("Second value: " + second);
		//Gen vs Object

		NonGen iob = new NonGen(121212);
		iob.show();
		int v = (Integer)iob.getO();
		System.out.println("Value: " + v);

		NonGen strob = new NonGen("Max");
		strob.show();
		String str = (String)strob.getO();
		System.out.println("Value: " + str);
	}
}
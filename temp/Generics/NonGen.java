package Generics;
public class NonGen{

	private Object o;

	public NonGen(Object o){
		this.o = o;

	}
	public Object getO(){
		return o;
	}

	public void show(){
		System.out.println(o.getClass().getSimpleName());
	}
}
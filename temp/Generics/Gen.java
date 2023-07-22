package Generics;
public class Gen<T>{
	private T t;

	public Gen(T t){
		this.t = t;
	}

	public T getT(){
		return t;
	}

}
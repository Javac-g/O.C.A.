package Generics;

public class Generic<T>{
	private final T t;
	// Cant create instanse of generic 
	//Cant be T t = new T();
	public Generic(T t){
		this.t = t;
	}

	public T getT(){
		return t;
	}

	public void show(){
		System.out.println(t.getClass().getSimpleName());
	}
}
package Generics;
import java.util.*;

public class Demo{
	public static void run(String[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length;i++ ) {
			System.out.print(arr[i]);
			if (i < arr.length) {
				System.out.print(",");
			}
		}
		System.out.println("]");

	}
	public static <T> void run(List<T> list){
		System.out.println(list);
	}
	public static void first(){
		List<String> list = Arrays.asList("Fluffy","Webby");
		String[] array = new String[list.size()];
		for (int i = 0 ; i < array.length; i++ ) {
			array[i] = list.get(i);
			System.out.print(array[i] + " ");

		}


	}
	public static void second(){
		String[] array = {"zero","one","two","three","four"};
		List<String> list = Arrays.asList(array);
		String[] array2 =  list.toArray(new String[0]);
		array[0] = "New";
		run(list);
		list.set(1,"Test");
		run(array2);

	}
	public static void main(String...args){

		first();
		second();

	}


}
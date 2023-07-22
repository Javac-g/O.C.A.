package Generics;
import java.util.*;

public class Sort{


	public static void run(int[] arr){
		for (int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String...args){



		int[] prim = {1,5,2,8,3};
		Arrays.sort(prim);
		run(prim);
		System.out.println(Arrays.binarySearch(prim,7));//print -5
		System.out.println(Arrays.binarySearch(prim,2));

		List<Integer> list =  Arrays.asList(8,1,3,9,5,2);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list,5));
		System.out.println(Collections.binarySearch(list,4));
	}
}
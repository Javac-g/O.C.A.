package package_c;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Arr{

	public static void main(String...args){
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList<String> list3 = new ArrayList<>();
		List<String> birds = new ArrayList<>();
		


		list.add(1);
		list.add("Max");
		list.add(Boolean.TRUE);

		System.out.println(list);

		birds.add("Eager");
		birds.add(0,"Hawk");
		birds.add(0,"woodpecker");
		birds.add(2,"Raven");

		String first = birds.set(0,"Duck");
		String second =birds.set(2,"Kolibri");

		System.out.println("Was replaced: " + first + ", " + second);

		boolean added = birds.add("Mockingbird");

		List<String> copyB = new ArrayList<>(birds);
		System.out.println("Contains Duck: "+ birds.contains("Duck"));
		System.out.println("Birds equals copyB: " + birds.equals(copyB));//must be same elements in same order
		System.out.println(birds);
		System.out.println("Boolean return add: " + added);
		System.out.println("Birds copy: " + copyB);

		List<Integer> nums = Arrays.asList(1,5,9,4,2,7,8);
		Integer i = nums.remove(2); // will remove third element 0 , 1, [2]
		//autoboxing not worked here, will be called E remove(int index);

		boolean b = nums.remove(new Integer(2));// will call boolean remove(Object ob);

		System.out.println("Was removed element N: " + i);
		System.out.println("Was removed number 2: " + b);





	}
}
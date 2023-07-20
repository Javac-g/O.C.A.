package package_c;
import java.util.*;
public class ArrayListDemo{






	public static void main(String...args){
		ArrayList list1 = new ArrayList();// empty list, not type safe.
		ArrayList list2 = new ArrayList(10);// list with 10 empty slots
		ArrayList list3 = new ArrayList(list2);//copt all elements of list 2
		ArrayList<String> list4 = new ArrayList<>();//type safe generic list
		List<String> list5 = new ArrayList<>();// Can store in List type variable 

		list1.add(1); //list1 homogenerous
		list1.add("Hello");
		list1.add(Boolean.TRUE);

		System.out.println(list1);

		list4.add("hawk");
		boolean five = list4.add("eager");
		list4.add(0,"hoover");
		list4.add("Savvy");
		list4.add("Sailor");
		List<String> listcopy = new ArrayList<>(list4);
		System.out.println("List 4 contains hoover: " + list4.contains("hoover"));
		System.out.println("List 4 equals listcopy: " + list4.equals(listcopy));
		list4.remove("hawk");

		String zero = list4.remove(0);
		String setter = list4.set(0,"Lisa");

		System.out.println(list4);
		System.out.println(setter);

		list4.clear();

		System.out.println("List is empty: " + list4.isEmpty());
		System.out.println("List size: " + list4.size());



	}
}
package package_c;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class Conv{

	public static <T> void demo(List<T> list){
		System.out.println(list);
	}
	public static void demo(String[] arr){
		int i = 0;
		System.out.print("[");
		for (String s : arr) {
			System.out.print(s);
			i++;
			if (i < arr.length) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	public static void main(String... arg){

		List<String> list = new ArrayList<>();
		list.add("My");
		list.add("Name");
		list.add("Is");
		list.add("Max");

		Object[] arrayOb = list.toArray();
		String[] arrayStr = list.toArray(new String[0]);

		demo(list);
		demo(arrayStr);

		String[] birds ={ "hawk","Woodpecker","Eager","Kiwi"};
		List<String> list2 = Arrays.asList(birds);// constant size array
		birds[0] = "new";
		demo(list2);
		String changed = list2.set(0,"Test");
		demo(birds);
		System.out.println("Changed: " +  changed + " to " + birds[0]);

		ArrayList<String> resizable = new ArrayList<>();//way to make resizable
		Collections.addAll(resizable,birds);
		resizable.add("Raven");
		demo(resizable);

		List<Integer> nums = Arrays.asList(1,6,2,8,4);
		Collections.sort(nums);
		demo(nums);

	}
}
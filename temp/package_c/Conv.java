package package_c;
import java.util.ArrayList;
import java.util.List;
public class Conv{

	public static void demo(List<String> list){
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
		System.out.print("]");
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

	}
}
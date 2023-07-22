package package_c;
import java.util.*;

public class Convertor{
	public static void print(String[] arr,List<String> list){
		for (int i = 0;i < arr.length ;i++ ) {

			System.out.print("[" + arr[i] + "],");	
		}
		System.out.println("\n" + list);
	}
	public static void main(String...args){

		// List<String> list = new ArrayList<>();
		// list.add("hawk");
		// list.add("eager");
		// list.add("tacker");

		// String[] stringList = list.toArray(new String[0]);

		// for (String str: stringList ) {
		// 	System.out.print(" [" + str + "] ");

		// }

		//back to List

		String[] list2 = {"doll","boll","poll","roll"};
		List<String> list3 = Arrays.asList(list2);
		System.out.println(list3.size());
		list3.set(1,"test");
		list2[0] = "new";

		print(list2,list3);


		List<String>list4 = Arrays.asList("Max","Markes");//Varargs 
		List<Integer> list5 = Arrays.asList(4,2,7,1,9,3);
		Collections.sort(list5);
		System.out.println(list5);
	}
}
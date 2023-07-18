package package_c;
import java.util.Arrays;
public class ArraysDemo{


	private static int[] a , b;//creates two arrays of int
	private static int c[], d; // creates  c[] array of ints, int variable d

	//ways of declaration 

	private static int[] one = new int[3];// defoult values 0
	private static int[] two = new int[]{1,2,3};//size dont need if we provide data
	private static int[] three ={1,2,3};// we already write type of array on left side.

	public static void print(int... arr){
		System.out.println("Filling array");
		for (int i = 0;i < arr.length ;i++ ) {
			arr[i] = i;
		}
		System.out.println("Printing array");
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	public static  <T> void print_sorted(T[] arr){


		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
	public static void main(String...args){
		//print(one);

		Integer[] list = {5,3,1,3,4,7,3,8,9};
		String[] str = {"harry","whells","dwayn","brody","tommy"};
		
		Arrays.sort(list);
		Arrays.sort(str);
		print_sorted(list);
		print_sorted(str);

		System.out.println(Arrays.binarySearch(list,7));//array must be sorted
		
		

	}
}
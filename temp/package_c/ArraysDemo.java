package package_c;

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
	public static void main(String...args){
		print(one);

	}
}
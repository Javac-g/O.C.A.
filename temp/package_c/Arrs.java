package package_c;
import java.util.*;
public class Arrs{




	public static  void first_loop(int[][] arr){

		for (int i = 0; i < arr.length ;i++ ) {

			System.out.println("\nArray N: " + i);

			for (int j = 0;j < arr[i].length ; j++ ) {

				System.out.print(arr[i][j] + " ");
			}
		}
	}

	public static void second_loop(int[][] arr){
		for (int[] x: arr ) {
			for (int y: x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
	public static void mixed_loop(int[][] arr){
		for (int i = 0; i < arr.length ;i++ ) {
			for(int x : arr[i]){
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String...args){
		int[][] twoD = new int[3][];
		twoD[0] = new int[2];
		twoD[1] = new int[3];
		twoD[2] = new int[1];

		twoD[0][0] = 9;
		twoD[0][1] = 4;

		twoD[1][0] = 2;
		twoD[1][1] = 1;
		twoD[1][2] = 5;

		twoD[2][0] = 3;

		// first_loop(twoD);
		// second_loop(twoD);
		//mixed_loop(twoD);
		
	}
}
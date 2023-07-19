package package_c;
public class Tree{

	public static void print_triangle(int n ){
		int row,ast;
		row = 0;
		ast = 1;
		for (int rows = 0; rows < n-1  ; rows++ ) {

			if (rows %2 == 0 ) {

				 

				continue;
			}
			for (int space = n--; space < n -1 ; space++) {
				System.out.print(" ");
			}
			for (int ast = rows++; ast < n; ast++ ) {
				if (ast % 2 != 0  && ast != n-1) {

					continue;
				}
				if (ast % 2 == 0) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			 
			System.out.println();

		}
	}
	public static void print_reverced_triangle(int rows){
		
	}
	public static void main(String...args){

		print_triangle(30);
		



	}
}
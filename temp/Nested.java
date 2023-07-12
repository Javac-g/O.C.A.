package temp;
public class Nested{

	public static void demo_zero(){
		int[][] list = {{1,2,3}, {4,5,6},{7,8,9}};
		for (int[] x : list ) {
			for (int i = 0;i < x.length ;i++ ) {
				System.out.print(x[i] + " ");
			}
			System.out.println();
		}
	}


	public static void demo_one(){

		int x = 20;

		while(x > 0){

			do {

			x-=2;

			}while(x > 5);

			x--;

			System.out.println(x + "\t");
		}
	}
	public static void demo_two(int value){

		int[][] arr = {{1 , 3, 5 ,7},{3,2,1,8},{9,5,4,6}};

		int x = -1;
		int y = -1;

		OUTER_LOOP: for(int i = 0; i < arr.length; i++){
			INNER_LOOP: for (int j = 0; j < arr[i].length ; j++) {
				if(arr[i][j] == value){
					x = i;
					y = j;
					break OUTER_LOOP;
				}
			}
		}
		if (x == -1 && y == -1) {
			System.out.println("Nothing find");
		}else{
			System.out.println("Finded: " + value + ": [" + x + "] , [ " + y + "]");
		}


	}
	public static void main(String...args){

		//demo_zero();
		//demo_one();
		demo_two(7);
		demo_two(9);
	}
}
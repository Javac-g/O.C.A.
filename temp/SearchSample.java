package temp;
import java.util.*;
public class SearchSample{

	public static void demo_one(){

		List<String> names = Arrays.asList("Max","Viktor","Anna");

		Iterator<String> i;

		for(i = names.iterator(); i.hasNext();){

			String name = i.next();

			System.out.println(name);

		}
	}
	public static void demo_zero(){
		int[][] list = { {1,13,5} , {1,2,5} , {2,7,2} };

		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;

		PARENT_LOOP: for (int i = 0;i < list.length ;i++ ) {
			for (int j = 0; j < list[i].length ;j++ ) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value: " + searchValue + " not found");

		}else{
			System.out.println("Value: " + searchValue + "  found at: [" + positionX + "] [" + positionY + "]" );
		}
	}
	public static void demo_two(){
		int[][] myComplex ={{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for (int[] mySimple: myComplex ) {
				for (int i = 0; i < myComplex.length ; i++) {
				System.out.print(mySimple[i] + "\t");
			}
			System.out.println();
		}
		
			
		
	}
	public static void main(String...args){
		demo_two();
		demo_one();
		demo_zero();





	}



}
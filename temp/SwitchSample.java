package temp;
public class SwitchSample{


	public static void demo_one(){
		FIRST_CHAR_LOOP:for (int i = 1; i <= 4 ;i++ ) {
			for (char c = 'a' ; c <= 'c' ; c++) {
				if (i == 2 ||  c == 'b') {
					continue FIRST_CHAR_LOOP;
				}
				System.out.println("char: [" + c + "], int: [" + i + "]");
			}
		}
	}
	public static void demo_two(){
		FIRST_CHAR_LOOP:for (int i = 1; i <= 4 ;i++ ) {
			for (char c = 'a' ; c <= 'c' ; c++) {
				if (i == 2 ||  c == 'b') {
					continue ;
				}
				System.out.println("char: [" + c + "], int: [" + i + "]");
			}
		}
	}

	public static void main(String... args){

		int x1 = 50, x2 = 75;
		boolean b = x1 >= x2;
		if(b = true) System.out.println("Success");
		else System.out.println("Failure");


	}

}
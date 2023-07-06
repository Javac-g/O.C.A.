public class Main{

	public static void main(String...args){

		int i = 0;

		for(String arg: args){

			System.out.println("[" + i + "] : " + arg);
			i++;// i+=1; i = i + 1;

		}

	}
}
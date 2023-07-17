package package_c;
public class First{
	public static void print(String...args){
		int i = 0;
		for(String x: args){
			System.out.println("[" + i + "]" + ": " + x);
			i++;
		}
	}
	public static void main(String...args){
		print(args);
	}
}
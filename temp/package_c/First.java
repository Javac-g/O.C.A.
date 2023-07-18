package package_c;
public class First{
	public static void demo_one(){
		int[][] list = {{1,3,5}, {6,8,0},{2,4,10}};
		for(int[] x:list){
			for (int i = 0; i < x.length ;i++ ) {
				System.out.print(x[i] + " ");
			}
			System.out.println();
		}
	}
	public static void print(String...args){
		int i = 0;
		for(String x: args){
			System.out.println("[" + i + "]" + ": " + x);
			i++;
		}
	}
	public static void main(String...args){
		demo_one();
	}
}
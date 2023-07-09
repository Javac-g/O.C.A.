package temp;
public class Egg{

	public Egg(){
		number = 5;//6
	}

	public static void main(String... args){//0
		Egg egg = new Egg();//5
		System.out.println(egg.number);//7
	}
	private int number = 3;//1

	{number = 4;}//2

}	
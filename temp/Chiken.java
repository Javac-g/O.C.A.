public class CHiken{

	private String name = "Fluffy";//1

	{
		System.out.println("setting field"); //2
	}
// when all fields and blocks initialised return to constructor
	public CHiken(){
		name = "Tiny";//4
		System.out.println("setting constructor");//5
	}
//when this done  return to  method main 16 line
	public static void main(String...args){//0 STARTED OUR JAVA PROGRAMM HERE
		CHiken mother = new CHiken();//3
		System.out.println(mother.name);//6
	}
	/* resutl will be
	setting field
	setting constructor
	Tiny
	*/
}
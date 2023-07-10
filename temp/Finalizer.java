package temp;
public class Finalizer{

	private static List objects = new ArrayList();

	protected void finalize(){
		objects.add(this);
	}

	public static void main(String...args){
		Finalizer finalizer = new Finalizer();
	}

}
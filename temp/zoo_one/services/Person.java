public class Person{

	private String name;
	private int passw;
	private String msg;
	private boolean logged;

	public Person(String name,int passw){
		this.name = name;
		this.passw = passw;
		logged = true;
		System.out.println("Registered: " + name);
	}

	public String getName(){
		return name;
	}

	public int getPassw(){
		return passw;
	}

	public String getMsg(){
		return msg;
	}

	
}
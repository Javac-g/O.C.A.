import java.util.*;
public class View{

	private static final Scanner scanner = new Scanner(System.in);

	public int print_menu(){
		System.out.println("MESSENGER");
		System.out.println("1 - register");
		System.out.println("2 - login");
		int choose = getNum();
		return choose;
		
		

	}


	public void print_msg(String msg){
		System.out.println(msg);
	}

	public int getNum(){
		return scanner.nextInt();
	} 
	
	public Person login(ArrayList users){

		System.out.println("Enter Nick: ");
		String nick = scanner.next();
		System.out.println("Enter Password");
		int passw = scanner.nextInt();
		
		for (Person x : users ) {
			if (   x.getName().equals(nick) && x.getPassw() == passw ) {
				System.out.println(" logged in " + x.getName());
				return x;
			}else{
				System.out.println(" w r o n g");
			}
			return null;
		}





	}

	

	public Person register(){
		System.out.println("Enter Nick: ");
		String nick = scanner.next();
		System.out.println("Enter Password");
		int passw = scanner.nextInt();
		
		Person person = new Person(nick,passw);
		return person;
		
		
	}

	

}
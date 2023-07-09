package zoo_one;
import java.util.*;
import services.*;
public class Controller{

	private static final Scanner scanner = new Scanner(System.in);
	public void init(){
		
		View view = new View();
		Person current = null; 
		int choose;
		ArrayList<Person> users = new ArrayList<>();


		while(current == null){
			choose = view.print_menu();
			if (choose == 1) {
			current = view.register();
			}else if (choose == 2) {
				current = view.login(users);
			}

		}

		users.add(current);

		boolean chat = true;

		while(chat){
			for (Person x: users ) {
				String msg = x.getName() + "> " + scanner.next();
				System.out.println(msg);
				
			}
		}
		
		




	}
}
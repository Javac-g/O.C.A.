package temp;
public class Mouse{
	static int MAX_LENGTH = 5; // Class variable
	int length;// instance variable 
	public void grow(int inches){ // local variable arg
		if(length < MAX_LENGTH){
			int newSize = length + inches;//local variable 
			length = newSize;
		}
	}
}
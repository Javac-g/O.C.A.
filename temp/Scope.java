public class Scope{


	public void eatIfHungry(boolean hungry){

		if (hungry) {

			int bitesOfCheese = 1;
			
		}

		System.out.println(bitesOfCheese);//Compile error
	}



	public void eatIfHungryNext(boolean hungry){

		if (hungry) {

			int bitesOfCheese = 1;

			{

				boolean tinyBit = true;

				System.out.println(bitesOfCheese);//will work

			}
		}

		System.out.println(tinyBit);//Compile error
	}

	public void eatMore(boolean hungry, int amountOfFood){

		int roomInBelly = 5;// hungry , amountOfFood , roomInBelly  scope for metod ends

		if (hungry) {

			boolean timeToEat = true;// scope to end if block

			while(amountOfFood > 0){

				int amountEaten = 2;// scope to end while block

				roomInBelly = roomInBelly - amountEaten;
			}
		}

		System.out.println(amountOfFood);
	}


	public static void main(String... args){

		String one, two;

		one = new String("a");

		two = new String("b");

		one = two; // links to two, "a" is ready to GC

		String three = one;// links to two 

		one = null
		// b doesnt goes out of scope until end of the method
	}
}
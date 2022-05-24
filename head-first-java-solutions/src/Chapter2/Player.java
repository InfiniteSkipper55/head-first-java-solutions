package Chapter2;

/*
 * This is the class for each Player to make a guess.
 */
public class Player {
	int number = 0;
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}

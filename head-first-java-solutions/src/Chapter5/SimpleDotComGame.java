package Chapter5;

/*
 * This is the driver code from which the game will execute. But there is still one bug is there in the program go to SimpleDorCom class to figure it out.
 */
public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		SimpleDotCom theDotCom = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		int randomNum = (int) (Math.random() * 5);
		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
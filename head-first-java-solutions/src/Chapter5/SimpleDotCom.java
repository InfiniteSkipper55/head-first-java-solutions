package Chapter5;

/*
 * This class contains the logical implementation.
 * The bug : If the input is repeated and it is same as the cell location then at some point it will kill the dot com without even hitting other cells.
 */
public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
package Chapter2;

/*
 * exercise: Be the Compiler
 * Problem A
 */
class TapeDeck {
	boolean canRecord = false;

	void playTape() {
		System.out.println("tape playing");
	}

	void recordTape() {
		System.out.println("tape recording");
	}
}

/*
 * This is the test class.
 */
class TapeDeckTestDrive {
	public static void main(String[] args) {
		TapeDeck t = new TapeDeck(); // The object is not created in the problem so it will give compile time error
										// if it does not exists.
		t.canRecord = true;
		t.playTape();
		if (t.canRecord == true) {
			t.recordTape();
		}
	}
}

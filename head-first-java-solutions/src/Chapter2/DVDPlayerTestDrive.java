package Chapter2;

/*
 * exercise: Be the Compiler
 * Problem B
 */
class DVDPlayer {
	boolean canRecord = false;

	void recordDVD() {
		System.out.println("DVD recording");
	}

//	void playDVD() {
//		System.out.println("DVD playing");
//	}
}

/*
 * This is the test class.
 */
class DVDPlayerTestDrive {
	public static void main(String[] args) {
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
//		d.playDVD();	// The object is calling a method which does not exists so try to not call the method 
						// or implement the method in DVDPlayer class.
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}
}
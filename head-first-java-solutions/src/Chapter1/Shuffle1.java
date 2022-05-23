package Chapter1;

/*
 * exercise: Code Magnets
 */
public class Shuffle1 { // 3
	public static void main(String[] args) {
		int x = 3; // 5
		while (x > 0) { // 7
			if (x > 2) { // 4
				System.out.print("a");
			}
			x = x - 1; // 6
			System.out.print("-");
			if (x == 2) { // 2
				System.out.print("b c");
			}
			if (x == 1) { // 1
				System.out.print("d");
				x = x - 1;
			}
		}
	}
}
//a-b c-d
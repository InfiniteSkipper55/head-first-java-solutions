package Chapter1;

/*
 * Exercise A in Page 21
 */
class A_Exercise1b {
	public static void main(String[] args) {
		int x = 1;
		while (x < 10) {
			if (x > 3) {
				System.out.println("big x");
			}
		}
	}
}
/*
 * The above program will not execute because the "if" condition is not
 * satisfied so it will iterate over the while loop and never shows the output.
 */
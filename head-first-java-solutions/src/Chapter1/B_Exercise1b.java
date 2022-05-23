package Chapter1;

/*
 * Exercise B in Page 21
 */
class B_Exercise1b {
	public static void main(String[] args) {
		int x = 5;
		while (x > 1) {
			x = x - 1;
			if (x < 3) {
				System.out.println("small x");
			}
		}
	}
}
/*
 * The above program gives output:
 * small x
 * small x
 */

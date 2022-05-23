package Chapter1;

/*
 * Exercise C in Page 21
 */
class C_Exercise1b {
	int x = 5;
	while ( x > 1 ) {
		x = x - 1;
		if ( x < 3) {
			System.out.println("small x");
		}
	}
}
/*
 * The above program will not compile because there is no main method in the class C_Exercise1b
 */

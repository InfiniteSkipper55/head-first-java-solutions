package Chapter3;

/*
 * Exercise: BE the compiler at page 63
 * Problem B
 */
class Hobbits {
	String name;

	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];
		// This code will give ArrayIndexOutOfBound Exception to avoid that make sure
		// the array starts from zero and accordingly change the rest of the code.
		int z = -1;
		while (z < 2) {
			z = z + 1;
			h[z] = new Hobbits();
			h[z].name = "bilbo";
			if (z == 1) {
				h[z].name = "frodo";
			}
			if (z == 2) {
				h[z].name = "sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
		}
	}
}
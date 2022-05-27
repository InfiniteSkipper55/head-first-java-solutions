package Chapter4;

/*
 * At page 84, Demonstration of a program which shows what if we do not initialize the instance variables then what we will be the output.
 */
class PoorDog {
	private int size;
	private String name;
	private boolean kind;
	private char c;

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public boolean getKind() {
		return kind;
	}

	public char getC() {
		return c;
	}
}

public class PoorDogTestDrive {
	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is " + one.getName());
		System.out.println("Dog is kind? " + one.getKind());
		System.out.println("Dog is c? " + one.getC());
	}
}
package Chapter4;

/*
 * Exercise : BE the compiler
 * Problem B
 */
class Clock {
	String time;

	void setTime(String t) {
		time = t;
	}

//	Return type must be String then and only it will return a string otherwise it gives compiler error.
	String getTime() {
		return time;
	}
}

/*
 * This is a test class.
 */
class ClockTestDrive {
	public static void main(String[] args) {
		Clock c = new Clock();
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
}
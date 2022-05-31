package Chapter5;

/*
 * Mixed Messages at page 121
 */
class MixFor5 {
	public static void main(String[] args) {
		int x = 0;
		int y = 30;
		for (int outer = 0; outer < 3; outer++) {
			for (int inner = 4; inner > 1; inner--) {
				x = x + 0;	//Here is the blank
				y = y - 2;
				if (x == 6) {
					break;
				}
				x = x + 3;
			}
			y = y - 2;
		}
		System.out.println(x + " " + y);
	}
}

//In line 9, the candidates as an expression and its output are as follows:
//x = x + 3;	54 6
//x = x + 6;	60 10
//x = x + 2;	45 6
//x++;			36 6
//x--;			18 6
//x = x + 0;	6 14
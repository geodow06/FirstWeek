package app;

public class exciting {

	static int rows = 3;
	static int collumns = 3;
	static int[][] store = { { 3, 2, 1 }, { 1, 0, 2 }, { 4, 1, 6 } };
	static int logs = 7;
	static int noOfLogs = 0;

	public static void main(String[] args) {
		begin();
	}

	public static void begin() {
		forLoop();
		while (logs > 0) {
			another();
		}
		forLoop();
	}

	public static void forLoop() {
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < collumns; j++) {
				if (j == collumns - 1) {
					System.out.println(store[i][j]);
				} else {
					System.out.print(store[i][j] + " ");
				}

			}
		}
	}

	public static void another() {
		for (int k = 0; k < rows; k++) {

			for (int l = 0; l < collumns; l++) {
				if (store[k][l] == noOfLogs && logs != 0) {
					store[k][l]++;
					logs--;
				}

			}
		}
		noOfLogs++;
	}

}

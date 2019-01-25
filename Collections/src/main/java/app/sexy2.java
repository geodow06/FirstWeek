package app;

public class sexy2 {

	public static void main(String[] args) {

		int logs = 7;
		int noOfLogs = 0;
		int[][] store = { { 3, 2, 1 }, { 1, 0, 2 }, { 4, 1, 6 } };
		int dimension = 3; 
		boolean printResult = false;
		printStore(dimension, store, printResult);
		addsToStore(dimension, logs, noOfLogs, store);
		printStore(dimension, store, printResult);

	}

	public static void printStore(int dimension, int[][] store, boolean printResult) {

		for (int i = 0; i < dimension; i++) {

			for (int j = 0; j < dimension; j++) {
				if (j == dimension - 1) {
					System.out.println(store[i][j]);
				} else {
					System.out.print(store[i][j] + " ");
				}

			}
		}
	}

	public static int[][] addsToStore(int dimension, int logs, int noOfLogs, int[][] store) {
		while (logs > 0)

		{
			for (int k = 0; k < dimension; k++) {

				for (int l = 0; l < dimension; l++) {
					if (store[k][l] == noOfLogs && logs != 0) {
						store[k][l]++;
						logs--;
					}

				}
			}
			noOfLogs++;
		}

		return store;

	}

}

package app;

public class Sexy {

	public static void main(String[] args) {

		int logs = 7;
		int noOfLogs = 0;
		int[][] store = { { 3, 2, 1 }, { 1, 0, 2 }, { 4, 1, 6 } };
		int dimension = 3; 
		boolean printResult = false; 
		boolean add = true;
		printStore(dimension, logs, noOfLogs, store, printResult, add);
		printStore(dimension, logs, noOfLogs, store, printResult, add);

	}

	public static void printStore(int dimension, int logs, int noOfLogs, int[][] store, boolean printResult, boolean add) {

		for (int i = 0; i < dimension; i++) {

			for (int j = 0; j < dimension; j++) {
				if (j == dimension - 1) {
					System.out.println(store[i][j]);
				} else {
					System.out.print(store[i][j] + " ");
				}

			} 
		printResult=true;
		} 
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
		add=false;
		
		
	}

	
}

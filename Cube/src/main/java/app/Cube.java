package app;

public class Cube {
	static int[][] u = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
	static int[][] f = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
	static int[][] r = { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } };
	static int[][] b = { { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } };
	static int[][] l = { { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 } };
	static int[][] d = { { 6, 6, 6 }, { 6, 6, 6 }, { 6, 6, 6 } };
	static int[][] uNew = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
	static int[][] fNew = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
	static int[][] rNew = { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } };
	static int[][] bNew = { { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } };
	static int[][] lNew = { { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 } };
	static int[][] dNew = { { 6, 6, 6 }, { 6, 6, 6 }, { 6, 6, 6 } };
//	static int[][] fNew2 = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

	public static void main(String[] args) {
		
		adjustLayer(u); 
		adjustLayer(u);
		
//		System.out.println("next turn");
//		adjustFace(f);
//		System.out.println("next turn");
//		adjustFace(f);
//		System.out.println("next turn");
//		adjustFace(f);
	}

	public static void adjustLayer(int[][] x) {
		if (x == u) {
			adjustFace(u);
			adjustRow(lNew, fNew);
			adjustRow(fNew, r);
			adjustRow(r, b);
			adjustRow(b, l);
			adjustRow(l, f);

			printLoop(fNew);
			printLoop(r);
			printLoop(b);
			printLoop(lNew);

		

		} 
//		if (x==f)  
//		{ 
//			
//			adjustRow(lNew, dNew);
//			adjustRow(dNew, r);
//			adjustRow(r, u); 
//			adjustRow(u, l); 
//			adjustRow(l, d);
//			
//			
//			printLoop(dNew);
//			printLoop(r);
//			printLoop(b);
//			printLoop(lNew);
//
//			
//		}

	}

	public static void adjustRow(int[][] z, int[][] y) {
		for (int i = 0; i < 3; i++) {
			z[0][i] = y[0][i];
		}
		
	}
	
	public static void adjustFace(int[][] v) { 
		
		for(int r=0 ; r<3 ; r++ ) { 
			for(int c=0 ; c<3 ; c++) { 
				v[r][c]=v[r][c];
			} 
		}
	}
//	  for(int i=0; i<arr[0].length; i++){
//	        for(int j=arr.length-1; j>=0; j--){
//	            newArray[i][j] = arr[j][i];
//	        }
//	
//		}
		
	
	
	public static void printLoop(int[][] g) {
		for (int j = 0; j < 3; j++) {

			for (int k = 0; k < 3; k++) {
				if (k == 3 - 1) {
					System.out.println(g[j][k]);
				} else {
					System.out.print(g[j][k] + " ");

				}

			}
		}
		System.out.println();
	}

	public static void setCube() {
		// u=uNew;
		// fNew=f;
		// f=fNew;
		// r=rNew;
		// b=bNew;
		// l=lNew;
		// d=dNew;
	}

}

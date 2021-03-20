
public class Exercise1 {
	
	public static void main(String[] args) {
		Exercise1 exercise1 = new Exercise1();
		
		// exercise1.printBidimensionalArray(exercise1.exercicio1a());
		// exercise1.printBidimensionalArray(exercise1.exercicio1b());
		// exercise1.printBidimensionalArray(exercise1.exercicio1c());
		exercise1.printBidimensionalArray(exercise1.exercicio1d());
	}
	
	public void printBidimensionalArray(int[][] bidimensionalArray) {
		for (int i = 0; i < bidimensionalArray.length; i++) {
			for (int j = 0; j < bidimensionalArray[i].length; j++) {
				System.out.print(bidimensionalArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * a) Crie um método chamado exercicio1a, que retorna o array de inteiros abaixo:
 	 * 0 1 2 3 4 5 6 7 8 9
  	 * 0 1 2 3 4 5 6 7 8 9
	 * 0 1 2 3 4 5 6 7 8 9
	 */
	public int[][] exercicio1a() {
		
		int[][] bidimensionalArray = new int[3][10];
		
		for (int i = 0; i < bidimensionalArray.length; i++) {
			for (int j = 0; j < bidimensionalArray[i].length; j++) {
				bidimensionalArray[i][j] = j;
			}
		}
		
		return bidimensionalArray;
	}
	
	/*
	 * b) Crie um método chamado exercicio1b, que retorna oarray de inteiros abaixo:
	 * 0 1 4 9 16 25 36 49 64 81     
	 * 0 1 4 9 16 25 36 49 64 81     
	 * 0 1 4 9 16 25 36 49 64 81     
	 * 0 1 4 9 16 25 36 49 64 81     
	 * 0 1 4 9 16 25 36 49 64 81     
	 */
	public int[][] exercicio1b() {
		int[][] bidimensionalArray = new int[5][10];
		
		for (int i = 0; i < bidimensionalArray.length; i++) {
			for (int j = 0; j < bidimensionalArray[i].length; j++) {
				bidimensionalArray[i][j] = j * j;				
			}
		}
		
		return bidimensionalArray;
	}

	/*
	 * c) Crie um método chamado exercicio1c, que retorna oarray de inteiros abaixo:
	 * 0 0 0 0 0 0
	 * 1 1 1 1 1 1
	 * 2 2 2 2 2 2
	 * 3 3 3 3 3 3
	 * 4 4 4 4 4 4
	 * 5 5 5 5 5 5 
	 */
	public int[][] exercicio1c() {
		int [][] bidimensionalArray = new int[6][6];
		
		for (int i = 0; i < bidimensionalArray.length; i++) {
			for (int j = 0; j < bidimensionalArray[i].length; j++) {
				bidimensionalArray[i][j] = i;
			}
		}
		
		return bidimensionalArray;
	}
	
	/*
	 * d) Crie um método chamado exercicio1d, que retorna o array de inteiros abaixo:
	 * -1 -1 -1 -1 -1 -1
	 * 0 0 0 0 0 0
	 * -1 -1 -1 -1 -1 -1
	 * 0 0 0 0 0 0
	 * -1 -1 -1 -1 -1 -1
	 * 0 0 0 0 0 0
	 * -1 -1 -1 -1 -1 -1
	 * 0 0 0 0 0 0
	 * -1 -1 -1 -1 -1 -1 
	 */
	public int[][] exercicio1d() {
		int [][] bidimensionalArray = new int[9][6];
		
		for (int i = 0; i < bidimensionalArray.length; i++) {
			for (int j = 0; j < bidimensionalArray[i].length; j++) {
				bidimensionalArray[i][j] = i % 2 == 0 ? -1 : 0;
			}
		}
		
		return bidimensionalArray;
	}
	
}

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Exercicio2 e2 = new Exercicio2();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz: ");
		int n = scanner.nextInt();
		System.out.println();
		
		e2.printBidimensionalArray(e2.createRandomMatrixOfNxN(n));
	}
	
	public void printBidimensionalArray(int[][] bidimensionalArray) {
		for (int i = 0; i < bidimensionalArray.length; i++) {
			for (int j = 0; j < bidimensionalArray[i].length; j++) {
				System.out.print(bidimensionalArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] createRandomMatrixOfNxN(int n) {
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int)(Math.random() * (100));
			}
		}
		return matrix;
	}
}

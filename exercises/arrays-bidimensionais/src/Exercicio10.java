import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Exercicio10 e10 = new Exercicio10();
		
		Utils.printBidimensionalArray(e10.createCharMatrixFromKeyboard());
	}
	
	public char[][] createCharMatrixFromKeyboard() {
		
		int rows = (int)(1 + Math.random() * (5));
		int cols = (int)(1 + Math.random() * (3));

		char[][] matrix = new char[rows][cols];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Digite um caracter: ");
				matrix[i][j] = scanner.next().charAt(0);
			}
		}
		
		scanner.close();
		return matrix;
	}
}

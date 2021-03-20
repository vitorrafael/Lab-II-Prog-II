import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Exercicio3 e3 = new Exercicio3();
		
		double[][] matrix = e3.createDoubleMatrixOf2x5();
		
		Utils.printBidimensionalArray(matrix);
	}
	
	public double[][] createDoubleMatrixOf2x5() {
		
		Scanner scanner = new Scanner(System.in);
		
		double[][] matrix = new double[2][5];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Digite um valor: ");
				matrix[i][j] = scanner.nextDouble();
				System.out.println();
			}
		}
		
		scanner.close();
		return matrix;
	}
}

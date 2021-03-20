
public class Exercicio11 {

	public static void main(String[] args) {
		Exercicio11 e11 = new Exercicio11();

		int[][] matrix = { { 1, -2, 3, -4, 5 }, { -5, 4, -3, 2, -1 } };

		int[] positiveValues = e11.getPositiveValues(matrix);
		
		for (int i = 0; i < positiveValues.length; i++) {
			System.out.println(positiveValues[i]);
		}
		
	}

	public int[] getPositiveValues(int[][] matrix) {

		int sumOfLengths = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumOfLengths += matrix[i].length;
		}		

		int[] positiveValues = new int[sumOfLengths];

		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] >= 0) positiveValues[counter++] = matrix[i][j];
			}
		}
		
		int[] finalPositiveValues = new int[counter];
		
		for (int i = 0; i < finalPositiveValues.length; i++) {
			finalPositiveValues[i] = positiveValues[i];
		}

		return finalPositiveValues;
	}
}

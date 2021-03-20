
public class Exercicio9 {
	public static void main(String[] args) {

		Exercicio9 e9 = new Exercicio9();
		double[][] matrix = new double[][] { { 2.5, 5.6, 76.3, 101.0 }, { 7.9, 4.4, 1.0, 101.0 },
				{ 3.4, 21.0, 12.6, 54.3 } };

		double average = e9.getAverageFromMatrix(matrix);
		System.out.println(average);
	}

	public double getAverageFromMatrix(double[][] matrix) {
		double sum = 0.0;
		int counter = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				counter++;
			}
		}

		return sum / counter;
	}
}

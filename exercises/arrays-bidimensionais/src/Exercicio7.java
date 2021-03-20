
public class Exercicio7 {

	public static void main(String[] args) {
		
		Exercicio7 e7 = new Exercicio7();
		double[][] matrix = new double[][] {{2.5, 5.6, 76.3, 101.0},
											{7.9, 4.4, 1.0, 101.0},
											{3.4, 21.0, 12.6, 54.3}};
											
        double highestValue = e7.getHighestValueFromMatrix(matrix);
        System.out.println(highestValue);
	}
	
	public double getHighestValueFromMatrix(double[][] matrix) {
		double highestValue = Double.MIN_VALUE;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				highestValue = matrix[i][j] > highestValue ? matrix[i][j] : highestValue;
			}
		}
		
		return highestValue;
	}
}

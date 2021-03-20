
public class Exercicio6 {

	public static void main(String[] args) {
		Exercicio6 e6 = new Exercicio6();
		
		double[][] matrix = new double[][] {{2.5, 5.6, 76.3, 98.0},
											{7.9, 4.4, 1.0, 19.4},
											{3.4, 21.0, 12.6, 54.3}};
											
        String matrixAsString = e6.matrixToStringWithHyphen(matrix);
        
        System.out.println(matrixAsString);
	}
	
	public String matrixToStringWithHyphen(double[][] matrix) {
		StringBuilder sb = new StringBuilder();
		
		String currentElement;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				currentElement = matrix[i][j] + ( j < matrix[i].length - 1 ? " - " : "");
				sb.append(currentElement);
			}
			sb.append("\n");
		}
		
		return sb.toString();
		
	}
}

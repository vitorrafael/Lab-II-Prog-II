
public class Exercicio8 {

	public static void main(String[] args) {
		Exercicio8 e8 = new Exercicio8();
		
		int[][] matrix = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};
		
		System.out.println(e8.sumElementsOfMatrix(matrix));
	}
	
	public int sumElementsOfMatrix(int[][] matrix) {
		
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		
		return sum;
	}
}

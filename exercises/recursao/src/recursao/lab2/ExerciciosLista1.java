package recursao.lab2;

public class ExerciciosLista1 {
	
	public static void main(String[] args) {
		// imprimeArrayReverso(new int[] {1, 2, 3, 4, 5});
		// System.out.println(somaArrayBidimensional(new double[][] {{1, 2, 3}, {4, 5, 6}, {7, 8 ,9}}));
		// System.out.println(encontraPosicaoMenorValor(new int[]{}));

		// try {
		//     printPrimaryDiagonal(new int[][] {{1, 0, 0}, {0, 2, 0}, {0, 0, 1}});
		// } catch (Exception e) {
		//     e.printStackTrace();
		// }
		
		System.out.println(binaryToDecimal("11010001"));
	}
	
	/*
	 * Crie um método recursivo que imprime uma array recebido por parâmetro de trás para frente
	 */
	private static void imprimeArrayReverso(int[] array) throws IllegalArgumentException {
		if (array == null) throw new IllegalArgumentException();
		imprimeArrayReverso(array, array.length - 1);
	}
	
	private static void imprimeArrayReverso(int[] array, int position) {
		if (position < 0) return;
		System.out.println(array[position]);
		imprimeArrayReverso(array, --position);
	}
	
	/*
	 * Crie um método recursivo que recebe um array bidimensional de double e retorne a soma dos elementos deste array
	 */
	private static double somaArrayBidimensional(double[][] arrayBidimensional) throws IllegalArgumentException {
		if (arrayBidimensional == null) throw new IllegalArgumentException();
		return somaArrayBidimensional(arrayBidimensional, 0, 0);
	}
	
	private static double somaArrayBidimensional(double[][] arrayBidimensional, int i, int j) {
		if (i >= arrayBidimensional.length) return 0;
		if (j >= arrayBidimensional[i].length) return somaArrayBidimensional(arrayBidimensional, i + 1, 0);
		return arrayBidimensional[i][j] + somaArrayBidimensional(arrayBidimensional, i, j + 1);
	}
	
	/*
	 * Crie um método chamado encontraPosicaoMenorValor. Este método deve encontrar a posição do menor valor de um array
	 * de inteiros V (recebido por parâmetro.
	 */
	private static int encontraPosicaoMenorValor(int[] v) throws IllegalArgumentException {
		if (v == null || v.length == 0) throw new IllegalArgumentException();
		return encontraPosicaoMenorValor(v, 0, 1);
	}
	
	private static int encontraPosicaoMenorValor(int[] v, int posicaoMenorValor, int posicaoAtual) {
		if (posicaoAtual >= v.length) return posicaoMenorValor;
		if (v[posicaoAtual] < v[posicaoMenorValor]) {
			posicaoMenorValor = posicaoAtual;
		}
		return encontraPosicaoMenorValor(v, posicaoMenorValor, ++posicaoAtual);
	}
	
	/*
	 * Crie um método recursivo chamado printPrimaryDiagonal, que imprime a diagonal primária de uma matriz qualquer. No método público,
	 * apenas a matriz deve ser passada por parâmetro. Caso não seja uma matriz quadadra lance a exceção do tipo MatrixNotPossibleException
	 */
	private static void printPrimaryDiagonal(int[][] matrix) throws MatrixNotPossibleException, IllegalArgumentException {
		if (matrix == null) throw new IllegalArgumentException();
		if (matrix.length != matrix[0].length) throw new MatrixNotPossibleException();
		printPrimaryDiagonal(matrix, 0);
	}
	
	private static void printPrimaryDiagonal(int[][] matrix, int position) {
		if (position >= matrix.length) return;
		System.out.println(matrix[position][position]);
		printPrimaryDiagonal(matrix, position + 1);
	}
	
	/*
	 * Crie um método recursivo chamado binaryToDecimal que recebe uma String que contém um número em base 2 e retorna um número em base 10.
	 * O valor de entrada deve ter exatamente 8 digitos
	 */
	public static int binaryToDecimal(String base2Number) throws IllegalArgumentException {
		if (base2Number == null || base2Number.length() != 8) throw new IllegalArgumentException();
		return binaryToDecimal(base2Number, base2Number.length() - 1);
	}
	
	private static int binaryToDecimal(String base2Number, int currentPower) {
		if (currentPower < 0) return 0;
		return (base2Number.charAt(base2Number.length() - 1 - currentPower) == '0' ? 0 : (int) Math.pow(2, currentPower)) + binaryToDecimal(base2Number, currentPower - 1);
	}
}

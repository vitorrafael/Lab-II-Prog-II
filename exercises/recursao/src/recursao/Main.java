package recursao;

public class Main {
	
	public static void main(String[] args) {
		// System.out.println(calculateAckermanSequence(4, 2));
		// System.out.println(sumUpToN(50));
		// System.out.println(sumArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		System.out.println(isPalindrome("ana".toCharArray()));
	}
	
	/*
	 * Exercício 4. A Sequência de Ackerman é dada por:
	 * A(m, n) = n + 1, se m = 0
	 * A(m, n) = A(m -1, 1), se m != 0 e n = 0
	 * A(m, n) = A(m - 1, (Am, n - 1)), se m != 0 e n != 0
	 * Sabendo disto, implemente o método A descrito acima
	 */
	private static int calculateAckermanSequence(int m, int n) {
		if (m != 0 && n == 0) return calculateAckermanSequence(m - 1, 1);
		else if (m != 0 && n != 0) return calculateAckermanSequence(m - 1, calculateAckermanSequence(m, n - 1));
		else return n + 1;
	}
	
	/*
	 * Exercício 5: Crie um método recursivo para calcular a soma dos inteiros de 1 a n, sendo n >= 1
	 */
	private static int sumUpToN(int n) throws IllegalArgumentException {
		if (n < 1) throw new IllegalArgumentException();
		return sumUpToN(1, n);
	}
	
	private static int sumUpToN(int currentSum, int n) {
		if (n == 1) return currentSum;
		return currentSum + sumUpToN(currentSum + 1, n - 1);
	}
	
	/*
	 * Exercício 6: Escreva um método recursivo que retorna a soma dos elementos de um array v content t elementos
	 */
	private static int sumArray(int[] v) throws IllegalArgumentException {
		if (v == null) throw new IllegalArgumentException();
		return sumArray(v, v.length);
	}
	
	private static int sumArray(int[] v, int t) {
		if (t < 1) return 0;
		return v[t - 1] + sumArray(v, --t);
	}
	
	/*
	 * Exercício 8: Implemente um método recursivo que verifica se uma palavra é um palindromo
	 */
	public static boolean isPalindrome(char word[]) throws IllegalArgumentException {
		if (word == null) throw new IllegalArgumentException();
		return isPalindrome(word, 0);
	}
	
	private static boolean isPalindrome(char[] word, int i) {
		if (i > word.length / 2) return true;
		return word[i] == word[word.length - 1 - i] ? isPalindrome(word, ++i) : false;
	}
}

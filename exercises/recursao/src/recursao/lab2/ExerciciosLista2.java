package recursao.lab2;

public class ExerciciosLista2 {
	
	public static void main(String[] args) {
		// System.out.println(exercicio1(new int[] {1, 2, 3, 4, 5, 6}, 6));
		
		// int[] primeNumbers = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		// for(int primeNumber : primeNumbers)
		//       System.out.println(exercicio2(primeNumber));
		
		// System.out.println(exercicio3("Hello World"));
		
		// System.out.println(exercicio4(100));
		
		// System.out.println(exercicio7(1, 161451811));
		// System.out.println(exercicio8(6845));
		
		// System.out.println(exercicio9(8128));
		}
	
	/*
	 * Exerício 1: Crie um método recursivo que recebe um array de inteiros e um inteiro N e retorna
	 * verdadeiro caso o inteiro N esteja presente no array, ou falso caso contrário
	 */
	public static boolean exercicio1(int[] array, int number) throws IllegalArgumentException {
		if (array == null || array.length == 0) throw new IllegalArgumentException();
		return exercicio1(array, number, 0);
	}
	
	private static boolean exercicio1(int[] array, int number, int position) {
		if (position >= array.length) return false;
		if (array[position] == number) return true;
		return exercicio1(array, number, position + 1);
	}
	
	/*
	 * Exercicio 2: Crie um método recursivo que recebe um inteiro N por parâmetro e retorna verdadeiro caso
	 * ele seja um número primo e falso caso contrário;
	 */
	public static boolean exercicio2(int number) throws IllegalArgumentException {
		if (number < 0) throw new IllegalArgumentException();
		return (number == 0 || number == 1) ? false : exercicio2(number, (int) Math.sqrt(number), 2);
	}
	
	private static boolean exercicio2(int number, int limit, int currentNumber) {
		if (currentNumber > limit) return true;
		if (number % currentNumber == 0) return false;
		return exercicio2(number, limit, currentNumber + 1);
	}
	
	/*
	 * Exercicio 3: Crie um método recursivo que recebe uma String e retorna uma nova String, que é a String de entrada invertida
	 */
	public static String exercicio3(String s) throws IllegalArgumentException {
		if (s == null || s.length() == 0) throw new IllegalArgumentException();
		return exercicio3(s, s.length() - 1);
	}
	
	private static String exercicio3(String s, int currentPosition) {
		if (currentPosition == 0) return String.valueOf(s.charAt(currentPosition));
		return s.charAt(currentPosition) + exercicio3(s, currentPosition - 1);
	}
	
	/*
	 * Exercício 4: Crie um método recursivo que recebe um inteiro positivo e maior que 0 N e calcula o seguinte:
	 * 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/N
	 */
	public static double exercicio4(int N) throws IllegalArgumentException {
		if (N <= 0) throw new IllegalArgumentException();
		return exercicio4(N, 1);
	}
	
	private static double exercicio4(int N, int currentDivisor) {
		if (currentDivisor == N) return 1.0/currentDivisor;
		return 1.0/currentDivisor + exercicio4(N, currentDivisor + 1);
	}
	
	/*
	 * Execício 5: Crie um método recursivo que retorna verdadeiro caso uma String recebida por parâmetro seja um palíndromo
	 * e falso caso contrário.
	 */
	public static boolean exercicio5(String s) throws IllegalArgumentException {
		if (s == null || s.length() == 0) throw new IllegalArgumentException();
		return exercicio5(s, 0, s.length() - 1);
	}
	
	private static boolean exercicio5(String s, int i, int j) {
		if (i > j) return true;
		return s.charAt(i) == s.charAt(j) ? exercicio5(s, i + 1, j - 1) : false;
	}

	/*
	 * Exercício 6: Crie um método recursivo que recebe um array de String e retorna a quantidade de posições que contém palindromos
	 * neste array.
	 */
	public static int exercicio6(String s) throws IllegalArgumentException {
		if (s == null || s.length() == 0) throw new IllegalArgumentException();
		return exercicio6(s, 0, s.length() - 1);
	}
	
	private static int exercicio6(String s, int i, int j) {
		if (i > j) return 0;
		return (s.charAt(i) == s.charAt(j) ? 1 : 0) + exercicio6(s, i + 1, j - 1);

	}
	
	/*
	 * Exercício 7: Crie um método recursivo que conta quantas vezes um determinado digito positivo D aparece em um inteiro positivo N.
	 * 
	 */
	public static int exercicio7(int D, int N) throws IllegalArgumentException {
		if (D < 0 || N < 0) throw new IllegalArgumentException();
		return exercicio7R(D, N);
	}
	
	private static int exercicio7R(int D, int N) {
		if (N <= 0) return 0;
		return (N % 10 == D ? 1 : 0) + exercicio7R(D, N / 10);
	}
	
	/*
	 * Exercício 8: Crie um método recursivo que recebe um inteiro positivo maior que 0 e retorna a média dos seus digitos.
	 */
	public static double exercicio8(int D) throws IllegalArgumentException {
		if (D <= 0) throw new IllegalArgumentException();
		return exercicio8(D, 0, 0);
	}
	
	private static double exercicio8(int D, int sum, int counter) {
		if (D <= 0) return (double)sum / counter;
		return exercicio8(D / 10, sum + D % 10, counter + 1);
	}
	
	/*
	 * Exercicio 9: Crie um método recursivo que recebe um número inteiro maior que 0 e retorna verdadeiro caso o número seja um número perfeito
	 * e falso caso contrário
	 */
	public static boolean exercicio9(int D) throws IllegalArgumentException {
		if (D <= 0) throw new IllegalArgumentException();
		return exercicio9(D, 0, 1);
	}
	
	private static boolean exercicio9(int D, int sum, int currentDivisor) {
		if (currentDivisor > D / 2) return sum == D;
		return exercicio9(D, sum + (D % currentDivisor == 0 ? currentDivisor : 0), currentDivisor + 1);
	}
}

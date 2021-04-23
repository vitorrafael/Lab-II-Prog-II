
public class MetodosDePesquisa {

	public static void main(String[] args) {
		MetodosDePesquisa metodosDePesquisa = new MetodosDePesquisa();
		System.out.println(metodosDePesquisa.pesquisaSequencialUnord(new int[] {9,  7, 10, 3, 2, 5}, 5));
		System.out.println(metodosDePesquisa.pesquisaSequencialUnord(new int[] {9,  7, 10, 3, 2, 5}, 11));
		
		System.out.println(metodosDePesquisa.pesquisaSequencialOrd(new int[] {1, 2, 4, 5, 8, 9, 10}, 5));
		System.out.println(metodosDePesquisa.pesquisaSequencialOrd(new int[] {1, 2, 4, 5, 8, 9, 10, 12, 25}, 11));
		
		int[] result;
		result = metodosDePesquisa.pesquisaBinariaBidimensionalArray(new int[][] { { 0, 1, 2, 3, 4 }, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14 } }, 11);
		System.out.printf("Row: %d, Column: %d\n", result[0], result[1]);

		result = metodosDePesquisa.pesquisaBinariaBidimensionalArray(new int[][] { { 0, 1, 2, 3, 4 }, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14 } }, 2);
		System.out.printf("Row: %d, Column: %d\n", result[0], result[1]);

		result = metodosDePesquisa.pesquisaBinariaBidimensionalArray(new int[][] { { 0, 1, 2, 3, 4 }, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14 } }, 7);
		System.out.printf("Row: %d, Column: %d\n", result[0], result[1]);

		result = metodosDePesquisa.pesquisaBinariaBidimensionalArray(new int[][] { { 0, 1, 2, 3, 4 }, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14 } }, 16);
		System.out.printf("Row: %d, Column: %d\n", result[0], result[1]);
	}
	
	// Exercicio 1: Faça uma versão recursiva do método de Pesquisa Sequencial para arrays não-ordenados visto em aula.
	private int pesquisaSequencialUnord(int[] array, int element) {
		if (array == null || array.length == 0) return -1;
		return pesquisaSequencialUnord(array, element, 0);
	}

	private int pesquisaSequencialUnord(int[] array, int element, int i) {
		if (i >= array.length) return -1;
		if (array[i] == element) return i;
		
		return pesquisaSequencialUnord(array, element, i + 1);
	}
	
	// Exercício 2: Faça uma versão recursiva do método de Pesquisa Sequencial para arrays ordenados visto em aula.
	private int pesquisaSequencialOrd(int[] array, int element) {
		if (array == null || array.length == 0) return -1;
		return pesquisaSequencialOrd(array, element, 0);
	}
	
	private int pesquisaSequencialOrd(int[] array, int element, int i) {
		if (i >= array.length || array[i] > element) return -1;
		if (array[i] == element) return i;
		return pesquisaSequencialOrd(array, element, i + 1);
	}
	
	// Exercício 3: Faça uma versão do algoritmo de Pesquisa Binária que recebe um array bidimensional ao invés de um array unidimensional.
	private int[] pesquisaBinariaBidimensionalArray(int[][] bidimensionalArray, int element) {
		if (bidimensionalArray == null || bidimensionalArray.length == 0 || bidimensionalArray[0] == null || bidimensionalArray[0].length == 0) return new int[] { -1, -1 };
		
		int inf = 0, sup = (bidimensionalArray.length * bidimensionalArray[0].length) - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			
			int medRow = med / bidimensionalArray[0].length;
			int medColumn = med % bidimensionalArray[0].length;
			
			if (bidimensionalArray[medRow][medColumn] == element) return new int[] { medRow, medColumn };
			
			if (bidimensionalArray[medRow][medColumn] > element) {
				sup = med - 1;
			} else {
				inf = med + 1;
			}
		}
		
		return new int[] { -1, -1 };
	}
}

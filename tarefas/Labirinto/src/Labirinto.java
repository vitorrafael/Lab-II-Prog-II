import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Labirinto {

	private final char FINAL_LABIRINTO = 'D';
	private final char PAREDE = 'X';
	private final char VISITADO = 'V';

	public static void main(String[] args) throws IOException {
		Labirinto labirinto = new Labirinto();
		System.out.println(labirinto.labirinto());
	}

	public char[][] carregaLabirinto(String fileName) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		int lines = Integer.parseInt(bufferedReader.readLine().trim());
		int columns = Integer.parseInt(bufferedReader.readLine().trim());

		char[][] labyrinth = new char[lines][columns];

		for (int i = 0; i < lines; i++) {
			labyrinth[i] = bufferedReader.readLine().toCharArray();
		}

		bufferedReader.close();
		return labyrinth;
	}

	public boolean labirinto() throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome arquivo do labirinto: ");
		String fileName = scanner.nextLine();

		char[][] labirinto = this.carregaLabirinto(fileName);
		return this.labirinto(labirinto, 0, 0);
	}

	private boolean labirinto(char[][] labirinto, int i, int j) {
		if (labirinto[i][j] == FINAL_LABIRINTO) return true;
		labirinto[i][j] = VISITADO;
		
		boolean achouSaida = false;
		if (!achouSaida && i + 1 < labirinto.length && labirinto[i + 1][j] != PAREDE && labirinto[i + 1][j] != VISITADO) {
			achouSaida = labirinto(labirinto, i + 1, j);
		}
		
		if (!achouSaida && i - 1 >= 0 && labirinto[i - 1][j] != PAREDE && labirinto[i - 1][j] != VISITADO) {
			achouSaida = labirinto(labirinto, i - 1, j);
		}

		if (!achouSaida && j + 1 < labirinto[0].length && labirinto[i][j + 1] != PAREDE && labirinto[i][j + 1] != VISITADO) {
			achouSaida = labirinto(labirinto, i, j + 1);
		}
		
		if (!achouSaida && j - 1 >= 0 && labirinto[i][j - 1] != PAREDE && labirinto[i][j - 1] != VISITADO) {
			achouSaida = labirinto(labirinto, i, j - 1);
		}

		return achouSaida;
	}
}

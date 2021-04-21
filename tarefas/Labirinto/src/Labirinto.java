import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Labirinto {

	private final char WALL = 'X';
	private final char EXIT = 'D';
	private final char VISITED = 'V';

	public char[][] carregaLabirinto(String fileName) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		int lines = Integer.parseInt(bufferedReader.readLine().trim());
		int columns = Integer.parseInt(bufferedReader.readLine().trim());

		char[][] labyrinth = new char[lines][columns];

		for (int i = 0; i < lines; i++) {
			String labyrinthLine = bufferedReader.readLine();

			for (int j = 0; j < columns; j++) {
				labyrinth[i][j] = labyrinthLine.charAt(j);
			}
		}

		bufferedReader.close();
		return labyrinth;
	}

	public boolean labirinto() throws IOException {
		String fileName = this.getLabyrinthFileName();
		char[][] labyrinth = this.carregaLabirinto(fileName);
		return this.labirinto(labyrinth, 0, 0);
	}

	private boolean labirinto(char[][] labyrinth, int i, int j) {
		if ((i >= labyrinth.length || i < 0) || (j >= labyrinth[i].length || j < 0))
			return false;
		if (labyrinth[i][j] == VISITED || labyrinth[i][j] == WALL)
			return false;

		if (labyrinth[i][j] == EXIT)
			return true;

		labyrinth[i][j] = VISITED;

		// At each position, we try to go DOWN, UP, RIGHT, LEFT to find the exit
		// (destination)
		int[][] nextPossiblePaths = new int[][] { { i + 1, j }, { i - 1, j }, { i, j + 1 }, { i, j - 1 } };

		boolean foundExit = false;
		for (int[] nextPossiblePath : nextPossiblePaths) {
			int nextI = nextPossiblePath[0], nextJ = nextPossiblePath[1];
			foundExit = labirinto(labyrinth, nextI, nextJ);

			if (foundExit)
				break;
		}

		return foundExit;
	}

	private String getLabyrinthFileName() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do arquivo do labirinto: ");
		String fileName = scanner.nextLine();

		scanner.close();

		return fileName;
	}
}
